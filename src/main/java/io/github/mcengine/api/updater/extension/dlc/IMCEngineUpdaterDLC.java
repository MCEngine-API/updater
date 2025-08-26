package io.github.mcengine.api.updater.extension.dlc;

import org.bukkit.plugin.Plugin;

/**
 * Updater DLC contract for downloadable content that participates in the
 * update pipeline (e.g., content packs, rule sets, or data bundles).
 */
public interface IMCEngineUpdaterDLC {

    /**
     * Invoked when the Updater DLC is loaded by the engine.
     *
     * @param plugin the hosting plugin instance providing runtime context
     */
    void onLoad(Plugin plugin);

    /**
     * Invoked when the Updater DLC is unloaded or disabled by the engine.
     * <p>
     * Implementations should release resources and detach hooks here.
     * </p>
     *
     * @param plugin the hosting plugin instance providing runtime context
     */
    void onDisload(Plugin plugin);

    /**
     * Supplies the engine-assigned unique identifier for this DLC instance.
     *
     * @param id unique identifier assigned by the engine
     */
    void setId(String id);
}
