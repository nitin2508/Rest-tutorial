package resttutorial.service;

import resttutorial.database.InMemoryMessageDao;
import resttutorial.database.InMemoryProfileDao;
import resttutorial.model.Profile;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nitin on 21/8/16.
 */
public class ProfileService {
    InMemoryProfileDao profileDao=new InMemoryProfileDao();

    public ProfileService() {
        profileDao.updateProfile(new Profile(1, "nitin.nagar", "nitin", "nagar"));
        profileDao.updateProfile(new Profile(2, "nitinnagar", "nagar", "nitin"));

    }


    public List<Profile> getAllProfile(){
        return profileDao.getAllProfile();
    }


    public Profile addProfile(Profile profile){
        return profileDao.addProfile(profile);
    }

    public Profile deleteProfile(String profileName){
        return profileDao.deleteProfile(profileName);
    }
    public Profile updateProfile(Profile profile){
        return profileDao.updateProfile(profile);
    }
    public Profile getProfile(String profileName){
        return profileDao.getProfile(profileName);
    }

}
