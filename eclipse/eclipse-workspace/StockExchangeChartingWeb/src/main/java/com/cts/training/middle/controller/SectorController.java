package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.training.dao.SectorDAO;
import com.cts.training.model.Sector;
@Controller
public class SectorController {
	@Autowired
	SectorDAO sectorDAO;
	
	@GetMapping("/sector-home")
	public String sectorPage(Model model) {
		model.addAttribute("sector",new Sector());
		return "sectorlist";
	}

	@PostMapping("/sector/save")
	public String saveUser(@ModelAttribute("sector") Sector sector) {
		sectorDAO.addSector(sector); 
		return "redirect:/sector-home";
	}

}
