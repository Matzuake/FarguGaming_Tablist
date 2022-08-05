package com.fargu.gaming.tablist.manager;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class FileManager {
    public static File Groubs_file = new File("plugins//FarguGaming_Tablist//Data//Groups//Groups.yml");
    public static YamlConfiguration Groups_cfg = YamlConfiguration.loadConfiguration(Groubs_file);
}
