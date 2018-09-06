package de.merlinw.twasi.currency.gamble.database.gamblesettings;

import jdk.nashorn.internal.ir.annotations.Reference;
import net.twasi.core.database.models.BaseEntity;
import net.twasi.core.database.models.User;
import org.mongodb.morphia.annotations.Entity;

@Entity(value = "Twasi.Currency.Gambling.Settings", noClassnameStored = true)
public class GambleSettingsEntity extends BaseEntity {

    @Reference
    private User user;

    // Settings with default values
    private int chance = 40; // Winning chance between 0 and 100
    private int minbet = 1; // Minimal betting value from 1 to any value
    private int maxbet = 0; // Maximal betting value from 1 to any value or 0 if disabled
    private boolean enableAllIn = true; // enable "!<cmd> all in" to go all in at any point value
    private int timeoutSeconds = 60; // The time in seconds a user need to wait between gambles
    private String gambleCommand = "!gamble"; // The command to use for gambling
    private boolean collectStatistics = true; // True if all gambling results should be stored in database to use for statistics

    public GambleSettingsEntity() {} // Empty constructor for loading from database

    public GambleSettingsEntity(User user, int chance, int minbet, int maxbet, boolean enableAllIn, int timeoutSeconds, String gambleCommand, boolean collectStatistics) {
        this.user = user;
        this.chance = chance;
        this.minbet = minbet;
        this.maxbet = maxbet;
        this.enableAllIn = enableAllIn;
        this.timeoutSeconds = timeoutSeconds;
        this.gambleCommand = gambleCommand;
        this.collectStatistics = collectStatistics;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public int getMinbet() {
        return minbet;
    }

    public void setMinbet(int minbet) {
        this.minbet = minbet;
    }

    public int getMaxbet() {
        return maxbet;
    }

    public void setMaxbet(int maxbet) {
        this.maxbet = maxbet;
    }

    public boolean isEnableAllIn() {
        return enableAllIn;
    }

    public void setEnableAllIn(boolean enableAllIn) {
        this.enableAllIn = enableAllIn;
    }

    public int getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(int timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    public String getGambleCommand() {
        return gambleCommand;
    }

    public void setGambleCommand(String gambleCommand) {
        this.gambleCommand = gambleCommand;
    }

    public boolean isCollectStatistics() {
        return collectStatistics;
    }

    public void setCollectStatistics(boolean collectStatistics) {
        this.collectStatistics = collectStatistics;
    }
}
