package com.cts.training.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.model.Register;
import com.cts.training.repo.RegisterRepo;
@RestController
public class RegisterController {
	@Autowired
	RegisterRepo rr;
	
	@GetMapping("/register")
	public List<Register> findAll() {
		return rr.findAll();
	}
	
	@GetMapping("/register/{id}")
	public Register findOne(@PathVariable int id) {
		Optional<Register> reg = rr.findById(id);
		Register us = reg.get();
		return us;
	}
	
	@PostMapping("/register")
	public Register save(@RequestBody Register reg) {
		Register us = rr.save(reg);
		return us;
	}
	
	@DeleteMapping("/register/{id}")
	public void delete(@PathVariable int id) {
		rr.deleteById(id);
	}
	
	@PutMapping("/register")
	public Register update(@RequestBody Register reg) {
		Register us = rr.save(reg);
		return us;
	}
}


