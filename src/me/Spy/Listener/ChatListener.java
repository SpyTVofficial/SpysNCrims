package me.Spy.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

import me.Spy.Main.Main;
import me.Spy.Settings.General;

public class ChatListener implements Listener {
	
	@EventHandler
	public static void onChat(PlayerChatEvent e) {
		Player p = e.getPlayer();
		if(General.Cop.contains(p)) {
			e.setFormat(Main.cop + p.getDisplayName() + ": " + e.getMessage());
		} else {
			e.setFormat("§a" + p.getDisplayName() + ": " + e.getMessage());
		}
	}

}
