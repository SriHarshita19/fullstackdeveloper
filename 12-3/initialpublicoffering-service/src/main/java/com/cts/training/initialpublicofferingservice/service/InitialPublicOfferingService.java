package com.cts.training.initialpublicofferingservice.service;

import java.util.List;

import com.cts.training.initialpublicofferingservice.model.InitialPublicOffering;


public interface InitialPublicOfferingService {
	public InitialPublicOffering insert(InitialPublicOffering initialpublicoffering);
	public  InitialPublicOffering update(InitialPublicOffering initialpublicoffering);
	public void deleteById(int id);
	public InitialPublicOffering getElementById(int id);
	public List<InitialPublicOffering> getAllInitialPublicOfferings();
}
