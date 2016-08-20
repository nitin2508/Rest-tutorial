package resttutorial.model;
import java.util.Date;

/**
 * Created by nitin on 21/8/16.
 */
public class Profile {
    private long id;
    private String profileName;
    private String firstName;
    private String lastName;
    private Date created;

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getCreated() {
        return created;
    }

    public long getId() {
        return id;
    }

    public String getProfileName() {
        return profileName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Profile(long id, String firstName, String lastName)
    {
        this.id=id;
        this.profileName=profileName;
        this.firstName=firstName;
        this.lastName=lastName;

    }

}
