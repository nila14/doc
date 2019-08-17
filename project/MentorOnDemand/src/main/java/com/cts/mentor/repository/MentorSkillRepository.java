package com.cts.mentor.repository;



import org.springframework.data.repository.CrudRepository;


import com.cts.mentor.entity.MentorSkills;

public interface MentorSkillRepository extends CrudRepository<MentorSkills, Integer> {
	
	
}
