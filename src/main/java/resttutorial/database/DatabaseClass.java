package resttutorial.database;

import resttutorial.model.Message;
import resttutorial.model.Profile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nitin on 21/8/16.
 */
public class DatabaseClass {
    private static Map<Long,Message> messages=new HashMap<>();
    private static Map<String, Profile> profiles = new HashMap<>();

    public static Map<Long, Message> getMessages() {
        return messages;
    }

    public static Map<String, Profile> getProfiles() {
        return profiles;
    }
}
