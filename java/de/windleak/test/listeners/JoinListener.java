package de.windleak.test.listeners;


import de.windleak.test.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class JoinListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        player.sendMessage(Main.getPrefix() + ChatColor.GOLD + "Hello and welcome!");
        if(player.isOp()){
            event.setJoinMessage(Main.getPrefix() + ChatColor.RED + player.getName() + ChatColor.WHITE + " joined the server!");
        }
        else {
            event.setJoinMessage(Main.getPrefix() + ChatColor.GREEN + player.getName() + ChatColor.WHITE + " joined the server!");
        }
    }

}
