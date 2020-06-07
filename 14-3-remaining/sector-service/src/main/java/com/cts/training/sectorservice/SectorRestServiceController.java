package com.cts.training.sectorservice;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.sectorservice.feign.RegisterServiceProxy;


@RestController
@CrossOrigin(origins="*")
public class SectorRestServiceController {
	Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	SectorRepo sectorRepo;
	
	@Autowired
	SectorService sectorService;
	
	@Autowired
	private RegisterServiceProxy proxy;
	
	@GetMapping(value="/sector",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Sector> findAll(){
		return sectorRepo.findAll();
	}
	@RequestMapping(value="/sector/{id}", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Sector findone(@PathVariable int id){
		Optional<Sector> sector = sectorRepo.findById(id);
		Sector sect = sector.get();
		return sect;
	}
	@RequestMapping(value="/sector", method= RequestMethod.POST)
	public Sector save(@RequestBody Sector sector){
		Sector sec = sectorRepo.save(sector);
		return sec;
	}
	@RequestMapping(value="/sector/{id}", method= RequestMethod.DELETE)
	public void delete(@PathVariable int id){
		sectorRepo.deleteById(id);
	}
	@RequestMapping(value = "/sector", method = RequestMethod.PUT)
	public Sector update(@RequestBody Sector sector) {
		Sector sect = sectorRepo.save(sector);
		return sect;
	}
    @GetMapping(value="/register-proxy")
    public ResponseEntity<?>getallusers()
    {
    	return proxy.getallusers();
    }
    @GetMapping(value="/register-by-sector",produces="application/json")
    public ResponseEntity<?>getAllUsersBySector()
    {
    	logger.info("Get all users invoked");
    	ResponseEntity<?>users=proxy.getallusers();
    	logger.info("Information-->{}",users);
    	return users;
    }

}