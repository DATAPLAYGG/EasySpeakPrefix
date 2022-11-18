package com.Virtual.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class playerListener implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        boolean opFlag = player.isOp();
        String message = event.getMessage();
        String name = player.getName();
        event.setCancelled(true);
        String format = "§b" + name + " §e>>> " +message;
        if (opFlag) {
            format = "§c[Staff]" + format;
        }
        //if player is op plugin will send this message
        Bukkit.broadcastMessage(format);
        //in global

    }

}
