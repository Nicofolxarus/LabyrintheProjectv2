package fr.NS.Labyrinthev2.Labyrinthe;

import java.util.List;
import java.util.Queue;
import java.util.Random;

import org.bukkit.Location;
import org.bukkit.World;

import fr.NS.Tools.Actions.Action;

public class LabyrintheGenerator {

	private int seed = -1; // public set if not generated
	private Random rand;
	private boolean isGenerationStarted;
	private boolean isGenerate; // public get
	public Prefab wallprefab_north_sud;
	public Prefab wallprefab_ouest_est;
	public Prefab Sol;
	public Prefab Door;

	private Thread MainThread;
	private List<Thread> ThreadPool;
	private Queue<Action> ReSyncTask;
	
	public void CreateLabyrinthe(int largeur, int longueur) {
		
	}

	public void GenerateLabyrinthe(World world, Location position) {

	}

	public int getSeed() {
		return seed;
	}

	public void setSeed(int seed) {
		if(!isGenerationStarted) {
			this.seed = seed;	
		}
	}

	public boolean isGenerate() {
		return isGenerate;
	}
}
