package com.cts.training.StockPriceservice;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

//import com.cts.training.dao.InitialPublicOfferingDAO;
//import com.cts.training.dao.StockExchangeDAO;
//import com.cts.training.dao.StockPriceDAO;
//import com.cts.training.model.InitialPublicOffering;
//import com.cts.training.model.StockExchange;
//import com.cts.training.model.StockPrice;
//import com.cts.training.service.StockExchangeService;
//import com.cts.training.service.StockPriceService;

@CrossOrigin(origins="*")
@RestController
public class StockPriceRestController {
	@Autowired
	StockPriceDAO stockPriceDAO;
	@Autowired
	StockPriceService stockPriceService;
	Logger logger=LoggerFactory.getLogger(this.getClass());
	@GetMapping("/stockprice")
	public ResponseEntity<?>getallstockPrices() {
		List<StockPrice> list = stockPriceService.getAllStockPrices();
		if(list.size()>0)
		{
			return new ResponseEntity<List<StockPrice>>(list , HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("No users found",HttpStatus.OK);
		}
	}
	@GetMapping("/stockprice/{id}")
	public ResponseEntity<?> getElementById(@PathVariable("id") int id) {
		try {
			StockPrice stockPrice=stockPriceService.getElementById(id);
			return new ResponseEntity<StockPrice>(stockPrice,HttpStatus.OK);
		}catch(NoClassDefFoundError e){
			return new ResponseEntity<String>("No such user found",HttpStatus.OK);
		}
	}
	@PostMapping("/stockprice")
	public ResponseEntity<StockPrice> save(@RequestBody StockPrice stockPrice){
		stockPriceService.insert(stockPrice);
		return new ResponseEntity<StockPrice>(stockPrice,HttpStatus.OK);
	}
	@DeleteMapping("/stockprice/{id}")
	public ResponseEntity<StockPrice> delete(@PathVariable int id){
		stockPriceService.deleteById(id);
		return new ResponseEntity<StockPrice>(HttpStatus.OK);
	}
	@PutMapping("/stockprice")
	public ResponseEntity<StockPrice> update(@RequestBody StockPrice stockPrice){
		stockPriceService.update(stockPrice);
		return new ResponseEntity<StockPrice>(stockPrice,HttpStatus.OK);
	}
	@PostMapping(value="/stockPrices/uploadStocksSheet",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?>uploadStocksSheet(@RequestParam("stocksSheet") MultipartFile file){
		logger.info("File received:{}",file.getOriginalFilename());
		if(file.getOriginalFilename().endsWith(".xls") || file.getOriginalFilename().endsWith(".xlsx")) {
			try {
		    	  return new ResponseEntity<ImporttSummary>(stockPriceService.addStockPricesFromExcelSheet(file),HttpStatus.OK)
		    			  ;
		      }catch(IOException e) {
		    	  e.printStackTrace();
		    	  return new ResponseEntity<String>("Error reading file.",HttpStatus.BAD_REQUEST);
		      }catch(Exception e) {
					e.printStackTrace();
					return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
				}
			}else {
				return new ResponseEntity<String>("wrong file extension",HttpStatus.BAD_REQUEST);
			}
		}
		
	@GetMapping(value = "/stockPrices/companyStockPriceBetween/{companyCode}/{stockExchange}/{startDate}/{endDate}", 
			produces = "application/json")
	public ResponseEntity<?> getCompanyStockPricePerDayBetween(@PathVariable String companyCode,
			@PathVariable String stockExchange, @PathVariable String startDate, @PathVariable String endDate) {
		return new ResponseEntity<List<StockPriceOnPeriod>>(stockPriceService.getCompanyStockPriceBetween(companyCode,
				stockExchange, LocalDate.parse(startDate), LocalDate.parse(endDate)), HttpStatus.OK);
	}
	}

