package com.cts.training.registerservice.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.registerservice.model.Register;

@Repository
public interface RegisterDAO extends JpaRepository<Register, Integer>  {
	public Register findByEmail(String email);
	public Optional<Register> findByUsernameAndPassword(String username, String password);

}
