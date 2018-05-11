package fr.NS.Labyrinthev2.Labyrinthe;

public class Labyrinthe {
	
	private LabyrintheChunk lc;
	
	public void ReplaceLessUseID(Integer ID1, Integer ID2) {
		Integer n1 = lc.getnbID(ID1);
		Integer n2 = lc.getnbID(ID2);
		if(n1 > n2)
			lc.ReplaceID(ID2, ID1);
		else
			lc.ReplaceID(ID1, ID2);
	}
}
