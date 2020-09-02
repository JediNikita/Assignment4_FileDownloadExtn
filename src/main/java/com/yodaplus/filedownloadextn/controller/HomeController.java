package com.yodaplus.filedownloadextn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.yodaplus.filedownloadextn.model.File;
import com.yodaplus.filedownloadextn.service.IExtnService;

@RestController
public class HomeController {
	
	@Autowired
	private IExtnService extnService;
	
	@RequestMapping(value="/", method= RequestMethod.GET)
	public ModelAndView showHomePage(){
		  ModelAndView mv= new ModelAndView(); mv.setViewName("home"); return mv;
	}
	
	@RequestMapping(value="/home" , method=RequestMethod.POST)
	public void callFileService(@RequestBody File file) {
		
		try {
			extnService.callDownloadFile(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
