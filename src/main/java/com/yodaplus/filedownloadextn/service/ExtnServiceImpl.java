package com.yodaplus.filedownloadextn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yodaplus.filedownload.service.FileService;

import yodaplus.resource.File;



@Service
public class ExtnServiceImpl implements ExtnService {
	
	@Autowired
	private FileService fs;
	
	@Override
	public void callDownloadFile(File file) throws Exception {
//		ObjectMapper mapper = new ObjectMapper();
//		String jsonString = mapper.writeValueAsString(file);
		
		fs.writeFile(file);
	}

}
