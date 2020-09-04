package me.Spy.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Spy.GameHandler.LobbyState;
import me.Spy.Main.Main;

public class StartCMD implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(p.hasPermission("Perms.Start") || p.isOp()) {
			p.sendMessage(Main.prefix + " §aSpiel gestartet!");
			LobbyState.onGameStart(p);
		} else {
			p.sendMessage(Main.noperms);
		}
		return false;
	}

}
