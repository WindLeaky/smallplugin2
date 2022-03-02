package de.windleak.test;

import de.windleak.test.commands.*;
import de.windleak.test.listeners.JoinListener;
import de.windleak.test.listeners.QuitListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().fine( "Plugin wird aktiviert");
        listenerRegistration();
        commandRegistration();
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().fine( "Plugin wird deaktiviert");
    }

    private void listenerRegistration(){
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new JoinListener(),this);
        pluginManager.registerEvents(new QuitListener(),this);

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
        getCommand("version").setExecutor(new VersionCommand());
    }
}

//TODO: Commands banlist, online, ip und operators überarbeiten
