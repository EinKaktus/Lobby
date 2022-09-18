package de.kaktus.main.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlace implements Listener {

    @EventHandler
    public void onPlace(BlockPlaceEvent e){
        Player p = e.getPlayer();
        if (p.getWorld().getName().equals("world")){
            if (p.hasPermission("lobby.build")){
                e.setCancelled(false);
            }else{
                e.setCancelled(true);
            }
        }else{
            e.setCancelled(false);
        }
    }

    @EventHandler
    public void onBreak(BlockBreakEvent e){
        Player p = e.getPlayer();
        if (p.getWorld().getName().equals("world")){
            if (p.hasPermission("lobby.destroy")){

            }else{
                e.setCancelled(true);
            }
        }else{
            e.setCancelled(false);
        }
    }
}
