package de.kaktus.main.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class Food implements Listener {

    @EventHandler
    public void onFood(FoodLevelChangeEvent e){
        Player p = (Player) e.getEntity();
        if (e.getEntity() instanceof Player){
            if (p.getWorld().getName().equals("world")){
                e.setCancelled(true);
            }else{
                e.setCancelled(false);
            }
        }
    }
}
