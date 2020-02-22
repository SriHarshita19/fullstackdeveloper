package com.cts.training.restresources;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cts.training.model.Register;

@RepositoryRestResource(path = "register", collectionResourceRel = "register")
public interface RegisterRestResources extends PagingAndSortingRepository<Register, Integer>{

}
