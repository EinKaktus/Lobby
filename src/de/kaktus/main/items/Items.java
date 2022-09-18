package de.kaktus.main.items;

import de.kaktus.main.Main;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Items {

    public static void items(){

        ItemStack spawn = new ItemStack(Material.NETHER_STAR);
        ItemMeta spawnMeta = spawn.getItemMeta();
        spawnMeta.setDisplayName("§aSpawn");
        spawnMeta.setLore(Arrays.asList("§7Klicke hier um teleportiert zu werden!"));
        spawn.setItemMeta(spawnMeta);

        Main.compass.setItem(13, spawn);
    }
}
