package fr.NS.Labyrinthev2.Generale;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	public Main Instance = new Main(); 
	public Main BukkitInstance = this;
	
	@Override
	public void onLoad() {
		Bukkit.getConsoleSender().sendMessage("§6§m--=---------------------------=--§r §6Labyrinthe §6§m--=---------------------------=--");
		Bukkit.getConsoleSender().sendMessage("§6§m--=---------------------------=--§r    §eLoad    §6§m--=---------------------------=--");
	}
	
	@Override
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage("§6§m--=---------------------------=--§r §6Labyrinthe §6§m--=---------------------------=--");
		Bukkit.getConsoleSender().sendMessage("§6§m--=---------------------------=--§r   §eStart    §6§m--=---------------------------=--");
	}
	
	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("§6§m--=---------------------------=--§r §6Labyrinthe §6§m--=---------------------------=--");
		Bukkit.getConsoleSender().sendMessage("§6§m--=---------------------------=--§r    §eEnd     §6§m--=---------------------------=--");
	}
	
}