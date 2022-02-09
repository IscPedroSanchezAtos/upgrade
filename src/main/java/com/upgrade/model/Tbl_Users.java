package com.upgrade.model;


import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tbl_Users {

	@Id
	private int IdUser;
	
	@Column
	private String UserName;
	
	@Column
	private String Password;
	
	@Column
	private int IdProfile;
	
	@Column
	private int IdEmployee;
	
	@Column 
	private String Staus;
	
	@Column
	private Date CreatedDate;
	
	@Column
	private Date UpdateDate;
	
	@Column
	private String Login;

	public int getIdUser() {
		return IdUser;
	}

	public void setIdUser(int idUser) {
		IdUser = idUser;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getIdProfile() {
		return IdProfile;
	}

	public void setIdProfile(int idProfile) {
		IdProfile = idProfile;
	}

	public int getIdEmployee() {
		return IdEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		IdEmployee = idEmployee;
	}

	public String getStaus() {
		return Staus;
	}

	public void setStaus(String staus) {
		Staus = staus;
	}

	public Date getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(Date createdDate) {
		CreatedDate = createdDate;
	}

	public Date getUpdateDate() {
		return UpdateDate;
	}

	public void setUpdateDate(Date updateDate) {
		UpdateDate = updateDate;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}
	
	
	
}
