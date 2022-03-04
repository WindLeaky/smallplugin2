package de.windleak.test.commands;

import de.windleak.test.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MaxplayersCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String max = String.valueOf(Bukkit.getMaxPlayers());
        sender.sendMessage(Main.getPrefix() + "Maximum players on the server: " + ChatColor.GREEN + max);
        return false;
    }
}
