/*
 * VitalMotd is a Spigot Plugin that shows a message on join.
 * Copyright © 2022 Leopold Meinel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see https://github.com/TamrielNetwork/VitalMotd/blob/main/LICENSE
 */

package com.tamrielnetwork.vitalmotd.files;

import com.tamrielnetwork.vitalmotd.VitalMotd;
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
