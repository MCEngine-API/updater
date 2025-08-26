package io.github.mcengine.api.updater.extension.library;

import org.bukkit.plugin.Plugin;

/**
 * Updater Library contract for foundational/shared code that supports
 * the update system (e.g., utilities, adapters, persistence layers).
 */
public interface IMCEngineUpdaterLibrary {

    /**
     * Invoked when the Updater Library is loaded by the engine.
     *
     * @param plugin the hosting plugin instance providing runtime context
     */
    void onLoad(Plugin plugin);

    /**
     * Invoked when the Updater Library is unloaded or disabled by the engine.
     * <p>
     * Implementations should free resources and unregister integrations here.
     * </p>
     *
     * @param plugin the hosting plugin instance providing runtime context
     */
    void onDisload(Plugin plugin);

    /**
     * Supplies the engine-assigned unique identifier for this Library instance.
     *
     * @param id unique identifier assigned by the engine
     */
    void setId(String id);
}
