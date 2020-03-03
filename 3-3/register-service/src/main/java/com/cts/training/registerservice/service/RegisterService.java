package com.cts.training.registerservice.service;

import java.util.List;

import com.cts.training.registerservice.DTO.RegisterDTO;

public interface RegisterService {

	public RegisterDTO insert(RegisterDTO user);
	
	public RegisterDTO update(RegisterDTO user);
	
	public void delete(int id);
	
	public RegisterDTO getElementById(int id);
	
	public String activate(String email);
	
	public List<RegisterDTO> getAllUsers();
	
	}
