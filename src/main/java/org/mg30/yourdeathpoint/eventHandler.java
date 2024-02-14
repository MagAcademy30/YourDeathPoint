package org.mg30.yourdeathpoint;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class eventHandler implements Listener {
    @EventHandler
    public void onPlayerDeathEvent(PlayerDeathEvent event) {
        String deathMessage = YourDeathPoint.getInstance().getConfig().getString("config.deathMessage");
        deathMessage = deathMessage.replace("{position}", "" + event.getPlayer().getLocation().blockX() + " " + event.getPlayer().getLocation().blockY() + " " + event.getPlayer().getLocation().blockZ());
        event.getPlayer().sendMessage(deathMessage);
    }
}
