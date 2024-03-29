package net.dbsgameplay.blockbreaker.listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PlayerJoinLeaveListener implements Listener {
  @EventHandler
  public void onJoin(PlayerJoinEvent event) {
    event.setJoinMessage(ChatColor.GREEN + "[+] " + ChatColor.WHITE + event.getPlayer().getName());
    Player player = event.getPlayer();
    player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 2147483647, 0, true, false));
  }
  
  @EventHandler
  public void onLeft(PlayerQuitEvent event) {
    event.setQuitMessage(ChatColor.RED + "[-] " + ChatColor.WHITE + event.getPlayer().getName());
    Player player = event.getPlayer();
    player.removePotionEffect(PotionEffectType.NIGHT_VISION);
  }
}
