package de.windleak.test.commands;

import de.windleak.test.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class UnvanishCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        Player player = (Player) sender;
        player.setInvisible(false);
        sender.sendMessage(Main.getPrefix() + ChatColor.GREEN + "You're now unvanished.");
        return false;
    }
}
