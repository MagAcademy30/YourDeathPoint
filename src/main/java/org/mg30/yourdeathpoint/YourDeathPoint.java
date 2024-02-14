package org.mg30.yourdeathpoint;

import org.bukkit.plugin.java.JavaPlugin;

public final class YourDeathPoint extends JavaPlugin {
    private static YourDeathPoint instance;

    public static YourDeathPoint getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;

        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new eventHandler(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
