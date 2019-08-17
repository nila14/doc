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
@Table(name = "technology")

public class Technologies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	@Column(name = "name")
	private String name;
	
	
	@Column(name = "toc")
	private String toc;
	
	
	@Column(name = "duration")
	private String duration;
	
	
	@Column(name = "prerequites")
	private String prerequites;
    
	public Technologies()
	{
		
	}
	

	public Technologies(long id, String name, String toc, String duration, String prerequites) {
		super();
		this.id = id;
		this.name = name;
		this.toc = toc;
		this.duration = duration;
		this.prerequites = prerequites;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getToc() {
		return toc;
	}

	public String getDuration() {
		return duration;
	}

	public String getPrerequites() {
		return prerequites;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setToc(String toc) {
		this.toc = toc;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public void setPrerequites(String prerequites) {
		this.prerequites = prerequites;
	}

	@Override
	public String toString() {
		return "Technologies [id=" + id + ", name=" + name + ", toc=" + toc + ", duration=" + duration
				+ ", prerequites=" + prerequites + "]";
	}

	

}
