package com.cts.mentor.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.mentor.entity.Mentor;
import com.cts.mentor.entity.Technologies;
import com.cts.mentor.repository.TechnologyRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")

public class TechnologyController {
	
	@Autowired
	TechnologyRepository repository;
	
	@GetMapping("/technology/getSkill/{id}")
	public Optional<Technologies> getSkills(@PathVariable long id)
	{
		
		Optional<Technologies> tech=repository.findById(id);
		return tech;
		
	}
	

}
