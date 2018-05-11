package fr.NS.Labyrinthev2.Labyrinthe;

public abstract class LabyrinthePart {

	protected LabyrintheChunk LabyrintheChunkparent;

	public Short x_pos;
	public Short y_pos;
	public Short z_pos;

	protected Short x_size = 1;
	protected Short y_size = 1;
	protected Short z_size = 1;

	public LabyrinthePart(Short x, Short y, Short z) {
		x_pos = x;
		y_pos = y;
		z_pos = z;
	}

	public LabyrinthePart GetNorth() {
		if (LabyrintheChunkparent == null)
			return null;
		else
			return LabyrintheChunkparent.GetLabyrinthePart((short) (x_pos + 1), y_pos, z_pos);
	}

	public LabyrinthePart GetSouth() {
		if (LabyrintheChunkparent == null)
			return null;
		else
			return LabyrintheChunkparent.GetLabyrinthePart((short) (x_pos - 1), y_pos, z_pos);
	}

	public LabyrinthePart GetWest() {
		if (LabyrintheChunkparent == null)
			return null;
		else
			return LabyrintheChunkparent.GetLabyrinthePart(x_pos, y_pos, (short) (z_pos + 1));
	}

	public LabyrinthePart GetEst() {
		if (LabyrintheChunkparent == null)
			return null;
		else
			return LabyrintheChunkparent.GetLabyrinthePart(x_pos, y_pos, (short) (z_pos - 1));
	}

	public LabyrinthePart GetUp() {
		if (LabyrintheChunkparent == null)
			return null;
		else
			return LabyrintheChunkparent.GetLabyrinthePart(x_pos, (short) (y_pos + 1), z_pos);
	}

	public LabyrinthePart GetDown() {
		if (LabyrintheChunkparent == null)
			return null;
		else
			return LabyrintheChunkparent.GetLabyrinthePart(x_pos, (short) (y_pos - 1), z_pos);
	}

	public long getAbsoluteCoordX() {
		if (LabyrintheChunkparent == null)
			return 0;
		else
			return (LabyrintheChunkparent.getAbsoluteCoordX() + x_pos) * x_size;
	}

	public long getAbsoluteCoordY() {
		if (LabyrintheChunkparent == null)
			return 0;
		else
			return (LabyrintheChunkparent.getAbsoluteCoordX() + y_pos) * y_size;
	}

	public long getAbsoluteCoordZ() {
		if (LabyrintheChunkparent == null)
			return 0;
		else
			return (LabyrintheChunkparent.getAbsoluteCoordX() + z_pos) * z_size;
	}

	public LabyrintheChunk getLabyrintheChunkparent() {
		return LabyrintheChunkparent;
	}

	public void setLabyrintheChunkparent(LabyrintheChunk labyrintheChunkparent) {
		LabyrintheChunkparent = labyrintheChunkparent;
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
