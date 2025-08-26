package io.github.mcengine.api.updater.extension.agent;

import org.bukkit.plugin.Plugin;

/**
 * Updater Agent contract for autonomous components that perform update-related
 * tasks (e.g., checking versions, coordinating downloads, or applying patches).
 *
 * <p>
 * Agents are discovered and managed by the engine lifecycle.
 * </p>
 */
public interface IMCEngineUpdaterAgent {

    /**
     * Invoked when the Updater Agent is loaded by the engine.
     *
     * @param plugin the hosting plugin instance providing runtime context
     */
    void onLoad(Plugin plugin);

    /**
     * Invoked when the Updater Agent is unloaded or disabled by the engine.
     * <p>
     * Implementations should release resources and stop background work here.
     * </p>
     *
     * @param plugin the hosting plugin instance providing runtime context
     */
    void onDisload(Plugin plugin);

    /**
     * Supplies the engine-assigned unique identifier for this Agent instance.
     *
     * @param id unique identifier assigned by the engine
     */
    void setId(String id);
}
