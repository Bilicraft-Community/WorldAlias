package com.bilicraft.worldalias;

import me.clip.placeholderapi.PlaceholderAPI;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class PlaceHolderHook extends PlaceholderExpansion {
    private final WorldAlias plugin;

    public PlaceHolderHook(WorldAlias plugin) {
        this.plugin = plugin;
        this.register();
    }

    /**
     * The placeholder identifier of this expansion. May not contain {@literal %},
     * {@literal {}} or _
     *
     * @return placeholder identifier that is associated with this expansion
     */
    @Override
    public @NotNull String getIdentifier() {
        return "worldalias";
    }

    /**
     * The author of this expansion
     *
     * @return name of the author for this expansion
     */
    @Override
    public @NotNull String getAuthor() {
        return "Bilicraft";
    }

    /**
     * The version of this expansion
     *
     * @return current version of this expansion
     */
    @Override
    public @NotNull String getVersion() {
        return "1.0";
    }

    @Override
    public boolean canRegister() {
        return true;
    }

    @Override
    public String onPlaceholderRequest(Player player, @NotNull String params) {
        params = PlaceholderAPI.setPlaceholders(player, params);
        return FormatUtil.replaceFormat(this.plugin.getConfig().getString("alias." + params));
    }

    @Override
    public boolean persist() {
        return true;
    }
}
