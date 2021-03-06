package com.cts.training.registerservice.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.registerservice.DTO.RegisterDTO;
import com.cts.training.registerservice.dao.RegisterDAO;
import com.cts.training.registerservice.service.RegisterService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class RegisterRestController {
	Logger logger=LoggerFactory.getLogger(this.getClass());
	@Autowired
	RegisterDAO registerDAO;
	
	@Autowired
	RegisterService registerService;
	
	@GetMapping("/login")
	public ResponseEntity<?>login(HttpServletRequest request){
		
		String authorization=request.getHeader("Authorization");
		logger.info("Login attempt with token-->{}",authorization);
		String username=null;
		String password=null;
		if(authorization!=null && authorization.startsWith("Basic"))
		{
			String base64Credentials=authorization.substring("Basic".length()).trim();
			byte[] credDecoded=Base64.getDecoder().decode(base64Credentials);
			String credentials=new String(credDecoded,StandardCharsets.UTF_8);
			username=credentials.split(":")[0];
			password=credentials.split(":")[1];
		}
		try {
			RegisterDTO register=registerService.getUserBynameAndPassword(username,password);
			logger.info("user logged in using username-->{}",username);
			return new ResponseEntity<RegisterDTO>(register,HttpStatus.OK);
		}
		catch(Exception e){
			System.out.println(e.getStackTrace());
			logger.info("Unauthorized access stack trace-->{}",e.getStackTrace().toString());
			return new ResponseEntity<String>("no user found",HttpStatus.OK);
		}
	}
	

	@GetMapping("/register/{id}")
	public ResponseEntity<?> getElementById(@PathVariable("id") int id) {
		try {
			RegisterDTO user=registerService.getElementById(id);
			return new ResponseEntity<RegisterDTO>(user,HttpStatus.OK);
		}catch(NoClassDefFoundError e){
			return new ResponseEntity<String>("No such user found",HttpStatus.OK);
		}
	}
	
	@GetMapping("/register")
	public ResponseEntity<?>getallusers() {
		List<RegisterDTO> list = registerService.getAllUsers();
		if(list.size()>0)
		{
			return new ResponseEntity<List<RegisterDTO>>(list , HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("No users found",HttpStatus.OK);
		}
	}
	
	@PostMapping("/register")
	public ResponseEntity<RegisterDTO> save(@RequestBody RegisterDTO user){
		registerService.insert(user);
		return new ResponseEntity<RegisterDTO>(user,HttpStatus.OK);
	}
	

	
	@DeleteMapping("/register/{id}")
	public ResponseEntity<RegisterDTO> delete(@PathVariable int id){
		registerService.delete(id);
		return new ResponseEntity<RegisterDTO>(HttpStatus.OK);
	}
	
	@PutMapping("/register")
	public ResponseEntity<RegisterDTO> update(@RequestBody RegisterDTO user){
		registerService.update(user);
		return new ResponseEntity<RegisterDTO>(user,HttpStatus.OK);
	}

	@RequestMapping(value="/reg",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public String reg() {
		return "{\"reg\":\"ok\"}";
	}
	
	@RequestMapping(value="register/activate",method= RequestMethod.PUT)
	public ResponseEntity<String> activate(@RequestBody String email){
		registerService.activate(email);
		return new ResponseEntity<String>(email,HttpStatus.OK);
	}
    
	
}