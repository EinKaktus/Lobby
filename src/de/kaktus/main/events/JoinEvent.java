package de.kaktus.main.events;

import de.kaktus.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        p.teleport(Bukkit.getWorld("world").getSpawnLocation());
        p.sendTitle("§aWillkommen auf", "§2Meinem Server!");
        e.setJoinMessage("§2" + p.getName() + "§a hat die Lobby betreten!");
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e){
        Player p = e.getPlayer();
        e.setQuitMessage("§4" + p.getName() + "§c hat den Server verlassen!");
    }


    @EventHandler
    public void onJoin2(PlayerJoinEvent e){
        Player p = e.getPlayer();
        ItemStack compass = new ItemStack(Material.NETHER_STAR);
        ItemMeta compassMeta = compass.getItemMeta();
        compassMeta.setDisplayName("§aKompass");
        compass.setItemMeta(compassMeta);

        p.getInventory().setItem(4, compass);
    }
}
