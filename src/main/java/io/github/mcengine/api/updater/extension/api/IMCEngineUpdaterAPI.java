package io.github.mcengine.api.updater.extension.api;

import org.bukkit.plugin.Plugin;

/**
 * Updater API contract for modules that expose programmatic capabilities
 * related to MCEngine updates (e.g., services, facades, or registries).
 *
 * <p>
 * Implementations may register services or provide hooks to other modules.
 * </p>
 */
public interface IMCEngineUpdaterAPI {

    /**
     * Invoked when the Updater API module is loaded by the engine.
     *
     * @param plugin the hosting plugin instance providing runtime context
     */
    void onLoad(Plugin plugin);

    /**
     * Invoked when the Updater API module is unloaded or disabled by the engine.
     * <p>
     * Implementations should unregister services and free resources here.
     * </p>
     *
     * @param plugin the hosting plugin instance providing runtime context
     */
    void onDisload(Plugin plugin);

    /**
     * Supplies the engine-assigned unique identifier for this API module.
     *
     * @param id unique identifier assigned by the engine
     */
    void setId(String id);
}
