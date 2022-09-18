package de.kaktus.main;

import de.kaktus.main.commands.LobbyCMD;
import de.kaktus.main.events.*;
import de.kaktus.main.items.Items;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Inventory compass;

    @Override
    public void onEnable() {
        compass = Bukkit.createInventory(null, 9*3, "§2§lNavigator");

        getCommand("lobby").setExecutor(new LobbyCMD());
        getCommand("hub").setExecutor(new LobbyCMD());
        getCommand("l").setExecutor(new LobbyCMD());

        Bukkit.getPluginManager().registerEvents(new DamageEvent(), this);
        Bukkit.getPluginManager().registerEvents(new Food(), this);
        Bukkit.getPluginManager().registerEvents(new JoinEvent(), this);
        Bukkit.getPluginManager().registerEvents(new BlockPlace(), this);
        Bukkit.getPluginManager().registerEvents(new de.kaktus.main.events.Inventory(), this);
        Bukkit.getPluginManager().registerEvents(new Interact(), this);
        Bukkit.getPluginManager().registerEvents(new MoveEvent(), this);
        Bukkit.getPluginManager().registerEvents(new Drop(), this);

        Items.items();
    }
}
