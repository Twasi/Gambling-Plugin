package de.merlinw.twasi.currency.gamble.database.gamblesettings;

import net.twasi.core.database.lib.Repository;
import net.twasi.core.database.models.User;
import org.mongodb.morphia.query.Query;

import java.util.List;

public class GambleSettingsRepository extends Repository<GambleSettingsEntity> {

    public GambleSettingsEntity getGambleSettingsEntityByUser(User user){
        Query<GambleSettingsEntity> gambleSettingsEntityQuery = store.createQuery(GambleSettingsEntity.class);
        List<GambleSettingsEntity> gambleSettingsEntities = gambleSettingsEntityQuery.field("user").equal(user).asList();
        if(gambleSettingsEntities.size() > 0) return gambleSettingsEntities.get(0);
        else return null;
    }

}
