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

package me.sytex.plugin;

import io.papermc.paper.plugin.bootstrap.BootstrapContext;
import io.papermc.paper.plugin.bootstrap.PluginBootstrap;
import io.papermc.paper.plugin.bootstrap.PluginProviderContext;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("UnstableApiUsage")
public class Bootstrap implements PluginBootstrap {

  /**
   * Called by the server, allowing you to bootstrap the plugin with a context that provides things like a logger and your shared plugin configuration
   * file.
   *
   * @param context the server provided context
   */
  @Override
  public void bootstrap(@NotNull BootstrapContext context) {

  }

  /**
   * Called by the server to instantiate your main class. Plugins may override this logic to define custom creation logic for said instance, like
   * passing addition constructor arguments.
   *
   * @param context the server created bootstrap object
   * @return the server requested instance of the plugin main class.
   */
  @Override
  public @NotNull JavaPlugin createPlugin(@NotNull PluginProviderContext context) {
    return io.papermc.paper.plugin.bootstrap.PluginBootstrap.super.createPlugin(context);
  }
}
