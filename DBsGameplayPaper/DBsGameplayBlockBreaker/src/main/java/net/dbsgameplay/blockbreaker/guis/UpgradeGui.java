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

public class UpgradeGui {
  public UpgradeGui(Player player) {
    Inventory inventory = Bukkit.createInventory(null, 27, ChatColor.BLUE + "Upgraden");
    ItemStack sells = new ItemStack(Material.ACACIA_BUTTON, 1);
    ItemMeta meta = sells.getItemMeta();
    meta.setDisplayName(ChatColor.BLUE + "Pickaxe upgraden");
    meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_UNBREAKABLE });
    ArrayList<String> lore = new ArrayList<>();
    meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
    meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ENCHANTS });
    meta.setLore(lore);
    sells.setItemMeta(meta);
    inventory.setItem(11, sells);
    ItemStack fortune = new ItemStack(Material.EXPERIENCE_BOTTLE, 1);
    ItemMeta metaf = sells.getItemMeta();
    metaf.setDisplayName(ChatColor.GREEN + "Fortune freischalten");
    metaf.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_UNBREAKABLE });
    ArrayList<String> loref = new ArrayList<>();
    metaf.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
    metaf.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ENCHANTS });
    metaf.setLore(loref);
    fortune.setItemMeta(metaf);
    inventory.setItem(13, fortune);
    ItemStack instantinv = new ItemStack(Material.CHEST, 1);
    ItemMeta metai = instantinv.getItemMeta();
    metai.setDisplayName(ChatColor.GREEN + "Instant Inventory freischalten");
    metai.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_UNBREAKABLE });
    ArrayList<String> lorei = new ArrayList<>();
    lorei.add(ChatColor.DARK_PURPLE + ">> Alle Items gehen direkt ins Inventar");
    metai.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
    metai.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ENCHANTS });
    metai.setLore(lorei);
    fortune.setItemMeta(metai);
    inventory.setItem(15, instantinv);
    player.openInventory(inventory);
  }
}
