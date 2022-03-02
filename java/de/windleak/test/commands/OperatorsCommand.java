package de.windleak.test.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class OperatorsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String operators = String.valueOf(Bukkit.getOperators());
        sender.sendMessage("Operators of the server: " + operators);
        return false;
    }
}
