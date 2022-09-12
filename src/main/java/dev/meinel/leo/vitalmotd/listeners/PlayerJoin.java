/*
 * File: PlayerJoin.java
 * Author: Leopold Meinel (leo@meinel.dev)
 * -----
 * Copyright (c) 2022 Leopold Meinel & contributors
 * SPDX ID: GPL-3.0-or-later
 * URL: https://www.gnu.org/licenses/gpl-3.0-standalone.html
 * -----
 */

package dev.meinel.leo.vitalmotd.listeners;

import dev.meinel.leo.vitalmotd.utils.Chat;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class PlayerJoin
		implements Listener {

	@EventHandler
	public void onPlayerJoin(@NotNull PlayerJoinEvent event) {
		Player player = event.getPlayer();
		Chat.sendMessage(player, Map.of("%player%", player.getName(), "%online%", String.valueOf(
				Bukkit.getOnlinePlayers()
						.size())),
				"messages");
	}
}
