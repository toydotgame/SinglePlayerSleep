package io.github.toydotgame.SinglePlayerSleep;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class SPS implements Listener {
	@EventHandler
	public void onPlayerSleep(PlayerBedEnterEvent bedEnterEvent){
		Player player = bedEnterEvent.getPlayer();
		String playerNameString = player.getName();
		try {
			Thread.sleep(5050);
		} catch (InterruptedException e) {} // try/catch loops pain me...
		World world = Bukkit.getWorld(player.getLocation().getWorld().getName());
		world.setTime(0);
		Bukkit.broadcastMessage(playerNameString + ChatColor.YELLOW + " slept.");
	}
}
