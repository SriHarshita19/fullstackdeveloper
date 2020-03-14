package com.example.demo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProductRestServiceController {
	@Autowired
	 ProductRepo productRepo;
	@RequestMapping(value = "/products",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> findAll(){
		return productRepo.findAll();
	}
	@RequestMapping(value = "/products/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Product findById(@PathVariable int id){
		Optional<Product> productOpt = productRepo.findById(id);
		Product product = productOpt.get();
		return product;
	}
	@RequestMapping(value = "/product",method = RequestMethod.POST)
	public Product addProduct(@RequestBody Product product) {
		return productRepo.save(product);
	}
	@RequestMapping(value = "/product/{id}",method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable int id) {
		productRepo.deleteById(id);
	}
}