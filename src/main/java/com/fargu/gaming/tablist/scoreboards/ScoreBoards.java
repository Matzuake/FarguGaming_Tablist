package com.fargu.gaming.tablist.scoreboards;

import com.fargu.gaming.tablist.Tablist;
import com.fargu.gaming.tablist.manager.Group_Manager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ScoreBoards extends ScoreboardBuilder {
    private int socialId;

    private final Tablist plugin;

    public ScoreBoards(Player player) {
        super(player);
        this.socialId = 0;
        this.plugin = null;
    }

    public static Map<Scoreboard, Player> scorebords = new HashMap<>();

    public void createScoreboard() {
        String Sideboard_line13 = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Board.Sideboard_line13"));
        String Sideboard_line10 = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Board.Sideboard_line10"));
        String Sideboard_line10_2 = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Board.Sideboard_line10_2"));
        String Sideboard_line7 = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Board.Sideboard_line7"));
        String Sideboard_line4 = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Board.Sideboard_line4"));
        String rang_owner = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.owner"));
        String rang_admin = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.admin"));
        String rang_srdeveloper = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.srdeveloper"));
        String rang_srmodderator = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.srmoderator"));
        String rang_srcontent = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.srcontent"));
        String rang_srbuilder = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.srbuilder"));
        String rang_moderator = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.moderator"));
        String rang_content = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.content"));
        String rang_developer = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.developer"));
        String rang_supporter = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.supporter"));
        String rang_builder = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.builder"));
        String rang_default = ChatColor.translateAlternateColorCodes('&', Tablist.cfg.getString("Rang.default"));
        for (Iterator<Player> iterator = (Iterator<Player>) Bukkit.getOnlinePlayers().iterator(); iterator.hasNext(); ) {
            Player p = iterator.next();
            String uuid = p.getUniqueId().toString();

            String pattern = "###,###,###,###";
            DecimalFormat coinsFormat = new DecimalFormat(pattern);
            DecimalFormat voteformat = new DecimalFormat(pattern);
            setScore(ChatColor.WHITE.toString() + Sideboard_line13, 14);
            setScore("", 11);
            setScore(ChatColor.WHITE.toString() + Sideboard_line10, 10);
            setScore(ChatColor.YELLOW.toString() + "0", 9);
            setScore("", 8);
            setScore(ChatColor.WHITE.toString() + "Online Spieler", 7);
            setScore(ChatColor.GRAY.toString() + ChatColor.GREEN + Bukkit.getOnlinePlayers().size() + ChatColor.GRAY + " / " + Bukkit.getMaxPlayers(), 6);
            setScore("", 5);
            setScore(ChatColor.WHITE.toString() + "Website", 4);
            setScore(ChatColor.GRAY.toString() + "forum.ranch2gether.de", 3);
            setScore("", 2);
            setScore(ChatColor.WHITE.toString() + "Teamspeak", 1);
            setScore(ChatColor.GRAY.toString() + "ts.ranch2gether.de", 0);
            if (Group_Manager.isPlayerInGroup(this.player, "owner")) {
                setScore(rang_owner, 13);
                setScore(ChatColor.GRAY.toString() + ChatColor.WHITE + this.player.getName(), 12);
                continue;
            }
            if (Group_Manager.isPlayerInGroup(this.player, "admin")) {
                setScore(rang_admin, 13);
                setScore(ChatColor.GRAY.toString() + ChatColor.WHITE + this.player.getName(), 12);
                continue;
            }
            if (Group_Manager.isPlayerInGroup(this.player, "srdeveloper")) {
                setScore(rang_srdeveloper, 13);
                setScore(ChatColor.GRAY.toString() + ChatColor.WHITE + this.player.getName(), 12);
                continue;
            }
            if (Group_Manager.isPlayerInGroup(this.player, "srmoderator")) {
                setScore(rang_srmodderator, 13);
                setScore(ChatColor.GRAY.toString() + ChatColor.WHITE + this.player.getName(), 12);
                continue;
            }
            if (Group_Manager.isPlayerInGroup(this.player, "srcontent")) {
                setScore(rang_srcontent, 13);
                setScore(ChatColor.GRAY.toString() + ChatColor.WHITE + this.player.getName(), 12);
                continue;
            }
            if (Group_Manager.isPlayerInGroup(this.player, "srbuilder")) {
                setScore(rang_srbuilder, 13);
                setScore(ChatColor.GRAY.toString() + ChatColor.WHITE + this.player.getName(), 12);
                continue;
            }
            if (Group_Manager.isPlayerInGroup(this.player, "moderator")) {
                setScore(rang_moderator, 13);
                setScore(ChatColor.GRAY.toString() + ChatColor.WHITE + this.player.getName(), 12);
                continue;
            }
            if (Group_Manager.isPlayerInGroup(this.player, "content")) {
                setScore(rang_content, 13);
                setScore(ChatColor.GRAY.toString() + ChatColor.WHITE + this.player.getName(), 12);
                continue;
            }
            if (Group_Manager.isPlayerInGroup(this.player, "developer")) {
                setScore(rang_developer, 13);
                setScore(ChatColor.GRAY.toString() + ChatColor.WHITE + this.player.getName(), 12);
                continue;
            }
            if (Group_Manager.isPlayerInGroup(this.player, "supporter")) {
                setScore(rang_supporter, 13);
                setScore(ChatColor.GRAY.toString() + ChatColor.WHITE + this.player.getName(), 12);
                continue;
            }
            if (Group_Manager.isPlayerInGroup(this.player, "builder")) {
                setScore(rang_builder, 13);
                setScore(ChatColor.GRAY.toString() + ChatColor.WHITE + this.player.getName(), 12);
                continue;
            }
            if (Group_Manager.isPlayerInGroup(this.player, "default")) {
                setScore(rang_default, 13);
                setScore(ChatColor.GRAY.toString() + ChatColor.WHITE + this.player.getName(), 12);
            }
        }
    }

    @Override
    public void update() {

    }
}
