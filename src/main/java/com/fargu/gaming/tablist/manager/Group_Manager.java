package com.fargu.gaming.tablist.manager;

import org.bukkit.entity.Player;

public class Group_Manager {

    public static boolean isPlayerInGroup(Player players, String group) {
        return players.hasPermission("group." + group);
    }
}
