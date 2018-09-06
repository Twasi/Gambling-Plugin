package de.merlinw.twasi.currency.gamble.database.gambleinfo;

import de.merlinw.twasi.currency.gamble.database.gamblesettings.GambleSettingsEntity;
import jdk.nashorn.internal.ir.annotations.Reference;
import net.twasi.core.database.models.BaseEntity;
import net.twasi.core.database.models.User;
import org.mongodb.morphia.annotations.Entity;

@Entity(value = "Twasi.Currency.Gamble.Statistics", noClassnameStored = true)
public class GambleInfoEntity extends BaseEntity {

    @Reference
    private User user;

    private String twitchId; // ID of the gambling user
    private int betting; // The amount of points the user bets
    private int chance; // The winning chance in percent between 0 and 100
    private int winMultiplier; // The point multiplier if the user wins
    private int pointsBeforeBetting; // The amount of points the user had before the betting
    private boolean win; // True if the user has won false if not

    GambleSettingsEntity resultEntity; // Stores all informations about the gamble result

    public GambleInfoEntity(){} // Getter for loading the entity from database

    public GambleInfoEntity(User channel, String twitchId, int betting, int chance, int winMultiplier, int pointsBeforeBetting, boolean win) {
        this.user = channel;
        this.twitchId = twitchId;
        this.betting = betting;
        this.chance = chance;
        this.winMultiplier = winMultiplier;
        this.pointsBeforeBetting = pointsBeforeBetting;
        this.win = win;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTwitchId() {
        return twitchId;
    }

    public void setTwitchId(String twitchId) {
        this.twitchId = twitchId;
    }

    public int getBetting() {
        return betting;
    }

    public void setBetting(int betting) {
        this.betting = betting;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public int getWinMultiplier() {
        return winMultiplier;
    }

    public void setWinMultiplier(int winMultiplier) {
        this.winMultiplier = winMultiplier;
    }

    public int getPointsBeforeBetting() {
        return pointsBeforeBetting;
    }

    public void setPointsBeforeBetting(int pointsBeforeBetting) {
        this.pointsBeforeBetting = pointsBeforeBetting;
    }

    public GambleSettingsEntity getResultEntity() {
        return resultEntity;
    }

    public void setResultEntity(GambleSettingsEntity resultEntity) {
        this.resultEntity = resultEntity;
    }

    public boolean iWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }
}
