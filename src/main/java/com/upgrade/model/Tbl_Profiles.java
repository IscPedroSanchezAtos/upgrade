package com.upgrade.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tbl_Profiles {

	@Id
	private int IdProfile;
	
	@Column
	private String Profile;

	public int getIdProfile() {
		return IdProfile;
	}

	public void setIdProfile(int idProfile) {
		IdProfile = idProfile;
	}

	public String getProfile() {
		return Profile;
	}

	public void setProfile(String profile) {
		Profile = profile;
	}
	
}
