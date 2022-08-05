package com.fargu.gaming.tablist.scoreboards;

import com.fargu.gaming.tablist.Tablist;
import com.fargu.gaming.tablist.manager.FileManager;
import com.fargu.gaming.tablist.manager.Group_Manager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class TablistManager {
    public void setAllPlayerTeams() {
        Bukkit.getOnlinePlayers().forEach(this::setPlayerTeams);
    }
    public void setPlayerList(Player player) {
        Location location = player.getLocation();
        String tablistheader_place = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Board.TablistHeader_placeholder"));
        String tablistheader_line0 = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Board.TablistHeader_line_0"));
        String tablistheader_line1 = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Board.TablistHeader_line_1"));
        String tablistheader_line2 = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Board.TablistHeader_line_2"));
        String tablistfooter_line0 = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Board.TablistFooter_line_0"));
        String tablistfooter_line1 = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Board.TablistFooter_line_1"));
        String tablistfooter_line2 = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Board.TablistFooter_line_2"));
        player.setPlayerListHeaderFooter(tablistheader_place + tablistheader_line0 + tablistheader_place + "\n" + tablistheader_line1 + "\n" + tablistheader_line2, tablistfooter_line0 + "\n" + tablistfooter_line1 + "\n" + tablistfooter_line2);
    }

    public void setPlayerTeams(Player player) {
        Scoreboard scoreboard = player.getScoreboard();
        Team owner = scoreboard.getTeam("001grunder");
        Team admin = scoreboard.getTeam("002admin");
        Team srdeveloper = scoreboard.getTeam("003srdev");
        Team srmoderartor = scoreboard.getTeam("004srmod");
        Team srsupporter = scoreboard.getTeam("005srsup");
        Team srcontent = scoreboard.getTeam("006srcont");
        Team srbuilder = scoreboard.getTeam("007srbuild");
        Team moderator = scoreboard.getTeam("008mod");
        Team content = scoreboard.getTeam("009content");
        Team developer = scoreboard.getTeam("010dev");
        Team supporter = scoreboard.getTeam("011sup");
        Team builder = scoreboard.getTeam("012builder");
        Team player_highest = scoreboard.getTeam("013phighest");
        Team player_high = scoreboard.getTeam("014phigh");
        Team player_medium = scoreboard.getTeam("015pmedium");
        Team player_medium_I = scoreboard.getTeam("016pmedi");
        Team player_low = scoreboard.getTeam("017plow");
        Team player_low_I = scoreboard.getTeam("018plo");
        Team player_small = scoreboard.getTeam("019psmal");
        Team sdefault = scoreboard.getTeam("020spieler");
        if (owner == null)
            owner = scoreboard.registerNewTeam("001grunder");
        if (admin == null)
            admin = scoreboard.registerNewTeam("002admin");
        if (srdeveloper == null)
            srdeveloper = scoreboard.registerNewTeam("003srdev");
        if (srmoderartor == null)
            srmoderartor = scoreboard.registerNewTeam("004srmod");
        if (srsupporter == null)
            srsupporter = scoreboard.registerNewTeam("005srsup");
        if (srcontent == null)
            srcontent = scoreboard.registerNewTeam("006srcont");
        if (srbuilder == null)
            srbuilder = scoreboard.registerNewTeam("007srbuild");
        if (moderator == null)
            moderator = scoreboard.registerNewTeam("008mod");
        if (content == null)
            content = scoreboard.registerNewTeam("009content");
        if (developer == null)
            developer = scoreboard.registerNewTeam("010dev");
        if (supporter == null)
            supporter = scoreboard.registerNewTeam("011sup");
        if (builder == null)
            builder = scoreboard.registerNewTeam("012builder");
        if (player_highest == null)
            player_highest = scoreboard.registerNewTeam("013phighest");
        if (player_high == null)
            player_high = scoreboard.registerNewTeam("014phigh");
        if (player_medium == null)
            player_medium = scoreboard.registerNewTeam("015pmedium");
        if (player_medium_I == null)
            player_medium_I = scoreboard.registerNewTeam("016pmedi");
        if (player_low == null)
            player_low = scoreboard.registerNewTeam("017plow");
        if (player_low_I == null)
            player_low_I = scoreboard.registerNewTeam("018plo");
        if (player_small == null)
            player_small = scoreboard.registerNewTeam("019psmal");
        if (sdefault == null)
            sdefault = scoreboard.registerNewTeam("020spieler");
        String rang_owner = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.owner"));
        String rang_admin = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.admin"));
        String rang_srdeveloper = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.srdeveloper"));
        String rang_srmodderator = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.srmoderator"));
        String rang_srsupporter = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.srsupporter"));
        String rang_srcontent = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.srcontent"));
        String rang_srbuilder = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.srbuilder"));
        String rang_moderator = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.moderator"));
        String rang_content = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.content"));
        String rang_developer = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.developer"));
        String rang_supporter = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.supporter"));
        String rang_builder = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.builder"));
        String rang_player_highest = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.player_highest"));
        String rang_player_high = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.player_high"));
        String rang_player_medium = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.player_medium"));
        String rang_player_medium_I = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.player_medium_I"));
        String rang_low = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.player_low"));
        String rang_low_I = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.playerlow_I"));
        String rang_small = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.player_small"));
        String rang_default = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.default"));
        owner.setPrefix(rang_owner);
        owner.setColor(ChatColor.GRAY);
        admin.setPrefix(rang_admin);
        admin.setColor(ChatColor.GRAY);
        srdeveloper.setPrefix(rang_srdeveloper);
        srdeveloper.setColor(ChatColor.GRAY);
        srmoderartor.setPrefix(rang_srmodderator);
        srmoderartor.setColor(ChatColor.GRAY);
        srsupporter.setPrefix(rang_srsupporter);
        srsupporter.setColor(ChatColor.GRAY);
        srcontent.setPrefix(rang_srcontent);
        srcontent.setColor(ChatColor.GRAY);
        srbuilder.setPrefix(rang_srbuilder);
        srbuilder.setColor(ChatColor.GRAY);
        moderator.setPrefix(rang_moderator);
        moderator.setColor(ChatColor.GRAY);
        content.setPrefix(rang_content);
        content.setColor(ChatColor.GRAY);
        developer.setPrefix(rang_developer);
        developer.setColor(ChatColor.GRAY);
        supporter.setPrefix(rang_supporter);
        supporter.setColor(ChatColor.GRAY);
        builder.setPrefix(rang_builder);
        builder.setColor(ChatColor.GRAY);
        player_highest.setPrefix(rang_player_highest);
        player_highest.setColor(ChatColor.GRAY);
        player_high.setPrefix(rang_player_high);
        player_high.setColor(ChatColor.GRAY);
        player_medium.setPrefix(rang_player_medium);
        player_medium.setColor(ChatColor.GRAY);
        player_medium_I.setPrefix(rang_player_medium_I);
        player_medium_I.setColor(ChatColor.GRAY);
        player_low.setPrefix(rang_low);
        player_low.setColor(ChatColor.GRAY);
        player_low_I.setPrefix(rang_low_I);
        player_low_I.setColor(ChatColor.GRAY);
        player_small.setPrefix(rang_small);
        player_small.setColor(ChatColor.GRAY);
        sdefault.setPrefix(rang_default);
        sdefault.setColor(ChatColor.GRAY);
        String owner_groups = FileManager.Groups_cfg.getString("Groups.Owner.GroupName");
        String admin_groups = FileManager.Groups_cfg.getString("Groups.Admin.GroupName");
        String srdeveloper_groups = FileManager.Groups_cfg.getString("Groups.SrDeveloperGroupName");
        String srcontent_groups = FileManager.Groups_cfg.getString("Groups.SrContent.GroupName");
        String srmoderator_groups = FileManager.Groups_cfg.getString("Groups.SrModerator.GroupName");
        String srsupporter_groups = FileManager.Groups_cfg.getString("Groups.SrSupporter.GroupName");
        String srbuilder_groups = FileManager.Groups_cfg.getString("Groups.SrBuilder.GroupName");
        String developer_groups = FileManager.Groups_cfg.getString("Groups.Developer.GroupName");
        String content_groups = FileManager.Groups_cfg.getString("Groups.Content.GroupName");
        String moderartor_groups = FileManager.Groups_cfg.getString("Groups.Moderator.GroupName");
        String supporter_groups = FileManager.Groups_cfg.getString("Groups.Supporter.GroupName");
        String builder_groups = FileManager.Groups_cfg.getString("Groups.Builder.GroupName");
        String player_highest_groups = FileManager.Groups_cfg.getString("Groups.player_highest.GroupName");
        String player_high_groups = FileManager.Groups_cfg.getString("Groups.player_high.GroupName");
        String player_medium_groups = FileManager.Groups_cfg.getString("Groups.player_medium.GroupName");
        String player_medium_I_groups = FileManager.Groups_cfg.getString("Groups.player_medium_I.GroupName");
        String player_low_groups = FileManager.Groups_cfg.getString("Groups.player_low.GroupName");
        String player_low_I_groups = FileManager.Groups_cfg.getString("Groups.player_low_I.GroupName");
        String player_small_groups = FileManager.Groups_cfg.getString("Groups.player_small.GroupName");
        for (Player target : Bukkit.getOnlinePlayers()) {
            if (Group_Manager.isPlayerInGroup(target, owner_groups)) {
                owner.addEntry(target.getName());
                continue;
            }
            if (Group_Manager.isPlayerInGroup(target, admin_groups)) {
                admin.addEntry(target.getName());
                continue;
            }
            if (Group_Manager.isPlayerInGroup(target, srdeveloper_groups)) {
                srdeveloper.addEntry(target.getName());
                continue;
            }
            if (Group_Manager.isPlayerInGroup(target, srsupporter_groups)) {
                srsupporter.addEntry(target.getName());
                continue;
            }
            if (Group_Manager.isPlayerInGroup(target, srmoderator_groups)) {
                srmoderartor.addEntry(target.getName());
                continue;
            }
            if (Group_Manager.isPlayerInGroup(target, srcontent_groups)) {
                srcontent.addEntry(target.getName());
                continue;
            }
            if (Group_Manager.isPlayerInGroup(target, srbuilder_groups)) {
                srbuilder.addEntry(target.getName());
                continue;
            }
            if (Group_Manager.isPlayerInGroup(target, moderartor_groups)) {
                moderator.addEntry(target.getName());
                continue;
            }
            if (Group_Manager.isPlayerInGroup(target, content_groups)) {
                content.addEntry(target.getName());
                continue;
            }
            if (Group_Manager.isPlayerInGroup(target, developer_groups)) {
                developer.addEntry(target.getName());
                continue;
            }
            if (Group_Manager.isPlayerInGroup(target, supporter_groups)) {
                supporter.addEntry(target.getName());
                continue;
            }
            if (Group_Manager.isPlayerInGroup(target, builder_groups)) {
                builder.addEntry(target.getName());
                continue;
            }
            if (Group_Manager.isPlayerInGroup(target, builder_groups)) {
                builder.addEntry(target.getName());
                continue;
            }
            if (Group_Manager.isPlayerInGroup(target, builder_groups)) {
                builder.addEntry(target.getName());
                continue;
            }
            if (Group_Manager.isPlayerInGroup(target, builder_groups)) {
                builder.addEntry(target.getName());
                continue;
            }
            if (Group_Manager.isPlayerInGroup(target, builder_groups)) {
                builder.addEntry(target.getName());
                continue;
            }
            if (Group_Manager.isPlayerInGroup(target, player_highest_groups)) {
                player_highest.addEntry(target.getName());
                continue;
            }
            if (Group_Manager.isPlayerInGroup(target, player_high_groups)) {
                player_high.addEntry(target.getName());
                continue;
            }
            if (Group_Manager.isPlayerInGroup(target, player_medium_groups)) {
                player_medium.addEntry(target.getName());
                continue;
            }
            if (Group_Manager.isPlayerInGroup(target, player_medium_I_groups)) {
                player_medium_I.addEntry(target.getName());
                continue;
            }
            if (Group_Manager.isPlayerInGroup(target, player_low_groups)) {
                player_low.addEntry(target.getName());
                continue;
            }
            if (Group_Manager.isPlayerInGroup(target, player_low_I_groups)) {
                player_low_I.addEntry(target.getName());
                continue;
            }
            if (Group_Manager.isPlayerInGroup(target, player_small_groups)) {
                player_small.addEntry(target.getName());
                continue;
            }
            if (Group_Manager.isPlayerInGroup(target, "default"))
                sdefault.addEntry(target.getName());
        }
    }
}


