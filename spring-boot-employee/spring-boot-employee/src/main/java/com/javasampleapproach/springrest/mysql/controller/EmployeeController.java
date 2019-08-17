package com.javasampleapproach.springrest.mysql.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.springrest.mysql.model.Customer;
import com.javasampleapproach.springrest.mysql.model.Employee;
import com.javasampleapproach.springrest.mysql.repo.CustomerRepository;
import com.javasampleapproach.springrest.mysql.repo.EmployeeRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EmployeeController  {

	@Autowired
	EmployeeRepository repository;

	@GetMapping("/employee")
	public List<Employee> getAllEmployee() {
		System.out.println("Get all Employee...");

		List<Employee> employee = new ArrayList<>();
		repository.findAll().forEach(employee::add);

		return employee;
	}

	@PostMapping(value = "/employee/create")
	public ResponseEntity<Void> postCustomer(@RequestBody Employee employee) {

		 repository.save(new Employee(employee.getName(), employee.getAge()));
		  return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	/*@DeleteMapping("/customers/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("id") long id) {
		System.out.println("Delete Customer with ID = " + id + "...");

		repository.deleteById(id);

		return new ResponseEntity<>("Customer has been deleted!", HttpStatus.OK);
	}*/

	@DeleteMapping("/employee/delete")
	public ResponseEntity<String> deleteAllEmployee() {
		System.out.println("Delete All Customers...");

		repository.deleteAll();

		return new ResponseEntity<String>("All employees have been deleted!", HttpStatus.OK);
	}

	/*@GetMapping(value = "customers/age/{age}")
	public List<Customer> findByAge(@PathVariable int age) {

		List<Customer> customers = repository.findByAge(age);
		return customers;
	}

	@PutMapping("/customers/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable("id") long id, @RequestBody Customer customer) {
		System.out.println("Update Customer with ID = " + id + "...");

		Optional<Customer> customerData = repository.findById(id);

		if (customerData.isPresent()) {
			Customer _customer = customerData.get();
			_customer.setName(customer.getName());
			_customer.setAge(customer.getAge());
			_customer.setActive(customer.isActive());
			return new ResponseEntity<>(repository.save(_customer), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}*/
}
