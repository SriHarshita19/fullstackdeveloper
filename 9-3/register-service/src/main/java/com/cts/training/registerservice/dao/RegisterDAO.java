package com.cts.training.registerservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.registerservice.model.Register;

@Repository
public interface RegisterDAO extends JpaRepository<Register, Integer>  {
	public Register findByEmail(String email);

}
