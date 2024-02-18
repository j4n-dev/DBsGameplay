package net.dbsgameplay.blockbreaker.guis;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;

public class MineGUI {
  public MineGUI(Player player) {
    Inventory inventory = Bukkit.createInventory(null, 45, ChatColor.GRAY + "Mine auswählen");

    HashMap<String, Material> ebenenMap = new HashMap<>();
    ebenenMap.put("Ebene 1", Material.STONE);
    ebenenMap.put("Ebene 2", Material.GRANITE);
    ebenenMap.put("Ebene 3", Material.POLISHED_GRANITE);
    ebenenMap.put("Ebene 4", Material.DIORITE);
    ebenenMap.put("Ebene 5", Material.POLISHED_DIORITE);
    ebenenMap.put("Ebene 6", Material.ANDESITE);
    ebenenMap.put("Ebene 7", Material.POLISHED_ANDESITE);
    ebenenMap.put("Ebene 8", Material.GRASS_BLOCK);
    ebenenMap.put("Ebene 9", Material.DIRT);
    ebenenMap.put("Ebene 10", Material.COARSE_DIRT);
    ebenenMap.put("Ebene 11", Material.PODZOL);
    ebenenMap.put("Ebene 12", Material.COBBLESTONE);
    ebenenMap.put("Ebene 13", Material.OAK_PLANKS);
    ebenenMap.put("Ebene 14", Material.SPRUCE_PLANKS);
    ebenenMap.put("Ebene 15", Material.BIRCH_PLANKS);
    ebenenMap.put("Ebene 16", Material.JUNGLE_PLANKS);
    ebenenMap.put("Ebene 17", Material.ACACIA_PLANKS);
    ebenenMap.put("Ebene 18", Material.DARK_OAK_PLANKS);
    ebenenMap.put("Ebene 19", Material.SAND);
    ebenenMap.put("Ebene 20", Material.RED_SAND);
    ebenenMap.put("Ebene 21", Material.GRAVEL);
    ebenenMap.put("Ebene 22", Material.GOLD_ORE);
    ebenenMap.put("Ebene 23", Material.IRON_ORE);
    ebenenMap.put("Ebene 24", Material.COAL_ORE);
    ebenenMap.put("Ebene 25", Material.OAK_WOOD);
    ebenenMap.put("Ebene 26", Material.SPRUCE_WOOD);
    ebenenMap.put("Ebene 27", Material.BIRCH_WOOD);
    ebenenMap.put("Ebene 28", Material.JUNGLE_WOOD);
    ebenenMap.put("Ebene 29", Material.OAK_LEAVES);
    ebenenMap.put("Ebene 30", Material.SPRUCE_LEAVES);
    ebenenMap.put("Ebene 31", Material.BIRCH_LEAVES);
    ebenenMap.put("Ebene 32", Material.JUNGLE_LEAVES);
    ebenenMap.put("Ebene 33", Material.SPONGE);
    ebenenMap.put("Ebene 34", Material.WET_SPONGE);
    ebenenMap.put("Ebene 35", Material.GLASS);
    ebenenMap.put("Ebene 36", Material.LAPIS_ORE);

    for (int i = 0; i < 36; i++) {
      String ebenenKey = "Ebene " + (i + 1);
      Material material = ebenenMap.get(ebenenKey);
      ItemStack item = new ItemStack(material, 1);
      ItemMeta meta = item.getItemMeta();
      if (meta != null) {
        meta.setDisplayName(ebenenKey.substring(0, 1).toUpperCase() + ebenenKey.substring(1));
        item.setItemMeta(meta);
        inventory.setItem(i, item);
      }
    }

    player.openInventory(inventory);
  }
}
