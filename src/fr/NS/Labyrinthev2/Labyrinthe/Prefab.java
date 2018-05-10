package fr.NS.Labyrinthev2.Labyrinthe;

import java.util.HashMap;
import java.util.Random;
import java.util.function.Consumer;

import org.bukkit.Material;
import org.bukkit.World;

import fr.NS.Tools.Actions.Action3;
import fr.NS.Tools.Tuples.Tuple2;
import fr.NS.Tools.Tuples.Tuple3;

public class Prefab {
	private int x;
	private int y;
	private int z;
	private int dx;
	private int dy;
	private int dz;
	private HashMap<Integer, Tuple2<Material, Short>> blocks;
	private Action3<HashMap<Integer, Tuple2<Material, Short>>, World, Random> gen;
	
	private Consumer<Tuple3<HashMap<Integer, Tuple2<Material, Short>>, World, Random>> Generateblock;
	

	public Prefab(){
		gen = new Action3<HashMap<Integer,Tuple2<Material,Short>>, World, Random>() {
			
			@Override
			public void run(HashMap<Integer, Tuple2<Material, Short>> arg1, World arg2, Random arg3) {
				//TODO
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
					Generateblock.accept(new Tuple3<HashMap<Integer, Tuple2<Material, Short>>, World, Random>(blocks, w, rand));
				}
			}
		}
	}
}
