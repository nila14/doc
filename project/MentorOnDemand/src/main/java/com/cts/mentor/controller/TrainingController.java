//package com.cts.mentor.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.cts.mentor.entity.Training;
//import com.cts.mentor.repository.TrainingRepository;
//
//
//@CrossOrigin(origins = "http://localhost:4200")
//@RestController
//@RequestMapping("/api")
//public class TrainingController {
//	
//	@Autowired
//	TrainingRepository repository;
//	
//	@GetMapping("/training")
//	public List<Training> getTrainingDetails() {
//
//	List<Training> training= new ArrayList<>();
//		repository.findAll().forEach(training::add);
//
//		return training;
//	}
//	@GetMapping("/training/getcompleted")
//    public List<Training> getCompletedTraining()
//    {
//                  System.out.println("Get all Trainings of id...");
//                  List<Training> training = repository.getCompletedTraining();
//                  return training;
//    }
//    @GetMapping("/training/getunderprogress")
//    public List<Training> getUnderProgressTrainings()
//    {
//                  System.out.println("Get all Trainings of id...");
//                  List<Training> training = repository.getUnderProgressTrainings();
//                  return training;
//    }
//    @GetMapping("/training/getapprovedtrainings")
//    public List<Training> getApprovedTrainings()
//    {
//                  System.out.println("Get all Trainings of id...");
//                  List<Training> training = repository. getApprovedTrainings();
//                  return training;
//    }
//    
//    @GetMapping("/training/getproposedtrainings")
//    public List<Training> getProposedTrainings()
//    {
//                  System.out.println("Get all Trainings of id...");
//                  List<Training> training = repository. getProposedTrainings();
//                  return training;
//    }
//
//
//	@PostMapping(value = "/training/create")
//	public Training createTraining(@RequestBody Training training) 
//	{
//		Training _training = repository.save(new Training(training.getId(),training.getUser_id(),training.getMentor_id(),training.getSkill_id(),training.getStatus(),training.getProgress(),training.getRating(),training.getStart_date(),training.getEnd_date(),training.getStart_time(),training.getEnd_time(),training.getAmount_received()));
//		return _training;
//	}
//	
//	}
//
//
