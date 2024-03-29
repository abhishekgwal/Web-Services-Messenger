package org.abhishek.java.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.abhishek.java.messenger.database.DatabaseClass;
import org.abhishek.java.messenger.model.Message;
import org.abhishek.java.messenger.model.Profile;

public class ProfileService {

private Map<String, Profile> profiles = DatabaseClass.getProfiles();
	
	public ProfileService()
	{
		profiles.put("abhishek", new Profile(1L,"abhishek", "abhishek", "gwal"));
	}

	public List<Profile> getAllProfiles(){
		return  new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String id){
		return profiles.get(id);
	}
	
	public Profile addProfile(Profile profile){
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile) {
		if(profile.getProfileName().isEmpty()){
			return null;
		}
		profiles.put(profile.getProfileName(),profile);
		return profile;
	}
	
	public Profile removeProfile(String profileName) {
		
		return profiles.remove(profileName);
	}
	
}
