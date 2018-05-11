package fr.NS.Labyrinthev2.Labyrinthe;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;

import fr.NS.Tools.Actions.Action0;
import fr.NS.Tools.Actions.Action3;
import fr.NS.Tools.Tuples.Tuple3;

public class BasiquePrefab extends Prefab {
	
	private ArrayList<Tuple3<Integer, Material, Byte>> blocks = new ArrayList<Tuple3<Integer, Material, Byte>>();
	private Action3<ArrayList<Tuple3<Integer, Material, Byte>>, Location, Random> Generateblock;
	
	public BasiquePrefab(LabyrintheGenerator lab, ArrayList<Tuple3<Integer, Material, Byte>> blocks){
		
		Generateblock = new Action3<ArrayList<Tuple3<Integer, Material, Byte>>, Location, Random>() {
			
			@Override
			public void run(ArrayList<Tuple3<Integer, Material, Byte>> map, Location loc, Random rand) {
				int size = 0;
				for(Tuple3<Integer, Material, Byte> tuple3 : map) {
					size += tuple3.getItem1();	
				}
				
				Tuple3<Integer, Material, Byte> tuple3 = new Tuple3<Integer, Material, Byte>(0, Material.AIR, (byte) 0);
				
				int r = rand.nextInt(size);
				for(int j = 0; j < map.size(); j++) {
					r -= map.get(j).getItem1();
					if(r < 0) {
						tuple3 = map.get(j);
					}
				}
				
				final Tuple3<Integer, Material, Byte> t3 = tuple3;
				
				lab.getSyncTask().add(new Action0() {
					@SuppressWarnings("deprecation")
					@Override
					public void run() {
						Block b = loc.getWorld().getBlockAt(loc);
						b.setType(t3.getItem2());
						b.setData(t3.getItem3());
					}
				});
			}
		};
	}

	@Override
	protected void overloadgenerate(World w, Random rand) {
		for (int i = x; i < dx; i++) {
			for (int j = y; j < dy; j++) {
				for (int k = z; k < dz; k++) {
					Generateblock.run(blocks, new Location(w, i, j, k), rand);
				}
			}
		}
	}
}
