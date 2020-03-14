package com.cts.training.initialpublicofferingservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.initialpublicofferingservice.model.InitialPublicOffering;

public interface InitialPublicOfferingDAO extends JpaRepository<InitialPublicOffering, Integer>{
}