package com.cts.mentor.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.mentor.entity.Mentor;
import com.cts.mentor.entity.MentorCalender;
import com.cts.mentor.entity.MentorSkills;
import com.cts.mentor.repository.MentorCalenderRepository;
import com.cts.mentor.repository.MentorRepository;
import com.cts.mentor.repository.MentorSkillRepository;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")

public class MentorController {
	
	@Autowired
	MentorRepository repository;
	MentorSkillRepository repo;
	MentorCalenderRepository repos;
	
	@GetMapping("/mentor/getSearchresult/{id}")
//	public List<Mentor> findById(@PathVariable int id) 
//	{
//		List<Mentor> mentor = (List<Mentor>) repository.findById(id);
//		return mentor;
//		
//	}
//	@GetMapping("/mentorSkills/getSearchresult/{id}")
//	public List<MentorSkills> findById1(@PathVariable int id) 
//	{
//		List<MentorSkills> mentorskills=(List<MentorSkills>) repo.findById1(id);
//		return mentorskills;
//		
//	}
	public Optional<Mentor> getMenorDetails(@PathVariable int id)
	{
		//List mentordetails= new ArrayList<>();
		Optional<Mentor> mentor=repository.findById(id);
		//Optional<MentorSkills> mentorskills=repo.findById(id);
		//Optional<MentorCalender> mentorcalender=repos.findById(id);
		//mentordetails.add(mentor);
		//mentordetails.add(mentorskills);
		//mentordetails.add(mentorcalender);
		return mentor;
		
	}
	
	
}
