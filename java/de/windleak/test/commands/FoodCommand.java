package de.windleak.test.commands;

import de.windleak.test.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FoodCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            player.setFoodLevel(20);
            sender.sendMessage(Main.getPrefix() + ChatColor.GREEN + "Succesfully changed your food level to maximum.");
        } else{
            sender.sendMessage(Main.getPrefix() + ChatColor.RED + "This command is for players only.");
        }


        return false;
    }
}
