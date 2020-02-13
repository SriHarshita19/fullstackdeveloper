package com.cts.training.middle.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cts.training.model.User;
import com.cts.training.dao.UserDAO;
@Controller
   public class HomeController {
	@Autowired
	private UserDAO userDAO;
//	@GetMapping("/")
	@RequestMapping("/")
   public String indexPage(Model model) {
		model.addAttribute("message","Welcome to Spring MVC");
	//	List<String> names=new ArrayList<String>();
		List<User> users=userDAO.getAllUsers();
		model.addAttribute("list",users);
//		addNames(names);
	//	model.addAttribute("list",names);
	  return "index";
  }
private void addNames(List<String> names) {
	names.add("divya");
	names.add("hameem");
	names.add("aneena");
	names.add("malavika");
}
}