package com.cts.training.companyservice.controller;
import java.util.List;
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

import com.cts.training.companyservice.dao.CompanyDAO;
import com.cts.training.companyservice.model.Company;
import com.cts.training.companyservice.service.CompanyService;
@CrossOrigin(origins="*")
@RestController
public class CompanyRestController {
	@Autowired
	CompanyDAO companyDAO;
	@Autowired
	CompanyService companyService;
	@GetMapping("/companyall")
	public ResponseEntity<?>getallusers() {
		List<Company> list = companyService.getAllCompanys();
		if(list.size()>0)
		{
			return new ResponseEntity<List<Company>>(list , HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("No users found",HttpStatus.OK);
		}
	}
	@GetMapping("/companyid/{id}")
	public ResponseEntity<?> getElementById(@PathVariable("id") int id) {
		try {
			Company user=companyService.getElementById(id);
			return new ResponseEntity<Company>(user,HttpStatus.OK);
		}catch(NoClassDefFoundError e){
			return new ResponseEntity<String>("No such user found",HttpStatus.OK);
		}
	}
	@PostMapping("/companyall")
	public ResponseEntity<Company> save(@RequestBody Company user){
		companyService.insert(user);
		return new ResponseEntity<Company>(user,HttpStatus.OK);
	}
	@DeleteMapping("/deletecompany/{id}")
	public ResponseEntity<Company> delete(@PathVariable int id){
		companyService.deleteById(id);
		return new ResponseEntity<Company>(HttpStatus.OK);
	}
	@PutMapping("/updatecompany")
	public ResponseEntity<Company> update(@RequestBody Company user){
		companyService.update(user);
		return new ResponseEntity<Company>(user,HttpStatus.OK);
	}
}