package me.Spy.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Spy.Main.Main;
import me.Spy.Settings.General;

public class DebugCOPCMD implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		General.Cop.add(p);
		return false;
	}

}
