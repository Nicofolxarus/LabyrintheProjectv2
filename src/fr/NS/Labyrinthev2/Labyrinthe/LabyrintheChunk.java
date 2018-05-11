package fr.NS.Labyrinthev2.Labyrinthe;

import java.util.HashMap;
import java.util.List;

public class LabyrintheChunk {
	
	private HashMap<Short, HashMap<Short, HashMap<Short, Case>>> chunkdata = new HashMap<Short, HashMap<Short, HashMap<Short, Case>>>(); //x, y, z -> darta
	private List<Integer> sizes;
	private Short x_size;
	private Short y_size;
	private Short z_size;
	
	public Case GetCase(Short x, Short y, Short z) {
		HashMap<Short, HashMap<Short, Case>> chunkdatalayer = chunkdata.get(x);
		if(chunkdatalayer == null) {
			chunkdatalayer = new HashMap<Short, HashMap<Short, Case>>();
			chunkdata.put(x, chunkdatalayer);
		}
		HashMap<Short, Case> chunkdataline = chunkdatalayer.get(y);
		if(chunkdataline == null) {
			chunkdataline = new HashMap<Short, Case>();
			chunkdata.put(y, chunkdatalayer);
		}
		Case c = chunkdataline.get(z);
		if (c == null) {
			c = new Case();
			chunkdataline.put(z, c);
		}
		return c;
	}
	
	public void SetCase(Short x, Short y, Short z, Case c) {
		HashMap<Short, HashMap<Short, Case>> chunkdatalayer = chunkdata.get(x);
		if(chunkdatalayer == null) {
			chunkdatalayer = new HashMap<Short, HashMap<Short, Case>>();
			chunkdata.put(x, chunkdatalayer);
		}
		HashMap<Short, Case> chunkdataline = chunkdatalayer.get(y);
		if(chunkdataline == null) {
			chunkdataline = new HashMap<Short, Case>();
			chunkdata.put(y, chunkdatalayer);
		}
		chunkdataline.put(z, c);
	}
	
	public List<Integer> getSizes() {
		return sizes;
	}
	public Short getX_size() {
		return x_size;
	}
	public Short getY_size() {
		return y_size;
	}
	public Short getZ_size() {
		return z_size;
	}
}
