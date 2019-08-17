package com.cts.mentor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mentor_skills")

public class MentorSkills {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "mid")
	private int mid;
	
	@Column(name = "sid")
	private int sid;
	
	@Column(name = "self_rating")
	private String self_rating;
	
	@Column(name = "years_of_experience")
	private String years_of_experience;
	
	@Column(name = "trainings_delivered")
	private String trainings_delivered;
	
	@Column(name = "facilities_offered")
	private String facilities_offered;

	public MentorSkills(int id, int mid, int sid, String self_rating, String years_of_experience,
			String trainings_delivered, String facilities_offered) {
		super();
		this.id = id;
		this.mid = mid;
		this.sid = sid;
		this.self_rating = self_rating;
		this.years_of_experience = years_of_experience;
		this.trainings_delivered = trainings_delivered;
		this.facilities_offered = facilities_offered;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSelf_rating() {
		return self_rating;
	}

	public void setSelf_rating(String self_rating) {
		this.self_rating = self_rating;
	}

	public String getYears_of_experience() {
		return years_of_experience;
	}

	public void setYears_of_experience(String years_of_experience) {
		this.years_of_experience = years_of_experience;
	}

	public String getTrainings_delivered() {
		return trainings_delivered;
	}

	public void setTrainings_delivered(String trainings_delivered) {
		this.trainings_delivered = trainings_delivered;
	}

	public String getFacilities_offered() {
		return facilities_offered;
	}

	public void setFacilities_offered(String facilities_offered) {
		this.facilities_offered = facilities_offered;
	}

	@Override
	public String toString() {
		return "MentorSkills [id=" + id + ", mid=" + mid + ", sid=" + sid + ", self_rating=" + self_rating
				+ ", years_of_experience=" + years_of_experience + ", trainings_delivered=" + trainings_delivered
				+ ", facilities_offered=" + facilities_offered + "]";
	}

}
