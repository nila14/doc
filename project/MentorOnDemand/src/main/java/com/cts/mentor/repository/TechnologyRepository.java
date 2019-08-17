package com.cts.mentor.repository;


import org.springframework.data.repository.CrudRepository;


import com.cts.mentor.entity.Technologies;

public interface TechnologyRepository extends  CrudRepository<Technologies, Long> {

	

}
