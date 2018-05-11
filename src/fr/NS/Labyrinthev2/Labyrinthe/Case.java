package fr.NS.Labyrinthev2.Labyrinthe;

import org.bukkit.Location;

public class Case extends LabyrinthePart {

	private boolean off = false;
	public Location loc;

	private int ID;
	private int GeneratorID;

	private Wall wall_nord;
	private Wall walll_sud;
	private Wall wall_est;
	private Wall wall_ouest;
	
	
	
	public Case(Short x, Short y, Short z, Integer ID) {
		super(x, y, z);
		this.ID = ID;
		this.GeneratorID = ID;
	}

	// delegated auto generated methodes

	public boolean isOff() {
		return off;
	}

	public void setOff(boolean off) {
		this.off = off;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getGeneratorID() {
		return GeneratorID;
	}

	public void setGeneratorID(Integer generatorID) {
		LabyrintheChunkparent.RemoveID(GeneratorID);
		LabyrintheChunkparent.AddID(generatorID);
		GeneratorID = generatorID;
	}
	
	public void setGeneratorIDnoUpdate(Integer generatorID) {
		GeneratorID = generatorID;
	}

	public Wall getWall_nord() {
		return wall_nord;
	}

	public void setWall_nord(Wall wall_nord) {
		this.wall_nord = wall_nord;
	}

	public Wall getWalll_sud() {
		return walll_sud;
	}

	public void setWalll_sud(Wall walll_sud) {
		this.walll_sud = walll_sud;
	}

	public Wall getWall_est() {
		return wall_est;
	}

	public void setWall_est(Wall wall_est) {
		this.wall_est = wall_est;
	}

	public Wall getWall_ouest() {
		return wall_ouest;
	}

	public void setWall_ouest(Wall wall_ouest) {
		this.wall_ouest = wall_ouest;
	}
}
