package de.kaktus.main.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryMoveItemEvent;

public class MoveEvent implements Listener {


    @EventHandler
    public void onMove(InventoryMoveItemEvent e){
        if (e.getItem().getItemMeta().getDisplayName().equals("§aKompass")){
            e.setCancelled(true);
        }
    }
}
