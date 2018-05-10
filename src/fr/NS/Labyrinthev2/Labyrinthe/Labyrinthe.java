package fr.NS.Labyrinthev2.Labyrinthe;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.World;

public class Labyrinthe {
	
	
	private int seed = -1;		//public set if not generated
	private Random rand;		
	private boolean isGenerate; //public get
	public Prefab wallprefab_north_sud;
	public Prefab wallprefab_ouest_est;
	public Prefab Sol;
	public Prefab Door;
	
	
	public void CreateLabyrinthe(int largeur, int longueur) {

	}
	
	public void GenerateLabyrinthe(World world, Location position) {
		
	}
	
	
	
}
