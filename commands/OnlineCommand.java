package de.windleak.test.commands;

import de.windleak.test.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class OnlineCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        sender.sendMessage(Main.getPrefix() + "Online players: " + ChatColor.GREEN + Bukkit.getOnlinePlayers());
        return false;
    }
}
