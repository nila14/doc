package com.cts.mentor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "training")

public class Training {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "user_id")
	private int user_id;
	
	
	@Column(name = "mentor_id")
	private int mentor_id;
	
	
	@Column(name = "skill_id")
	private int skill_id;
	
	@Column(name = "status")
	private String status;
	
	
	@Column(name = "progress")
	private String progress;
	
	
	@Column(name = "rating")
	private int rating;
	

	@Column(name = "start_date")
	private String start_date;
	
	
	@Column(name = "end_date")
	private String end_date;
	
	
	@Column(name = "start_time")
	private String start_time;
	
	
	@Column(name = "end_time")
	private String end_time;
	
	
	@Column(name = "amount_received")
	private long amount_received;


	public Training(int id, int user_id, int mentor_id, int skill_id, String status, String progress, int rating,
			String start_date, String end_date, String start_time, String end_time, long amount_received) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.mentor_id = mentor_id;
		this.skill_id = skill_id;
		this.status = status;
		this.progress = progress;
		this.rating = rating;
		this.start_date = start_date;
		this.end_date = end_date;
		this.start_time = start_time;
		this.end_time = end_time;
		this.amount_received = amount_received;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public int getMentor_id() {
		return mentor_id;
	}


	public void setMentor_id(int mentor_id) {
		this.mentor_id = mentor_id;
	}


	public int getSkill_id() {
		return skill_id;
	}


	public void setSkill_id(int skill_id) {
		this.skill_id = skill_id;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getProgress() {
		return progress;
	}


	public void setProgress(String progress) {
		this.progress = progress;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public String getStart_date() {
		return start_date;
	}


	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}


	public String getEnd_date() {
		return end_date;
	}


	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}


	public String getStart_time() {
		return start_time;
	}


	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}


	public String getEnd_time() {
		return end_time;
	}


	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}


	public long getAmount_received() {
		return amount_received;
	}


	public void setAmount_received(long amount_received) {
		this.amount_received = amount_received;
	}


	@Override
	public String toString() {
		return "Training [id=" + id + ", user_id=" + user_id + ", mentor_id=" + mentor_id + ", skill_id=" + skill_id
				+ ", status=" + status + ", progress=" + progress + ", rating=" + rating + ", start_date=" + start_date
				+ ", end_date=" + end_date + ", start_time=" + start_time + ", end_time=" + end_time
				+ ", amount_received=" + amount_received + "]";
	}


	
	
	
}
