package de.windleak.test.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {
    @EventHandler
    public void onChat(AsyncPlayerChatEvent event){

        Player player = event.getPlayer();

        if(player.isOp()){
            event.setFormat(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "Operator" + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_RED + "%1$s" + ChatColor.DARK_GRAY +  ": " + ChatColor.WHITE + "%2$s");
        }

        else {
            event.setFormat(ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Player" + ChatColor.DARK_GRAY +  "] " + ChatColor.GREEN + "%1$s" + ChatColor.DARK_GRAY + ": " + ChatColor.GRAY + "%2$s");
        }

        event.setMessage((player.isOp() ? ChatColor.translateAlternateColorCodes('&', event.getMessage()) : event.getMessage()));
    }
}
