package net.dbsgameplay.blockbreaker.listener;

import net.dbsgameplay.blockbreaker.guis.UpgradeGui;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class InstantInvListener implements Listener {
  @EventHandler
  public void onInventoryClick(InventoryClickEvent event) {
    if (event.getView().getTitle().equals(ChatColor.GREEN + "Instant Inventory freischalten")) {
      Player player = (Player)event.getWhoClicked();
      ItemStack clickedItem = event.getCurrentItem();
      event.setCancelled(true);
      if (clickedItem == null || clickedItem.getType() == Material.AIR)
        return; 
      if (clickedItem.getType() == Material.BARREL)
        new UpgradeGui(player); 
      if (clickedItem.getType() == Material.PAPER)
        player.sendMessage("In Entwicklung"); 
    } 
  }
}
