package com.yodaplus.filedownloadextn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.yodaplus.filedownloadextn.service.ExtnService;

import yodaplus.resource.File;

@RestController
public class HomeController {
	
	@Autowired
	private ExtnService extnService;
	
	@RequestMapping(value="/", method= RequestMethod.GET)
	public ModelAndView showHomePage(){
		  ModelAndView mv= new ModelAndView(); 
		  mv.setViewName("home"); 
		  return mv;
	}
	
	@RequestMapping(value="/home" , method=RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public void callFileService( File file) {
		
		try {
			extnService.callDownloadFile(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
