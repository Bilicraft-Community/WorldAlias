package com.bilicraft.worldalias;

import me.clip.placeholderapi.PlaceholderHook;
import org.bukkit.plugin.java.JavaPlugin;

public final class WorldAlias extends JavaPlugin {
    private PlaceholderHook expansion;

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        expansion = new PlaceHolderHook(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
