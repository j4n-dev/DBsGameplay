package net.dbsgameplay.blockbreaker.listener;

import net.dbsgameplay.blockbreaker.guis.MineGUI;
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
    if (event.getView().getTitle().equals(ChatColor.GRAY + "Mine auswählen-Seite 1")) {
      event.setCancelled(true);
      Player player = (Player)event.getWhoClicked();
      ItemStack clickedItem = event.getCurrentItem();
      if (clickedItem == null || clickedItem.getType() == Material.AIR)
        return; 
      Material material = event.getCurrentItem().getType();
      if (material == Material.SPECTRAL_ARROW){
        MineGUI.openSecondPage(player);
      }else if (material == Material.TIPPED_ARROW){
        MineGUI.openFirstPage(player);
      } else if (material == Material.STONE) {
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
      } else if (material == Material.DIRT) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-9 betreten!");
      } else if (material == Material.COARSE_DIRT) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-10 betreten!");
      } else if (material == Material.PODZOL) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-11 betreten!");
      } else if (material == Material.COBBLESTONE) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-12 betreten!");
      } else if (material == Material.OAK_PLANKS) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-13 betreten!");
      } else if (material == Material.SPRUCE_PLANKS) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-14 betreten!");
      } else if (material == Material.BIRCH_PLANKS) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-15 betreten!");
      } else if (material == Material.JUNGLE_PLANKS) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-16 betreten!");
      } else if (material == Material.ACACIA_PLANKS) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-17 betreten!");
      } else if (material == Material.DARK_OAK_PLANKS) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-18 betreten!");
      } else if (material == Material.SAND) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-19 betreten!");
      } else if (material == Material.RED_SAND) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-20 betreten!");
      } else if (material == Material.GRAVEL) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-21 betreten!");
      } else if (material == Material.GOLD_ORE) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-22 betreten!");
      } else if (material == Material.IRON_ORE) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-23 betreten!");
      } else if (material == Material.COAL_ORE) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-24 betreten!");
      } else if (material == Material.OAK_WOOD) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-25 betreten!");
      } else if (material == Material.SPRUCE_WOOD) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-26 betreten!");
      } else if (material == Material.BIRCH_WOOD) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-27 betreten!");
      } else if (material == Material.JUNGLE_WOOD) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-28 betreten!");
      } else if (material == Material.OAK_LEAVES) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-29 betreten!");
      } else if (material == Material.SPRUCE_LEAVES) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-30 betreten!");
      } else if (material == Material.BIRCH_LEAVES) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-31 betreten!");
      } else if (material == Material.JUNGLE_LEAVES) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-32 betreten!");
      } else if (material == Material.SPONGE) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-33 betreten!");
      } else if (material == Material.WET_SPONGE) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-34 betreten!");
      } else if (material == Material.GLASS) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-35 betreten!");
      } else if (material == Material.LAPIS_ORE) {
        player.sendMessage(ChatColor.GREEN + "Du hast Mine-36 betreten!");
      }
    }
    if (event.getView().getTitle().equals(ChatColor.GRAY + "Mine auswählen-Seite 2")) {
      event.setCancelled(true);
      Player player = (Player)event.getWhoClicked();
      ItemStack clickedItem = event.getCurrentItem();
      if (clickedItem == null || clickedItem.getType() == Material.AIR)
        return;
      Material material = event.getCurrentItem().getType();
      if (material == Material.SPECTRAL_ARROW){
        MineGUI.openSecondPage(player);
      }else if (material == Material.TIPPED_ARROW){
        MineGUI.openFirstPage(player);
      } else if (material == Material.LAPIS_ORE) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-36 betreten!");
    } else if (material == Material.LAPIS_BLOCK) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-37 betreten!");
    } else if (material == Material.SANDSTONE) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-38 betreten!");
    } else if (material == Material.CHISELED_SANDSTONE) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-39 betreten!");
    } else if (material == Material.SMOOTH_SANDSTONE) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-40 betreten!");
    } else if (material == Material.WHITE_WOOL) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-41 betreten!");
    } else if (material == Material.ORANGE_WOOL) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-42 betreten!");
    } else if (material == Material.MAGENTA_WOOL) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-43 betreten!");
    } else if (material == Material.LIGHT_BLUE_WOOL) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-44 betreten!");
    } else if (material == Material.YELLOW_WOOL) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-45 betreten!");
    } else if (material == Material.LIME_WOOL) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-46 betreten!");
    } else if (material == Material.PINK_WOOL) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-47 betreten!");
    } else if (material == Material.GRAY_WOOL) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-48 betreten!");
    } else if (material == Material.LIGHT_GRAY_WOOL) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-49 betreten!");
    } else if (material == Material.CYAN_WOOL) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-50 betreten!");
    } else if (material == Material.PURPLE_WOOL) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-51 betreten!");
    } else if (material == Material.BLUE_WOOL) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-52 betreten!");
    } else if (material == Material.BROWN_WOOL) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-53 betreten!");
    } else if (material == Material.GREEN_WOOL) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-54 betreten!");
    } else if (material == Material.RED_WOOL) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-55 betreten!");
    } else if (material == Material.BLACK_WOOL) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-56 betreten!");
    } else if (material == Material.GOLD_BLOCK) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-57 betreten!");
    } else if (material == Material.IRON_BLOCK) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-58 betreten!");
    } else if (material == Material.BRICKS) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-59 betreten!");
    } else if (material == Material.BOOKSHELF) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-60 betreten!");
    } else if (material == Material.MOSSY_COBBLESTONE) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-61 betreten!");
    } else if (material == Material.OBSIDIAN) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-62 betreten!");
    } else if (material == Material.DIAMOND_ORE) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-63 betreten!");
    } else if (material == Material.DIAMOND_BLOCK) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-64 betreten!");
    } else if (material == Material.FARMLAND) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-65 betreten!");
    } else if (material == Material.REDSTONE_ORE) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-66 betreten!");
    } else if (material == Material.REDSTONE_LAMP) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-67 betreten!");
    } else if (material == Material.SNOW) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-68 betreten!");
    } else if (material == Material.ICE) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-69 betreten!");
    } else if (material == Material.SNOW_BLOCK) {
      player.sendMessage(ChatColor.GREEN + "Du hast Mine-70 betreten!");
    }
  }
}}
