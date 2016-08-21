package resttutorial.database;

import resttutorial.model.Profile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nitin on 21/8/16.
 */
public class InMemoryProfileDao {

    private static Map<String,Profile> profiles=new HashMap<>();


    public List<Profile> getAllProfile(){
        return new ArrayList<Profile>(profiles.values());
    }

    public Profile getProfile(String profileName){

        return profiles.get(profileName);

    }

    public Profile deleteProfile(String profileName){
        return profiles.remove(profileName);
    }

    public Profile addProfile(Profile profile){
        profile.setId(profiles.size()+1);
        profiles.put(profile.getProfileName(),profile);
        return profile;
    }

    public Profile updateProfile(Profile profile){
        profiles.put(profile.getProfileName(),profile);
        return profile;
    }


}
