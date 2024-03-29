package org.abhishek.java.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.abhishek.java.messenger.model.Message;
import org.abhishek.java.messenger.model.Profile;
import org.abhishek.java.messenger.service.ProfileService;


@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {

	ProfileService profileService = new ProfileService();
	
	@GET
	
	public List<Profile> getProfiles()
	{
		return profileService.getAllProfiles();
		
	}
	
	@POST
	public Profile addProfile(Profile profile){
	return profileService.addProfile(profile);
	}
	
	@PUT
	@Path("/{profileId}")
	    public Profile updateProfile(@PathParam("profileId")String profileName, Profile profile){
		profile.setProfileName(profileName);
		return profileService.updateProfile(profile);
	}
	
	@DELETE
	@Path("/{profileId}")
	
	public void deleteProfile(@PathParam("profileId")String profileName){
		
		 profileService.removeProfile(profileName);
	}
	
	@GET
	@Path("/{profileId}")
	
	public Profile getProfile(@PathParam("profileId")String profileName){
	
		return profileService.getProfile(profileName);
	}
	
}
