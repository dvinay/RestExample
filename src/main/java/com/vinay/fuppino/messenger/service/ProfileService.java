package com.vinay.fuppino.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.vinay.fuppino.messenger.database.DatabaseClass;
import com.vinay.fuppino.messenger.model.Profile;

public class ProfileService {
	
	private Map<String, Profile> profiles = DatabaseClass.getProfiles();
	
	public ProfileService() {
		super();
		profiles.put("vinay", new Profile(1L, "vinay", "vinay", "duvvada"));
		profiles.put("vijay", new Profile(2L, "vijay", "vijay", "devarakonda"));
		profiles.put("anil", new Profile(3L, "anil", "anil", "goosh"));
	}
	
	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size()+1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile) {
		if(profile.getProfileName().isEmpty()) {
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public void removeProfile(String profileName) {
		profiles.remove(profileName);
	}
}
