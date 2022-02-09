package com.upgrade.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tbl_Profiles {

	
	@Id
	private int id_profile;
	
	@Column
	private String Profile;

	public int getId_profile() {
		return id_profile;
	}

	public void setId_profile(int id_profile) {
		this.id_profile = id_profile;
	}

	public String getProfile() {
		return Profile;
	}

	public void setProfile(String profile) {
		this.Profile = profile;
	}

	
}
