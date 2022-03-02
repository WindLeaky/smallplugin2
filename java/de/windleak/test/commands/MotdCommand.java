package de.windleak.test.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MotdCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String motd = Bukkit.getMotd();
        sender.sendMessage("Message of the day: " + motd);
        return false;
    }
}
