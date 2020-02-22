package com.cts.training.restresources;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cts.training.model.Company;
@RepositoryRestResource(path = "company", collectionResourceRel = "company")
public interface CompanyRestResources extends PagingAndSortingRepository<Company, Integer>{
 
}
