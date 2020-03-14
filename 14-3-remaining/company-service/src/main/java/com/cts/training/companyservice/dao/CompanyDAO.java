package com.cts.training.companyservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.companyservice.model.Company;

public interface CompanyDAO  extends JpaRepository<Company, Integer>{

}
