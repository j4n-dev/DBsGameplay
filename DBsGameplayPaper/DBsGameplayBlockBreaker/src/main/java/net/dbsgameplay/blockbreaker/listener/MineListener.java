package net.dbsgameplay.blockbreaker.listener;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class MineListener implements Listener {
  @EventHandler
  public void onInventoryClick(InventoryClickEvent event) {
    if (event.getView().getTitle().equals(ChatColor.GRAY + "Mine auswählen")) {
      Player player = (Player)event.getWhoClicked();
      ItemStack clickedItem = event.getCurrentItem();
      event.setCancelled(true);
      if (clickedItem == null || clickedItem.getType() == Material.AIR)
        return; 
      Material material = event.getCurrentItem().getType();
      if (material == Material.STONE) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-1 betreten!");
      } else if (material == Material.GRANITE) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-2 betreten!");
      } else if (material == Material.POLISHED_GRANITE) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-3 betreten!");
      } else if (material == Material.DIORITE) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-4 betreten!");
      } else if (material == Material.POLISHED_DIORITE) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-5 betreten!");
      } else if (material == Material.ANDESITE) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-6 betreten!");
      } else if (material == Material.POLISHED_ANDESITE) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-7 betreten!");
      } else if (material == Material.GRASS_BLOCK) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-8 betreten!");
      } 
    } 
  }
}
