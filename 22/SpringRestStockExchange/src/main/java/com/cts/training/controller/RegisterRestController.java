package com.cts.training.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cts.training.model.Register;
import com.cts.training.repo.RegisterRepo;

@CrossOrigin(origins="*")
@RestController
public class RegisterRestController {

	@Autowired
	RegisterRepo ur;
	
	@GetMapping("/registerall")
	public List<Register> findAll() {
		return ur.findAll();
	}
	
	@GetMapping("/registerid/{id}")
	public Register findOne(@PathVariable int id) {
		Optional<Register> usr = ur.findById(id);
		Register us = usr.get();
		return us;
	}
	
	@PostMapping("/saveregister")
	public Register save(@RequestBody Register usr) {
		Register us = ur.save(usr);
		return us;
	}
	
	@DeleteMapping("/deleteregister/{id}")
	public void delete(@PathVariable int id) {
		ur.deleteById(id);
	}
	
	@PutMapping("/updateregister")
	public Register update(@RequestBody Register usr) {
		Register us = ur.save(usr);
		return us;
	}
}
