package net.dbsgameplay.blockbreaker.listener;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.event.Listener;
import org.bukkit.inventory.PlayerInventory;

public class VerkaufenListener implements Listener {
  private int countItems(Player player, Material material) {
    int count = 0;
    PlayerInventory inventory = player.getInventory();
    ItemStack[] contents = inventory.getContents();
    for (ItemStack item : contents) {
      if (item != null && item.getType() == material)
        count += item.getAmount(); 
    } 
    return count;
  }
  
  @EventHandler
  public void onInventoryClick(InventoryClickEvent event) {
    if (event.getView().getTitle().equals(ChatColor.GREEN + "Verkaufen")) {
      event.setCancelled(true);
      Player player = (Player)event.getWhoClicked();
      int itemCountS = countItems(player, Material.COBBLESTONE);
      ItemStack clickedItem = event.getCurrentItem();
      if (clickedItem == null || clickedItem.getType() == Material.AIR)
        return; 
      if (clickedItem.getType() == Material.EMERALD) {
        if (itemCountS == 0)
          return; 
        int stone = itemCountS * 3;
        player.getInventory().remove(Material.COBBLESTONE);
        player.sendMessage("[" + ChatColor.GREEN + "+" + ChatColor.WHITE + "] " + stone);
      } 
    } 
  }
}
