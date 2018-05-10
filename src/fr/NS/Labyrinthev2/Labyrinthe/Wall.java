package fr.NS.Labyrinthev2.Labyrinthe;

public class Wall {
	
	private boolean open = true;
	private boolean lock = false;
	private boolean generated = false;
	
	private boolean isDoor = false;
	
	private Case case1;
	private Case case2;

	//delegated auto generated methodes
	
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	public boolean isLock() {
		return lock;
	}
	public void setLock(boolean lock) {
		this.lock = lock;
	}
	public boolean isGenerated() {
		return generated;
	}
	public void setGenerated(boolean generated) {
		this.generated = generated;
	}
	public boolean isDoor() {
		return isDoor;
	}
	public void setDoor(boolean isDoor) {
		this.isDoor = isDoor;
	}
	public Case getCase1() {
		return case1;
	}
	public void setCase1(Case case1) {
		this.case1 = case1;
	}
	public Case getCase2() {
		return case2;
	}
	public void setCase2(Case case2) {
		this.case2 = case2;
	}
}
