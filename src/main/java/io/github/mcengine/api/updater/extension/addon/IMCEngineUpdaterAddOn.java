package io.github.mcengine.api.updater.extension.addon;

import org.bukkit.plugin.Plugin;

/**
 * Updater AddOn contract for modules that extend MCEngine's update features.
 *
 * <p>
 * Implementations are dynamically loaded by the engine and can hook into
 * lifecycle events to register commands, listeners, or scheduled tasks
 * related to update workflows.
 * </p>
 */
public interface IMCEngineUpdaterAddOn {

    /**
     * Invoked when the Updater AddOn is loaded by the engine.
     *
     * @param plugin the hosting plugin instance providing runtime context
     */
    void onLoad(Plugin plugin);

    /**
     * Invoked when the Updater AddOn is unloaded or disabled by the engine.
     * <p>
     * Implementations should release resources, unregister listeners, and
     * cancel any scheduled tasks here.
     * </p>
     *
     * @param plugin the hosting plugin instance providing runtime context
     */
    void onDisload(Plugin plugin);

    /**
     * Supplies the engine-assigned unique identifier for this AddOn instance.
     *
     * @param id unique identifier assigned by the engine
     */
    void setId(String id);
}
