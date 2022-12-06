package com.hetery.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.hetery.service.AccountService;

@Controller
public class HomeController {
	@Autowired
	AccountService accService;
	
	@GetMapping("/index")
    public String index() {
		String timestampString = accService.findByUsername("admin").getDatecreate();
		
		long timestampConverted = Long.parseLong(timestampString)*1000;
		Date date = new Date(timestampConverted);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy' 'HH:mm:ss");

		System.out.println(simpleDateFormat.format(date));

		return "OK";
    }
}
