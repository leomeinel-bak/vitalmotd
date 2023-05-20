/*
 * File: VitalMotd.java
 * Author: Leopold Meinel (leo@meinel.dev)
 * -----
 * Copyright (c) 2023 Leopold Meinel & contributors
 * SPDX ID: GPL-3.0-or-later
 * URL: https://www.gnu.org/licenses/gpl-3.0-standalone.html
 * -----
 */

package dev.meinel.leo.vitalmotd;

import dev.meinel.leo.vitalmotd.files.Motd;
import dev.meinel.leo.vitalmotd.listeners.PlayerJoin;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class VitalMotd extends JavaPlugin {

    private Motd motd;

    @Override
    public void onEnable() {
        registerListeners();
        motd = new Motd();
        Bukkit.getLogger().info("VitalMotd v" + this.getPluginMeta().getVersion() + " enabled");
        Bukkit.getLogger().info("Copyright (C) 2022 Leopold Meinel");
        Bukkit.getLogger().info("This program comes with ABSOLUTELY NO WARRANTY!");
        Bukkit.getLogger().info(
                "This is free software, and you are welcome to redistribute it under certain conditions.");
        Bukkit.getLogger()
                .info("See https://www.gnu.org/licenses/gpl-3.0-standalone.html for more details.");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("VitalMotd v" + this.getPluginMeta().getVersion() + " disabled");
    }

    public Motd getMotd() {
        return motd;
    }

    private void registerListeners() {
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
    }
}
