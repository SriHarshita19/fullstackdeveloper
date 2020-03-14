package com.cts.training.middle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.training.dao.StockExchangeDAO;
import com.cts.training.model.StockExchange;
@Controller
public class StockExchangeController {
	@Autowired
	StockExchangeDAO stockExchangeDAO;
	
	@GetMapping("/stockExchange-home")
	public String stockExchangePage(Model model) {
		model.addAttribute("stockExchange",new StockExchange());
		return "stockExchangelist";
	}

	@PostMapping("/stockExchange/save")
	public String saveUser(@ModelAttribute("stockExchange") StockExchange stockExchange) {
		stockExchangeDAO.addStockExchange(stockExchange); 
		return "redirect:/stockExchange-home";
	}
}
