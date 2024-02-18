package net.dbsgameplay.blockbreaker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import net.dbsgameplay.blockbreaker.commands.BasicPickeCommand;
import net.dbsgameplay.blockbreaker.commands.HelpCommand;
import net.dbsgameplay.blockbreaker.commands.MinesCommand;
import net.dbsgameplay.blockbreaker.commands.SellCommand;
import net.dbsgameplay.blockbreaker.commands.UpgradeCommand;
import net.dbsgameplay.blockbreaker.listener.*;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class DBsGameplayBlockBreaker extends JavaPlugin {
  public void onEnable() {
    // String url = "jdbc:mysql://localhost/fortune";
    // String user = "root";
    // String password = "";
    // try {
    //   Connection connection = DriverManager.getConnection(url, user, password);
    //   System.out.println("Verbunden zur Datenbank Fortune");
    // } catch (SQLException e) {
    //   System.out.println("Verbindung fehlgeschlagen");
    //   e.printStackTrace();
    // }
    getCommand("pickaxe").setExecutor((CommandExecutor)new BasicPickeCommand());
    getCommand("sellall").setExecutor((CommandExecutor)new SellCommand());
    getCommand("bupgrade").setExecutor((CommandExecutor)new UpgradeCommand());
    getCommand("bhelp").setExecutor((CommandExecutor)new HelpCommand());
    getCommand("mine").setExecutor((CommandExecutor)new MinesCommand());
    getServer().getPluginManager().registerEvents((Listener)new VerkaufenListener(), (Plugin)this);
    getServer().getPluginManager().registerEvents((Listener)new UpgradeListener(), (Plugin)this);
    getServer().getPluginManager().registerEvents((Listener)new PlayerJoinLeaveListener(), (Plugin)this);
    getServer().getPluginManager().registerEvents((Listener)new FortuneListener(), (Plugin)this);
    getServer().getPluginManager().registerEvents((Listener)new InstantInvListener(), (Plugin)this);
    getServer().getPluginManager().registerEvents((Listener)new PickaxeUpgradeListener(), (Plugin)this);
    getServer().getPluginManager().registerEvents((Listener)new MineListener(), (Plugin)this);
  }
  
  public void onDisable() {}
}
