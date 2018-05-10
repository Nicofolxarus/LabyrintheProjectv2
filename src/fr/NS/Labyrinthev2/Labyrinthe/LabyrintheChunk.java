package fr.NS.Labyrinthev2.Labyrinthe;

import java.util.HashMap;
import java.util.List;

public class LabyrintheChunk {
	
	private HashMap<Short, HashMap<Short, HashMap<Short, Case>>> chunkdata; //x, y, z -> darta
	private List<Integer> size;
	private Short x_size;
	private Short y_size;
	private Short z_size;	
}
