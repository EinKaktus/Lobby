package de.kaktus.main.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LobbyCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
        if (!(s instanceof Player)){
            return true;
        }
        Player p = (Player)s;
        if (!p.getWorld().getName().equals("world")){
            p.teleport(Bukkit.getWorld("world").getSpawnLocation());
            p.sendMessage("§aDu wurdest teleportiert!");
        }else{
            p.sendMessage("§cDu bist bereits in der Lobby!");
        }
        return false;
    }
}
