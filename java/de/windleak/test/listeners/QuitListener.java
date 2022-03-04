package de.windleak.test.listeners;

import de.windleak.test.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitListener implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent event){
        Player player = event.getPlayer();
        if(player.isOp()){
            event.setQuitMessage(Main.getPrefix() + ChatColor.RED + player.getName() + ChatColor.WHITE + " left the server!");
        }
        else {
            event.setQuitMessage(Main.getPrefix() + ChatColor.GREEN + player.getName() + ChatColor.WHITE + " left the server!");
        }
    }

}
