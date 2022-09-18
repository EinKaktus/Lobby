package de.kaktus.main.events;

import de.kaktus.main.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class Interact implements Listener {

    @EventHandler
    public void onInt(PlayerInteractEvent e){
        Player p = e.getPlayer();

        if (e.hasItem()){
            if (e.getItem().hasItemMeta()){
                if (e.getItem().getItemMeta().getDisplayName().equals("§aKompass")){
                    if (e.getAction() == Action.RIGHT_CLICK_AIR){
                        p.openInventory(Main.compass);
                        e.setCancelled(true);
                    }
                    if (e.getAction() == Action.RIGHT_CLICK_BLOCK){
                        p.openInventory(Main.compass);
                        e.setCancelled(true);
                    }
                }
            }
        }
    }
}
