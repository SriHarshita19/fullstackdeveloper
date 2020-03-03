package com.cts.training.companyservice.serviceimpl;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.companyservice.dao.CompanyDAO;
import com.cts.training.companyservice.model.Company;
import com.cts.training.companyservice.service.CompanyService;
@Service
public class CompanyServiceImpl implements CompanyService{
	@Autowired
	CompanyDAO companyDAO;
	@Override
	public Company insert(Company company) {
		Company savecompany = companyDAO.save(company);
		return savecompany;
	}
	@Override
	public Company update(Company company) {
		Company companyupdate = companyDAO.save(company);
		return companyupdate;
	}
	@Override
	public void deleteById(int id) {
		companyDAO.deleteById(id);
	}
	@Override
	public Company getElementById(int id) {
		Optional<Company> company = companyDAO.findById(id);
		Company companyid = company.get();
		return companyid;
	}
	@Override
	public List<Company> getAllCompanys() {
		return companyDAO.findAll();
	}
}
