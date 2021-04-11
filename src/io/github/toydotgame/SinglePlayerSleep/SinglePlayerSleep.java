package io.github.toydotgame.SinglePlayerSleep;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class SinglePlayerSleep implements Listener {
	@EventHandler
	public void onPlayerSleep(PlayerBedEnterEvent bedEnterEvent) {
		Thread sleepThread = new Thread() {
			public void run() {
				Player player = bedEnterEvent.getPlayer();
				String playerNameString = player.getName();
				try {
					Thread.sleep(5050); // Singleplayer Minecraft has a 5.05 second delay animation before the time skips to day.
				} catch (InterruptedException e) {}
				World world = Bukkit.getWorld(player.getWorld().getName());
				world.setTime(0);
				Bukkit.broadcastMessage(playerNameString + ChatColor.YELLOW + " went to bed. Sweet Dreams");
			}
		};
		sleepThread.start();
	}
}
