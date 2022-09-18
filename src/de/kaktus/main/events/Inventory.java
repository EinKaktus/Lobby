package de.kaktus.main.events;

import de.kaktus.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class Inventory implements Listener {

    @EventHandler
    public void onInv(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();

        if (e.getCurrentItem() == null) return;
        if (!e.getCurrentItem().hasItemMeta()) return;

        if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§aSpawn")){
            p.teleport(Bukkit.getWorld("world").getSpawnLocation());
            e.setCancelled(true);
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§aKompass")){
            e.setCancelled(true);
        }
    }
}
