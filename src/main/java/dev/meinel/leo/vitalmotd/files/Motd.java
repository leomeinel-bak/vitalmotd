/*
 * File: Motd.java
 * Author: Leopold Meinel (leo@meinel.dev)
 * -----
 * Copyright (c) 2022 Leopold Meinel & contributors
 * SPDX ID: GPL-3.0-or-later
 * URL: https://www.gnu.org/licenses/gpl-3.0-standalone.html
 * -----
 */

package dev.meinel.leo.vitalmotd.files;

import dev.meinel.leo.vitalmotd.VitalMotd;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class Motd {

	private final VitalMotd main = JavaPlugin.getPlugin(VitalMotd.class);
	private final File motdFile;
	private final FileConfiguration motdConf;

	public Motd() {
		motdFile = new File(main.getDataFolder(), "motd.yml");
		saveMotdFile();
		motdConf = YamlConfiguration.loadConfiguration(motdFile);
	}

	private void saveMotdFile() {
		if (!motdFile.exists()) {
			main.saveResource("motd.yml", false);
		}
	}

	public FileConfiguration getMotdConf() {
		return motdConf;
	}
}
