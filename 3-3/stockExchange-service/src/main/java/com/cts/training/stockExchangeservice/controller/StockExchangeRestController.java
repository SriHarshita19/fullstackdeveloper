package com.cts.training.stockExchangeservice.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.stockExchangeservice.dao.StockExchangeDAO;
import com.cts.training.stockExchangeservice.model.StockExchange;
import com.cts.training.stockExchangeservice.service.StockExchangeService;
	@CrossOrigin(origins="*")
	@RestController
	public class StockExchangeRestController {
		@Autowired
		StockExchangeDAO stockExchangeDAO;
		@Autowired
		StockExchangeService stockExchangeService;
		@GetMapping("/stockexchangeall")
		
		public ResponseEntity<?>getallusers() {
			List<StockExchange> list = stockExchangeService.getAllStockExchanges();
			if(list.size()>0)
			{
				return new ResponseEntity<List<StockExchange>>(list , HttpStatus.OK);
			}
			else
			{
				return new ResponseEntity<String>("No users found",HttpStatus.OK);
			}
		}
		@GetMapping("/stockexchangeid/{id}")
		public ResponseEntity<?> getElementById(@PathVariable("id") int id) {
			try {
				StockExchange user=stockExchangeService.getElementById(id);
				return new ResponseEntity<StockExchange>(user,HttpStatus.OK);
			}catch(NoClassDefFoundError e){
				return new ResponseEntity<String>("No such user found",HttpStatus.OK);
			}
		}
		
		@PostMapping("/stockexchangeall")
		public ResponseEntity<StockExchange> save(@RequestBody StockExchange user){
			stockExchangeService.insert(user);
			return new ResponseEntity<StockExchange>(user,HttpStatus.OK);
		}
		@DeleteMapping("/deletestockExchange/{id}")
		public ResponseEntity<StockExchange> delete(@PathVariable int id){
			stockExchangeService.deleteById(id);
			return new ResponseEntity<StockExchange>(HttpStatus.OK);
		}
		@PutMapping("/updatestockExchange")
		public ResponseEntity<StockExchange> update(@RequestBody StockExchange user){
			stockExchangeService.update(user);
			return new ResponseEntity<StockExchange>(user,HttpStatus.OK);
		}
	}	
	