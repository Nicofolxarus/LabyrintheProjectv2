package fr.NS.Labyrinthev2.Labyrinthe;

import java.util.List;
import java.util.Queue;
import java.util.Random;

import org.bukkit.Location;
import org.bukkit.World;

import fr.NS.Tools.Actions.Action0;

public class LabyrintheGenerator {

	private Integer seed = -1; // public set if not generated
	private Random rand;
	private Boolean isGenerationStarted;
	private Boolean isGenerate; // public get
	public BasiquePrefab wallprefab_north_sud;
	public BasiquePrefab wallprefab_ouest_est;
	public BasiquePrefab Sol;
	public BasiquePrefab Door;

	private Thread MainThread;
	private List<Thread> ThreadPool;
	private Queue<Action0> SyncTask;
	
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

	public Queue<Action0> getSyncTask() {
		return SyncTask;
	}
}
