package de.windleak.test.commands;

import de.windleak.test.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class OperatorsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String operators = String.valueOf(Bukkit.getOperators());
        sender.sendMessage(Main.getPrefix() + "Operators of the server: " + ChatColor.GREEN+ operators);
        return false;
    }
}
