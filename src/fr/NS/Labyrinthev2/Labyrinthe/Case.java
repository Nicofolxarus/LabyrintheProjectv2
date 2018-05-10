package fr.NS.Labyrinthev2.Labyrinthe;

import org.bukkit.Location;

public class Case {
	
	private boolean off;

	private Location loc;
	
	private int Numero;
	private int Id;
	private int x;
	private int z;
	
	private Case case_nord;
	private Case case_sud;
	private Case case_est;
	private Case case_ouest;
	
	private Wall wall_nord;
	private Wall walll_sud;
	private Wall wall_est;
	private Wall wall_ouest;

	//delegated auto generated methodes
	
	public boolean isOff() {
		return off;
	}
	public void setOff(boolean off) {
		this.off = off;
	}
	public Location getLoc() {
		return loc;
	}
	public void setLoc(Location loc) {
		this.loc = loc;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public Case getCase_nord() {
		return case_nord;
	}
	public void setCase_nord(Case case_nord) {
		this.case_nord = case_nord;
	}
	public Case getCase_sud() {
		return case_sud;
	}
	public void setCase_sud(Case case_sud) {
		this.case_sud = case_sud;
	}
	public Case getCase_est() {
		return case_est;
	}
	public void setCase_est(Case case_est) {
		this.case_est = case_est;
	}
	public Case getCase_ouest() {
		return case_ouest;
	}
	public void setCase_ouest(Case case_ouest) {
		this.case_ouest = case_ouest;
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
