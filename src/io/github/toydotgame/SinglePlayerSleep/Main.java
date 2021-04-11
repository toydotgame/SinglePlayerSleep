package io.github.toydotgame.SinglePlayerSleep;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new SinglePlayerSleep(), this);
		System.out.print("[SinglePlayerSleep] Plugin loaded successfully!");
	}
}
