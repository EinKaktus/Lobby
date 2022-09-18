package de.kaktus.main.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class Drop implements Listener {

    @EventHandler
    public void onDrop(PlayerDropItemEvent e){
        if (e.getPlayer().getWorld().getName().equals("world")){
            if (e.getItemDrop().getItemStack().getItemMeta().getDisplayName().equals("§aKompass")){
                e.setCancelled(true);
            }
        }
    }
}
