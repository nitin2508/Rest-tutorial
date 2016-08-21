package resttutorial.resources;

import resttutorial.model.Message;
import resttutorial.model.Profile;
import resttutorial.service.MessageService;
import resttutorial.service.ProfileService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


/**
 * Created by nitin on 21/8/16.
 */
@Path("/profiles")
public class ProfileResource {


    ProfileService profileService = new ProfileService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Profile> getAllProfile() {
        return profileService.getAllProfile();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Profile addProfile(Profile profile) {
        Profile savedProfile = profileService.addProfile(profile);
        return savedProfile;
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Profile updateProfile(Profile profile) {
        return profileService.updateProfile(profile);
    }
    @Path("/{profileName}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Profile delete(@PathParam("profileName") String profileName) {
        return profileService.deleteProfile(profileName);
    }



    @Path("/{profileName}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Profile test(@PathParam("profileName") String profileName) {
        return profileService.getProfile(profileName);
    }

}
