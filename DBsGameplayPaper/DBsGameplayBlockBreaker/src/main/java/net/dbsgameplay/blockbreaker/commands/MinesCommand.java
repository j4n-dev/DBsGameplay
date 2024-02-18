package net.dbsgameplay.blockbreaker.commands;

import net.dbsgameplay.blockbreaker.guis.MineGUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MinesCommand implements CommandExecutor {
  public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
    if (!(sender instanceof Player))
      return false; 
    Player player = (Player)sender;
    new MineGUI(player);
    return false;
  }
}
