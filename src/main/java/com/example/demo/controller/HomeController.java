package com.example.demo.controller;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
	@Autowired
	private FileController fc;
	
	
	@RequestMapping(value="/", method= RequestMethod.GET)
	public ModelAndView showHomePage(){
		
		  ModelAndView mv= new ModelAndView(); mv.setViewName("home"); return mv;
		 
		//return "home";
	}
	
	@RequestMapping(value="/home", method= RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public String callDownloadFile(@RequestBody Map<String, String> paramMap) throws IOException {
		fc.downloadFile(paramMap);
		return "home";
	}
}
