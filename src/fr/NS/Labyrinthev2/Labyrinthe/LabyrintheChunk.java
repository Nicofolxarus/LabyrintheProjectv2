package fr.NS.Labyrinthev2.Labyrinthe;

import java.util.HashMap;
import java.util.Map.Entry;

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

	public void SetLabyrinthePart(Short x, Short y, Short z, LabyrinthePart labyrinthepart) {
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
		AddID(ID, 1);
	}

	public void AddID(Integer ID, Integer nb) {
		if (sizes.containsKey(ID))
			sizes.put(ID, sizes.get(ID) + nb);
		else
			sizes.put(ID, nb);

		if (LabyrintheChunkparent != null)
			LabyrintheChunkparent.AddID(ID, nb);
	}

	public void AddAllID(HashMap<Integer, Integer> IDs) {
		for (Entry<Integer, Integer> e : IDs.entrySet())
			AddID(e.getKey(), e.getValue());
	}

	public void RemoveID(Integer ID) {
		RemoveID(ID, 1);
	}

	public void RemoveID(Integer ID, Integer nb) {

		if (sizes.containsKey(ID)) {
			if (sizes.get(ID) > nb)
				sizes.put(ID, sizes.get(ID) - nb);
			else
				sizes.remove(ID);
		}

		if (LabyrintheChunkparent != null)
			LabyrintheChunkparent.RemoveID(ID, nb);
	}

	public void RemoveAllID(HashMap<Integer, Integer> IDs) {
		for (Entry<Integer, Integer> e : IDs.entrySet())
			RemoveID(e.getKey(), e.getValue());
	}

	public void ReplaceAllID(Integer oldID, Integer newID) {
		if (sizes.containsKey(oldID)) {
			for (HashMap<Short, HashMap<Short, LabyrinthePart>> layermaps : chunkdata.values()) {
				for (HashMap<Short, LabyrinthePart> linemaps : layermaps.values()) {
					for (LabyrinthePart lp : linemaps.values()) {
						if (lp instanceof Case) {
							Case clp = (Case) lp;
							if (clp.getGeneratorID() == oldID)
								clp.setGeneratorIDnoUpdate(newID);
						}
						if (lp instanceof LabyrintheChunk)
							((LabyrintheChunk) lp).ReplaceAllID(oldID, newID);
					}
				}
			}
			sizes.put(newID, sizes.get(oldID) + sizes.get(newID));
			sizes.remove(oldID);	
		}
	}

	public int getnbID(Integer id) {
		if (sizes.containsKey(id))
			return sizes.get(id);
		else
			return 0;
	}
}
