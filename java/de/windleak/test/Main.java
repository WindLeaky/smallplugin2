package de.windleak.test;

import de.windleak.test.commands.DateCommand;
import de.windleak.test.commands.HiCommand;
import de.windleak.test.commands.SayCommand;
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
        getCommand( "say").setExecutor(new SayCommand());
    }
}
