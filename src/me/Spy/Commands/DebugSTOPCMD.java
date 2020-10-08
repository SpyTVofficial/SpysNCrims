package me.Spy.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Spy.GameHandler.GameEnd;
import me.Spy.Settings.General;

public class DebugSTOPCMD implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		GameEnd.stopGame();
		return false;
	}

}
