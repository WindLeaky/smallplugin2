package de.windleak.test.commands;

import de.windleak.test.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LevelCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length == 1){
            if(sender instanceof Player){
                Player player = (Player) sender;
                player.setLevel(Integer.parseInt(args[0]));
                sender.sendMessage(Main.getPrefix() + ChatColor.GREEN + "Succesfully changed your level to: " + args[0] + ".");
            } else{
                sender.sendMessage(Main.getPrefix() + ChatColor.RED + "This command is for players only.");
            }
        } else {
            sender.sendMessage(Main.getPrefix() + ChatColor.RED + "Please use the command like this: " + ChatColor.GRAY + "/level [NUMBER_OF_LEVEL]");
        }



        return false;
    }
}
