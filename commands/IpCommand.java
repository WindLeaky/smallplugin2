package de.windleak.test.commands;

import de.windleak.test.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class IpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String ip = Bukkit.getIp();
        sender.sendMessage(Main.getPrefix() + "Ip des Servers: " + ChatColor.GREEN + ip);
        return false;
    }
}
