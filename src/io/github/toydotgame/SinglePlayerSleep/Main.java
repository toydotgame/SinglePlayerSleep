package io.github.toydotgame.SinglePlayerSleep;

/*
 * DEPRECATION NOTICE:
 * As of 2021-08-21, toydotgame/SinglePlayerSleep is deprecated, and will no longer recieve support.
 * The plugin remains in a perfectly functional state, however; and will continue to be distrubuted.
 */

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new SinglePlayerSleep(), this);
		System.out.print("[SinglePlayerSleep] Plugin loaded successfully!");
	}
}
