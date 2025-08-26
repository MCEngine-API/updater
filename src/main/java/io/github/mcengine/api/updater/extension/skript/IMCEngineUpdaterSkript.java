package io.github.mcengine.api.updater.extension.skript;

import org.bukkit.plugin.Plugin;

/**
 * Updater Skript contract for scripted components that integrate with the
 * update system (e.g., DSL-based triggers or automation scripts).
 */
public interface IMCEngineUpdaterSkript {

    /**
     * Invoked when the Updater Skript module is loaded by the engine.
     *
     * @param plugin the hosting plugin instance providing runtime context
     */
    void onLoad(Plugin plugin);

    /**
     * Invoked when the Updater Skript module is unloaded or disabled by the engine.
     * <p>
     * Implementations should unregister script handlers and free resources here.
     * </p>
     *
     * @param plugin the hosting plugin instance providing runtime context
     */
    void onDisload(Plugin plugin);

    /**
     * Supplies the engine-assigned unique identifier for this Skript module.
     *
     * @param id unique identifier assigned by the engine
     */
    void setId(String id);
}
