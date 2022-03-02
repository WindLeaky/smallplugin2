package de.windleak.test.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class IpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String ip = Bukkit.getIp();
        sender.sendMessage("Ip des Servers: " + ip);
        return false;
    }
}