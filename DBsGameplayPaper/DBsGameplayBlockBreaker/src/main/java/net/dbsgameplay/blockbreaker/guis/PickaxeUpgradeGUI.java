package net.dbsgameplay.blockbreaker.guis;

import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PickaxeUpgradeGUI {
  public PickaxeUpgradeGUI(Player player) {
    Inventory inventory = Bukkit.createInventory(null, 27, ChatColor.GREEN + "Pickaxe Upgraden");
    ItemStack kaufen = new ItemStack(Material.PAPER, 1);
    ItemMeta metak = kaufen.getItemMeta();
    metak.setDisplayName("Kaufen");
    ArrayList<String> lore = new ArrayList<>();
    lore.add(">> Preis ");
    metak.setLore(lore);
    kaufen.setItemMeta(metak);
    inventory.setItem(13, kaufen);
    ItemStack back = new ItemStack(Material.BARREL, 1);
    ItemMeta metab = back.getItemMeta();
    metab.setDisplayName("Zurück");
    ArrayList<String> loreb = new ArrayList<>();
    loreb.add(">> Hauptfenster");
    metab.setLore(loreb);
    back.setItemMeta(metab);
    inventory.setItem(18, back);
    player.openInventory(inventory);
  }
}
