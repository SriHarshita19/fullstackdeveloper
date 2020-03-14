package com.cts.training.initialpublicofferingservice.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.initialpublicofferingservice.dao.InitialPublicOfferingDAO;
import com.cts.training.initialpublicofferingservice.model.InitialPublicOffering;
import com.cts.training.initialpublicofferingservice.service.InitialPublicOfferingService;
@Service 
public class InitialPublicOfferingServiceImpl implements InitialPublicOfferingService{
@Autowired
InitialPublicOfferingDAO initialpublicofferingDAO;
	@Override
	public InitialPublicOffering insert(InitialPublicOffering initialpublicoffering) {
		// TODO Auto-generated method stub
		InitialPublicOffering saveinitialpublicoffering = initialpublicofferingDAO.save(initialpublicoffering);
		return saveinitialpublicoffering;
		
	}

	@Override
	public InitialPublicOffering update(InitialPublicOffering initialpublicoffering) {
		// TODO Auto-generated method stub
		InitialPublicOffering initialpublicofferingupdate = initialpublicofferingDAO.save(initialpublicoffering);
		return initialpublicofferingupdate;
		
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		initialpublicofferingDAO.deleteById(id);
	}

	@Override
	public InitialPublicOffering getElementById(int id) {
		// TODO Auto-generated method stub
		Optional<InitialPublicOffering> initialpublicoffering = initialpublicofferingDAO.findById(id);
		InitialPublicOffering initialpublicofferingid = initialpublicoffering.get();
		return initialpublicofferingid;

	}

	@Override
	public List<InitialPublicOffering> getAllInitialPublicOfferings() {
		// TODO Auto-generated method stub
		return initialpublicofferingDAO.findAll();
	}

	
	
}
