package com.cts.training.StockPriceservice;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;


//import com.cts.training.model.StockPrice;

public interface StockPriceService {
	public StockPrice insert(StockPrice  stockPrice );
	public void deleteById(int id);
	public StockPrice  update(StockPrice  stockPrices );
	public List<StockPrice > getAllStockPrices();
	public StockPrice  getElementById(int id);
	public ImporttSummary addStockPricesFromExcelSheet(MultipartFile multiPartFile) throws Exception;
	public List<StockPriceOnPeriod>getCompanyStockPriceBetween(String companyCode,String stockExchange,LocalDate startDate,LocalDate endDate);
}
