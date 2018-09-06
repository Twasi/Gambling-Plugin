package de.merlinw.twasi.currency.gamble;

import net.twasi.core.plugin.api.TwasiUserPlugin;
import net.twasi.core.plugin.api.events.TwasiInstallEvent;
import net.twasi.core.plugin.api.events.TwasiMessageEvent;

public class UserPlugin extends TwasiUserPlugin {

    @Override
    public void onInstall(TwasiInstallEvent e) {
        /* Permissions are not necessary
        e.getDefaultGroup().addKey("twasi.currency.gamble.default.*");
        e.getAdminGroup().addKey("twasi.currency.gamble.streamer.*");
        e.getModeratorsGroup().addKey("twasi.currency.gamble.mod.*");
        */
        e.getDefaultGroup().addKey("twasi.currency.gamble.allowgamble");
    }

    @Override
    public void onUninstall(TwasiInstallEvent e) {
        /* Permissions are not necessary
        e.getDefaultGroup().removeKey("twasi.currency.gamble.default.*");
        e.getAdminGroup().removeKey("twasi.currency.gamble.streamer.*");
        e.getModeratorsGroup().removeKey("twasi.currency.gamble.mod.*");
        */
        e.getDefaultGroup().removeKey("twasi.currency.gamble.allowgamble");
    }

    @Override
    public void onMessage(TwasiMessageEvent e) {

    }
}
