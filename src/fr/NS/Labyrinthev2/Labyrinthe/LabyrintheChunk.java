package fr.NS.Labyrinthev2.Labyrinthe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class LabyrintheChunk extends LabyrinthePart {

	private HashMap<Short, HashMap<Short, HashMap<Short, LabyrinthePart>>> chunkdata = new HashMap<Short, HashMap<Short, HashMap<Short, LabyrinthePart>>>();
	// x, y, z -> data
	private HashMap<Integer, Integer> sizes = new HashMap<Integer, Integer>();

	public LabyrintheChunk(Short x, Short y, Short z, Short x_size, Short y_size, Short z_size) {
		super(x, y, z);
		super.x_size = x_size;
		super.y_size = y_size;
		super.z_size = z_size;
	}

	public LabyrinthePart GetLabyrinthePart(Short x, Short y, Short z) {
		HashMap<Short, HashMap<Short, LabyrinthePart>> chunkdatalayer = chunkdata.get(x);
		if (chunkdatalayer == null)
			return null;

		HashMap<Short, LabyrinthePart> chunkdataline = chunkdatalayer.get(y);
		if (chunkdataline == null)
			return null;

		LabyrinthePart labyrinthepart = chunkdataline.get(z);
		
		return labyrinthepart; // Warning can return null
	}

	public void SetCase(Short x, Short y, Short z, LabyrinthePart labyrinthepart) {
		HashMap<Short, HashMap<Short, LabyrinthePart>> chunkdatalayer = chunkdata.get(x);
		if (chunkdatalayer == null) {
			chunkdatalayer = new HashMap<Short, HashMap<Short, LabyrinthePart>>();
			chunkdata.put(x, chunkdatalayer);
		}

		HashMap<Short, LabyrinthePart> chunkdataline = chunkdatalayer.get(y);
		if (chunkdataline == null) {
			chunkdataline = new HashMap<Short, LabyrinthePart>();
			chunkdata.put(y, chunkdatalayer);
		}

		chunkdataline.put(z, labyrinthepart);
		labyrinthepart.setLabyrintheChunkparent(this);
		
		if (labyrinthepart instanceof LabyrintheChunk)
			AddAllID(((LabyrintheChunk) labyrinthepart).sizes);
		
		if (labyrinthepart instanceof Case)
			AddID(((Case) labyrinthepart).getGeneratorID());
	}

	public void AddID(Integer ID) {
		if (sizes.containsKey(ID))
			sizes.put(ID, sizes.get(ID) + 1);
		else
			sizes.put(ID, 1);
		
		if (LabyrintheChunkparent != null)
			LabyrintheChunkparent.AddID(ID);
	}
	
	public void AddAllID(HashMap<Integer, Integer> IDs) {
		//TODO
	}
	
	public void RemoveID(Integer ID) {
		
		if (sizes.containsKey(ID)) {
			if (sizes.get(ID) > 1)
				sizes.put(ID, sizes.get(ID) - 1);
			else
				sizes.remove(ID);
		}
		
		if (LabyrintheChunkparent != null)
			LabyrintheChunkparent.RemoveID(ID);
	}
	
	public void RemoveAllID(HashMap<Integer, Integer> IDs) {
		//TODO
	}

	public HashMap<Integer, Integer> getSizes() {
		return sizes;
	}
}
