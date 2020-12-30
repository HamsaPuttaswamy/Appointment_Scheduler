package com.appointment.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class AppController {
	
	@Autowired
	private UserRepo repo;
	
	@Autowired
	private AdvisorRepo repoadv;
	
	@PostMapping("/Register")
	public String CreateUser(@RequestBody User user) {
		repo.save(user);
		return "saved object";
	
	}
		
	@GetMapping("Signup/{name}")
	public User getUser(@PathVariable("name") String username){
		return repo.findByusername(username);
		
	}
	
	@GetMapping("Advisors/{Dep}")
	public List<Advisor> getAdvisor(@PathVariable("Dep") String department) {
		return repoadv.findAllByDepartment(department);
	}
	
	
	
}
