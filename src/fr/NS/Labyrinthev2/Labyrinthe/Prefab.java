package fr.NS.Labyrinthev2.Labyrinthe;

import java.util.List;
import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;

import fr.NS.Tools.Actions.Action3;
import fr.NS.Tools.Tuples.Tuple3;

public class Prefab {
	private int x;
	private int y;
	private int z;
	private int dx;
	private int dy;
	private int dz;
	private List<Tuple3<Integer, Material, Byte>> blocks;
	private Action3<List<Tuple3<Integer, Material, Byte>>, Location, Random> Generateblock;

	public Prefab(){
		Generateblock = new Action3<List<Tuple3<Integer, Material, Byte>>, Location, Random>() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void run(List<Tuple3<Integer, Material, Byte>> map, Location loc, Random rand) {
				int size = 0;
				for(Tuple3<Integer, Material, Byte> tuple3 : map) {
					size += tuple3.getItem1();	
				}
				Tuple3<Integer, Material, Byte> tuple3 = new Tuple3<Integer, Material, Byte>(0, Material.AIR, (byte) 0);
				int r = rand.nextInt(size);
				for(int j = 0; j < map.size(); j++) {
					if(r > map.get(j).getItem1() && r < map.get(j + 1).getItem1()) {
						tuple3 = map.get(j);
					}
				}
				Block b = loc.getWorld().getBlockAt(loc);
				b.setType(tuple3.getItem2());
				b.setData(tuple3.getItem3());
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
