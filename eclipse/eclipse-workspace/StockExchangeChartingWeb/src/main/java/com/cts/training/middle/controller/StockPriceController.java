package com.cts.training.middle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.training.dao.StockPriceDAO;
import com.cts.training.model.StockPrice;
@Controller
public class StockPriceController {
	@Autowired
	StockPriceDAO stockPriceDAO;
	
	@GetMapping("/stockPrice-home")
	public String stockPricePage(Model model) {
		model.addAttribute("stockPrice",new StockPrice());
		return "stockPricelist";
	}

	@PostMapping("/stockPrice/save")
	public String saveUser(@ModelAttribute("stockPrice") StockPrice stockPrice) {
		stockPriceDAO.addStockPrice(stockPrice); 
		return "redirect:/stockPrice-home";
	}
}
