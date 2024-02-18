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
  public static void openFirstPage(Player player) {
    Inventory inventory1 = Bukkit.createInventory(null, 45, ChatColor.GRAY + "Mine auswählen-Seite 1");

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
      if (material != null) {
        ItemStack item = new ItemStack(material, 1);
        ItemMeta meta = item.getItemMeta();
        if (meta != null) {
          meta.setDisplayName(ebenenKey.substring(0, 1).toUpperCase() + ebenenKey.substring(1));
          item.setItemMeta(meta);
          inventory1.setItem(i, item);
        }
      }
    }
    ItemStack weiter = new ItemStack(Material.SPECTRAL_ARROW, 1);
    ItemMeta metaw = weiter.getItemMeta();
    if (metaw != null) {
      metaw.setDisplayName(ChatColor.BLUE + "Nächste Seite");
      weiter.setItemMeta(metaw);
      inventory1.setItem(44, weiter);
    }

    player.openInventory(inventory1);
  }


  public static void openSecondPage(Player player) {
    Inventory inventory2 = Bukkit.createInventory(null, 45, ChatColor.GRAY + "Mine auswählen-Seite 2");

    HashMap<String, Material> ebenenMap = new HashMap<>();
    ebenenMap.put("Ebene 35", Material.GLASS);
    ebenenMap.put("Ebene 36", Material.LAPIS_ORE);
    ebenenMap.put("Ebene 37", Material.LAPIS_BLOCK);
    ebenenMap.put("Ebene 38", Material.SANDSTONE);
    ebenenMap.put("Ebene 39", Material.CHISELED_SANDSTONE);
    ebenenMap.put("Ebene 40", Material.SMOOTH_SANDSTONE);
    ebenenMap.put("Ebene 41", Material.WHITE_WOOL);
    ebenenMap.put("Ebene 42", Material.ORANGE_WOOL);
    ebenenMap.put("Ebene 43", Material.MAGENTA_WOOL);
    ebenenMap.put("Ebene 44", Material.LIGHT_BLUE_WOOL);
    ebenenMap.put("Ebene 45", Material.YELLOW_WOOL);
    ebenenMap.put("Ebene 46", Material.LIME_WOOL);
    ebenenMap.put("Ebene 47", Material.PINK_WOOL);
    ebenenMap.put("Ebene 48", Material.GRAY_WOOL);
    ebenenMap.put("Ebene 49", Material.LIGHT_GRAY_WOOL);
    ebenenMap.put("Ebene 50", Material.CYAN_WOOL);
    ebenenMap.put("Ebene 51", Material.PURPLE_WOOL);
    ebenenMap.put("Ebene 52", Material.BLUE_WOOL);
    ebenenMap.put("Ebene 53", Material.BROWN_WOOL);
    ebenenMap.put("Ebene 54", Material.GREEN_WOOL);
    ebenenMap.put("Ebene 55", Material.RED_WOOL);
    ebenenMap.put("Ebene 56", Material.BLACK_WOOL);
    ebenenMap.put("Ebene 57", Material.GOLD_BLOCK);
    ebenenMap.put("Ebene 58", Material.IRON_BLOCK);
    ebenenMap.put("Ebene 59", Material.BRICK);
    ebenenMap.put("Ebene 60", Material.BOOKSHELF);
    ebenenMap.put("Ebene 61", Material.MOSS_BLOCK);
    ebenenMap.put("Ebene 62", Material.OBSIDIAN);
    ebenenMap.put("Ebene 63", Material.DIAMOND_ORE);
    ebenenMap.put("Ebene 64", Material.DIAMOND_BLOCK);
    ebenenMap.put("Ebene 65", Material.FARMLAND);
    ebenenMap.put("Ebene 66", Material.REDSTONE_ORE);
    ebenenMap.put("Ebene 67", Material.REDSTONE_LAMP);
    ebenenMap.put("Ebene 68", Material.SNOW);
    ebenenMap.put("Ebene 69", Material.ICE);
    ebenenMap.put("Ebene 70", Material.SNOW_BLOCK);


    for (int i = 0; i < 70; i++) {
      String ebenenKey = "Ebene " + (i + 35);
      Material material = ebenenMap.get(ebenenKey);
      if (material != null) {
        ItemStack item = new ItemStack(material, 1);
        ItemMeta meta = item.getItemMeta();
        if (meta != null) {
          meta.setDisplayName(ebenenKey.substring(0, 1).toUpperCase() + ebenenKey.substring(1));
          item.setItemMeta(meta);
          inventory2.setItem(i, item);
        }
      }
    }

    ItemStack weiter = new ItemStack(Material.SPECTRAL_ARROW, 1);
    ItemMeta metaw = weiter.getItemMeta();
    if (metaw != null) {
      metaw.setDisplayName(ChatColor.BLUE + "Nächste Seite");
      weiter.setItemMeta(metaw);
      inventory2.setItem(44, weiter);
    }


    ItemStack zuruck = new ItemStack(Material.TIPPED_ARROW, 1);
    ItemMeta metaz = zuruck.getItemMeta();
    if (metaz != null) {
      metaz.setDisplayName(ChatColor.BLUE + "Seite zurückgehen");
      zuruck.setItemMeta(metaz);
      inventory2.setItem(36, zuruck);
    }

    player.openInventory(inventory2);
  }
}
