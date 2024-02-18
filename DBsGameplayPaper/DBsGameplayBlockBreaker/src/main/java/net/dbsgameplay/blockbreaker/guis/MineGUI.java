package net.dbsgameplay.blockbreaker.guis;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MineGUI {
  public MineGUI(Player player) {
    Inventory inventory = Bukkit.createInventory(null, 27, ChatColor.GRAY + "Mine auswählen");
    ItemStack mine1 = new ItemStack(Material.STONE, 1);
    ItemMeta meta1 = mine1.getItemMeta();
    meta1.setDisplayName("Mine 1");
    mine1.setItemMeta(meta1);
    inventory.setItem(0, mine1);
    ItemStack mine2 = new ItemStack(Material.GRANITE, 1);
    ItemMeta meta2 = mine2.getItemMeta();
    meta2.setDisplayName("Mine 2");
    mine2.setItemMeta(meta2);
    inventory.setItem(1, mine2);
    ItemStack mine3 = new ItemStack(Material.POLISHED_GRANITE, 1);
    ItemMeta meta3 = mine3.getItemMeta();
    meta3.setDisplayName("Mine 3");
    mine3.setItemMeta(meta3);
    inventory.setItem(2, mine3);
    ItemStack mine4 = new ItemStack(Material.DIORITE, 1);
    ItemMeta meta4 = mine4.getItemMeta();
    meta4.setDisplayName("Mine 4");
    mine4.setItemMeta(meta4);
    inventory.setItem(3, mine4);
    ItemStack mine5 = new ItemStack(Material.POLISHED_DIORITE, 1);
    ItemMeta meta5 = mine5.getItemMeta();
    meta5.setDisplayName("Mine 5");
    mine5.setItemMeta(meta5);
    inventory.setItem(4, mine5);
    ItemStack mine6 = new ItemStack(Material.ANDESITE, 1);
    ItemMeta meta6 = mine6.getItemMeta();
    meta6.setDisplayName("Mine 6");
    mine6.setItemMeta(meta6);
    inventory.setItem(5, mine6);
    ItemStack mine7 = new ItemStack(Material.POLISHED_ANDESITE, 1);
    ItemMeta meta7 = mine7.getItemMeta();
    meta7.setDisplayName("Mine 7");
    mine7.setItemMeta(meta7);
    inventory.setItem(6, mine7);
    ItemStack mine8 = new ItemStack(Material.GRASS_BLOCK, 1);
    ItemMeta meta8 = mine8.getItemMeta();
    meta8.setDisplayName("Mine 8");
    mine8.setItemMeta(meta8);
    inventory.setItem(7, mine8);
    player.openInventory(inventory);
  }
}
