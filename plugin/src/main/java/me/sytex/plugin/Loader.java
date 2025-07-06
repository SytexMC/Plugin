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

import io.papermc.paper.plugin.loader.PluginClasspathBuilder;
import io.papermc.paper.plugin.loader.PluginLoader;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("UnstableApiUsage")
public class Loader implements PluginLoader {

  /**
   * Called by the server to allow plugin to configure the runtime classpath that the plugin is run on. This allows plugin loaders to configure
   * dependencies for the plugin where jars can be downloaded or provided during runtime.
   *
   * @param classpathBuilder a mutable classpath builder that may be used to register custom runtime dependencies for the plugin the loader was
   *                         registered for.
   */
  @Override
  public void classloader(@NotNull PluginClasspathBuilder classpathBuilder) {

  }
}
