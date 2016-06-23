package com.srikanth;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class Hotel {
	@InitBinder
	public void intitbinder(WebDataBinder bind ){
		//bind.setDisallowedFields(new String[]{"address.country"});
		SimpleDateFormat s = new SimpleDateFormat ("dd-MM-yyyy");
		bind.registerCustomEditor(Date.class,"da",new CustomDateEditor(s,false));
		bind.registerCustomEditor(String.class,"name", new NameEditor());
	}
	@RequestMapping(value = "/paradise", method = RequestMethod.GET)
	 public String hotel(){
		 return "hotel";
	 }
	 @RequestMapping(value = "/paradise" , method = RequestMethod.POST)
	 public String checkhotel(@ModelAttribute("cust") CustDetails custdetails,BindingResult result){
		 if(result.hasErrors()){
			 return "hotel";
		 } 
		 return "display";
	 }
}
