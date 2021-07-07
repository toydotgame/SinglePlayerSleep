package io.github.toydotgame.SinglePlayerSleep;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class SinglePlayerSleep implements Listener {
	
	// TODO: Only execute `sleepThread.start()` if the player count is > 1.
	@EventHandler
	public void onPlayerSleep(PlayerBedEnterEvent bedEnterEvent) {
		Thread sleepThread = new Thread() {
			public void run() {
				Player player = bedEnterEvent.getPlayer();
				String playerNameString = player.getName();
				try {
					Thread.sleep(5050); // Singleplayer Minecraft has a 5.05 second delay animation before the time skips to day.
				} catch (InterruptedException e) {}
				if(player.isSleeping()) { // Checks to make sure the player is still online and in bed.
					World world = Bukkit.getWorld(player.getWorld().getName());
					world.setStorm(false);
					world.setTime(0);
					Bukkit.broadcastMessage(playerNameString + ChatColor.YELLOW + " went to bed. Sweet Dreams");
				}
			}
		};
		sleepThread.start();
	}
}
