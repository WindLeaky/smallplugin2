package de.windleak.test.commands;

import de.windleak.test.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class NameCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        String Color= String.valueOf(ChatColor.valueOf(args[1]));

        sender.sendMessage(Main.getPrefix() + ChatColor.GREEN + "Succesfully changed your name to: " + (Color + args[0]));
        player.setDisplayName(String.valueOf(Color + args[0]));
        player.setPlayerListName(Color + args[0]);


        return false;

    }
}
