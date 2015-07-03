package org.abhishek.java.messenger.model;

import java.util.Date;

public class Profile {
	
	private long id;
	private String ProfileName;
	private String firstName;
	private String lastname;
	private Date created;
	
	public Profile(){
		
	}
	
	public Profile(long id, String ProfileName, String firstname, String lastname)
	{
		this.id = id;
		this.ProfileName = ProfileName;
		this.firstName = firstname;
		this.lastname = lastname;
		//this.created = new Date();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProfileName() {
		return ProfileName;
	}

	public void setProfileName(String profileName) {
		ProfileName = profileName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	
	
}
