package com.cts.training.initialpublicofferingservice.controller;
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
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.initialpublicofferingservice.dao.InitialPublicOfferingDAO;
import com.cts.training.initialpublicofferingservice.model.InitialPublicOffering;
import com.cts.training.initialpublicofferingservice.service.InitialPublicOfferingService;


	@CrossOrigin(origins="*")
	@RestController
	public class InitialPublicOfferingRestController {
		@Autowired
		InitialPublicOfferingDAO initialpublicofferingDAO;
		@Autowired
		InitialPublicOfferingService initialpublicofferingService;
		@GetMapping("/ipoall")
		
		public ResponseEntity<?>getallusers() {
			List<InitialPublicOffering> list = initialpublicofferingService.getAllInitialPublicOfferings();
			if(list.size()>0)
			{
				return new ResponseEntity<List<InitialPublicOffering>>(list , HttpStatus.OK);
			}
			else
			{
				return new ResponseEntity<String>("No users found",HttpStatus.NOT_FOUND);
			}
		}
		@GetMapping("/ipoid/{id}")
		public ResponseEntity<?> getElementById(@PathVariable("id") int id) {
			try {
				InitialPublicOffering user=initialpublicofferingService.getElementById(id);
				return new ResponseEntity<InitialPublicOffering>(user,HttpStatus.FOUND);
			}catch(NoClassDefFoundError e){
				return new ResponseEntity<String>("No such user found",HttpStatus.NOT_FOUND);
			}
		}
		
		@PostMapping("/ipoall")
		public ResponseEntity<InitialPublicOffering> save(@RequestBody InitialPublicOffering user){
			initialpublicofferingService.insert(user);
			return new ResponseEntity<InitialPublicOffering>(user,HttpStatus.CREATED);
		}
		@DeleteMapping("/deleteipo/{id}")
		public ResponseEntity<InitialPublicOffering> delete(@PathVariable int id){
			initialpublicofferingService.deleteById(id);
			return new ResponseEntity<InitialPublicOffering>(HttpStatus.MOVED_PERMANENTLY);
		}
		@PutMapping("/updateipo")
		public ResponseEntity<InitialPublicOffering> update(@RequestBody InitialPublicOffering user){
			initialpublicofferingService.update(user);
			return new ResponseEntity<InitialPublicOffering>(user,HttpStatus.OK);
		}
	}	
	