package com.cts.mentor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mentor")
public class Mentor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "linkedin_url")
	private String linkedin_url;
	
	@Column(name = "reg_datetime")
	private String reg_datetime;
	
	@Column(name = "reg_code")
	private String reg_code;
	
	@Column(name = "years_of_experience")
	private String years_of_experience;
	
	@Column(name="active")
	private String active;

	
	public Mentor() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLinkedin_url() {
		return linkedin_url;
	}

	public void setLinkedin_url(String linkedin_url) {
		this.linkedin_url = linkedin_url;
	}

	public String getReg_datetime() {
		return reg_datetime;
	}

	public void setReg_datetime(String reg_datetime) {
		this.reg_datetime = reg_datetime;
	}

	public String getReg_code() {
		return reg_code;
	}

	public void setReg_code(String reg_code) {
		this.reg_code = reg_code;
	}

	public String getYears_of_experience() {
		return years_of_experience;
	}

	public void setYears_of_experience(String years_of_experience) {
		this.years_of_experience = years_of_experience;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Mentor(int id, String username, String linkedin_url, String reg_datetime, String reg_code,
			String years_of_experience, String active) {
		super();
		this.id = id;
		this.username = username;
		this.linkedin_url = linkedin_url;
		this.reg_datetime = reg_datetime;
		this.reg_code = reg_code;
		this.years_of_experience = years_of_experience;
		this.active = active;
	}

	@Override
	public String toString() {
		return "Mentor [id=" + id + ", username=" + username + ", linkedin_url=" + linkedin_url + ", reg_datetime="
				+ reg_datetime + ", reg_code=" + reg_code + ", years_of_experience=" + years_of_experience + ", active="
				+ active + "]";
	}
	
	
	

}
