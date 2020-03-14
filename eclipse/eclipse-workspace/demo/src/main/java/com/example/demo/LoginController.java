package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
@Controller
public class LoginController {
	@RequestMapping(value= "/login", method = RequestMethod.GET)
	public String showLogin(ModelMap model)
	{
		return "login";
	}
	@RequestMapping(value= "/login", method= RequestMethod.POST)
	public String showWelcome(@RequestParam String nm, ModelMap model)
	{
	model.put("name",  nm);
	return "welcome";
    }
}