package de.windleak.test;

import de.windleak.test.commands.*;
import de.windleak.test.listeners.ChatListener;
import de.windleak.test.listeners.JoinListener;
import de.windleak.test.listeners.QuitListener;
import de.windleak.test.utils.Config;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        new Config();

        Bukkit.getLogger().fine( "Plugin wird aktiviert");

        listenerRegistration();
        commandRegistration();
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().fine( "Plugin wird deaktiviert");
    }


    public static String getPrefix() {
        return ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "TestWindLeak" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY;
    }



    private void listenerRegistration(){
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new JoinListener(),this);
        pluginManager.registerEvents(new QuitListener(),this);
        pluginManager.registerEvents(new ChatListener(), this);
    }

    private void commandRegistration(){
        getCommand( "date").setExecutor(new DateCommand());
        getCommand( "hi").setExecutor(new HiCommand());
        getCommand( "motd").setExecutor(new MotdCommand());
        getCommand( "banlist").setExecutor(new BanlistCommand());
        getCommand("online").setExecutor(new OnlineCommand());
        getCommand("ip").setExecutor(new IpCommand());
        getCommand("maxplayers").setExecutor(new MaxplayersCommand());
        getCommand("operators").setExecutor(new OperatorsCommand());
        getCommand("vanish").setExecutor(new VanishCommand());
        getCommand("unvanish").setExecutor(new UnvanishCommand());
        getCommand("name").setExecutor(new NameCommand());
        getCommand("namereset").setExecutor(new NameResetCommand());
        getCommand("backpack").setExecutor(new BackpackCommand());
        getCommand("health").setExecutor(new HealthCommand());
        getCommand("food").setExecutor(new FoodCommand());
        getCommand("level").setExecutor(new LevelCommand());
    }
}


