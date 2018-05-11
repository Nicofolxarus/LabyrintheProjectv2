package fr.NS.Labyrinthev2.Labyrinthe;

import java.util.Random;

import org.bukkit.World;

public abstract class Prefab {

	protected int x = 0;
	protected int y = 0;
	protected int z = 0;
	protected int dx = 0;
	protected int dy = 0;
	protected int dz = 0;
	
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
		
		overloadgenerate(w, rand);
	}
	
	protected abstract void overloadgenerate(World w, Random rand);
	
}
