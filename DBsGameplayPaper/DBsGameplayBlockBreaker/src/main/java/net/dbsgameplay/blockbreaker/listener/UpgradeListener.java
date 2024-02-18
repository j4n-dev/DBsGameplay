package net.dbsgameplay.blockbreaker.listener;

import net.dbsgameplay.blockbreaker.guis.FortuneGUI;
import net.dbsgameplay.blockbreaker.guis.InstantInvGui;
import net.dbsgameplay.blockbreaker.guis.PickaxeUpgradeGUI;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.event.Listener;

public class UpgradeListener implements Listener {
  @EventHandler
  public void onInventoryClick(InventoryClickEvent event) {
    if (event.getView().getTitle().equals(ChatColor.BLUE + "Upgraden")) {
      event.setCancelled(true);
      Player player = (Player)event.getWhoClicked();
      ItemStack clickedItem = event.getCurrentItem();
      if (clickedItem == null || clickedItem.getType() == Material.AIR)
        return; 
      if (clickedItem.getType() == Material.EXPERIENCE_BOTTLE)
        new FortuneGUI(player); 
      if (clickedItem.getType() == Material.CHEST)
        new InstantInvGui(player); 
      if (clickedItem.getType() == Material.ACACIA_BUTTON)
        new PickaxeUpgradeGUI(player); 
    } 
  }
}
