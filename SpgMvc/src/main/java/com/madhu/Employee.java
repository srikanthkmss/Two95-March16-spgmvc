package com.madhu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Employee {
	
	@RequestMapping("/employee")
	public String sendEmployee(Model model){
		model.addAttribute("msg", "Employee Details");
		model.addAttribute("message","Hai");
		return "enquiry";
	}
}
