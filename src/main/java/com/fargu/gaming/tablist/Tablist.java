package com.fargu.gaming.tablist;

import com.fargu.gaming.tablist.scoreboards.TablistManager;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class Tablist extends JavaPlugin {
    public static FileConfiguration cfg;
    public static File file;
    private TablistManager tablistManager;

    public TablistManager getTablistManager() {
        return this.tablistManager;
    }

    public static String log(String message) {
        Bukkit.getConsoleSender().sendMessage(message);
        return message;
    }
    @Override
    public void onEnable() {
        log("Loadingfiles.........");
        this.tablistManager = new TablistManager();

    }

    @Override
    public void onDisable() {
        log("§7========== §aFargu-Gaming CityBuild §7ist §4Gestoppt §7==========");
    }

    private void loadconfig() {
        saveDefaultConfig();
        file = new File("plugins/FarguGaming_CityBuild", "config.yml");
        cfg = (FileConfiguration) YamlConfiguration.loadConfiguration(file);
    }

}
