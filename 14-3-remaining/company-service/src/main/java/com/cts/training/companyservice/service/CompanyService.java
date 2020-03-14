package com.cts.training.companyservice.service;
import java.util.List;

import com.cts.training.companyservice.model.Company;
public interface CompanyService {
	public Company insert(Company company);
	public Company update(Company company);
	public void deleteById(int id);
	public Company getElementById(int id);
	public List<Company> getAllCompanys();
}