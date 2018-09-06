package de.merlinw.twasi.currency.gamble;

import net.twasi.core.plugin.TwasiPlugin;
import net.twasi.core.plugin.api.TwasiUserPlugin;

public class Plugin extends TwasiPlugin {

    public Class<? extends TwasiUserPlugin> getUserPluginClass() {
        return UserPlugin.class;
    }

}
