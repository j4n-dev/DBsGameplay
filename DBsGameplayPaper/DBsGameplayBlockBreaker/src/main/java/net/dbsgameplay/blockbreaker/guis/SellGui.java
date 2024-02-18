package net.dbsgameplay.blockbreaker.guis;

import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SellGui {
  public SellGui(Player player) {
    Inventory inventory = Bukkit.createInventory(null, 27, ChatColor.GREEN + "Verkaufen");
    ItemStack sella = new ItemStack(Material.EMERALD, 1);
    ItemMeta metaa = sella.getItemMeta();
    metaa.setDisplayName(ChatColor.GREEN + "Alles Verkaufen");
    metaa.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_UNBREAKABLE });
    ArrayList<String> lorea = new ArrayList<>();
    metaa.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
    metaa.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ENCHANTS });
    metaa.setLore(lorea);
    sella.setItemMeta(metaa);
    inventory.setItem(13, sella);
    player.openInventory(inventory);
  }
}
