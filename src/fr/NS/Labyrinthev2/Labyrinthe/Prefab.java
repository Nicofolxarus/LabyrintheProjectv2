package fr.NS.Labyrinthev2.Labyrinthe;

import java.util.HashMap;

import org.bukkit.Material;

public class Prefab {
	int x;
	int y;
	int z;
	int dx;
	int dy;
	int dz;
	HashMap<Integer, Blocks> blocks;
	
	public class Blocks{
		public Material material;
		public byte data;
	}
}
