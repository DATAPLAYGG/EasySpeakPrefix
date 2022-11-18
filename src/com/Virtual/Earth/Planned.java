package com.Virtual.Earth;

import com.Virtual.listener.playerListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Planned extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new playerListener(), this );
    getLogger().info("\"插件已启用") ;
        // plugin started
    }

    @Override
    public void onDisable() {
        getLogger().info("\"插件已关闭") ;
        // plugin stopped
    }
}
