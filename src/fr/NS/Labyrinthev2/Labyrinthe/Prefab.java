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

public class Prefab {
	
	private int x = 0;
	private int y = 0;
	private int z = 0;
	private int dx = 0;
	private int dy = 0;
	private int dz = 0;
	private ArrayList<Tuple3<Integer, Material, Byte>> blocks = new ArrayList<Tuple3<Integer, Material, Byte>>();
	private Action3<ArrayList<Tuple3<Integer, Material, Byte>>, Location, Random> Generateblock;
	
	public Prefab(LabyrintheGenerator lab){
		
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
	
	public void generate(World w, Random rand) {
		
		if(dx < x) {
			int dxt = x;
			x = dx;
			dx = dxt;
		}
		
		if(dy < y) {
			int dyt = y;
			y = dy;
			
			dy = dyt;
		}
		if(dz < z) {
			int dzt = z;
			z = dz;
			dz = dzt;
		}
		
		for (int i = x; i < dx; i++) {
			for (int j = y; j < dy; j++) {
				for (int k = z; k < dz; k++) {
					Generateblock.run(blocks, new Location(w, i, j, k), rand);
				}
			}
		}
	}
}
