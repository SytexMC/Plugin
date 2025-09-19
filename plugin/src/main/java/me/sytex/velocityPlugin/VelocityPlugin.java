/*
 * This file is part of Plugin, licensed under GPL v3.
 *
 * Copyright (c) 2025 Sytex <sytex@duck.com>
 * Copyright (c) contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package me.sytex.velocityPlugin;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.plugin.annotation.DataDirectory;
import com.velocitypowered.api.proxy.ProxyServer;
import org.slf4j.Logger;

import java.nio.file.Path;

@SuppressWarnings("checkstyle:MissingJavadocType")
@Plugin(id = "velocityplugin", name = "VelocityPlugin", version = "0.0.1-SNAPSHOT",
  description = "A Velocity Plugin Template", authors = {"Sytex"})
public class VelocityPlugin {

  private final ProxyServer proxy;
  private final Logger logger;
  private final Path data;

  @Inject
  public VelocityPlugin(ProxyServer proxy, Logger logger, @DataDirectory Path data) {
    this.proxy = proxy;
    this.logger = logger;
    this.data = data;
  }

  @Subscribe
  public void onProxyInitialization(ProxyInitializeEvent event) {
    // TODO: Add implementation here
  }
}
