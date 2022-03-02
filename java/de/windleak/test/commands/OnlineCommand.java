package de.windleak.test.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class OnlineCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String online = String.valueOf(Bukkit.getOnlinePlayers());
        sender.sendMessage("Online players: " + online);
        return false;
    }
}
