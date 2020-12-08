package com.displayDate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String homepage() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		//get the current date
		Date currentDate = new Date();
		
		//set format the date Saturday, the 22 of January, 2028
		SimpleDateFormat formatter = new SimpleDateFormat("EEEE', the ' d ' of ' MMMM', ' yyyy", Locale.ENGLISH);
		
		//apply format to the date
		String formatted_date = formatter.format(currentDate);
		
		//add the date to the model
		model.addAttribute("currentDate", formatted_date);
		
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		//get the current time
		Date currentTime = new Date();
		
		//set format 11:30 PM
		SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a", Locale.ENGLISH);
		
		//apply format to the time
		String formatted_time = formatter.format(currentTime);
		
		//add the time to the model
		model.addAttribute("currentTime", formatted_time);
		return "time.jsp";
	}

}
