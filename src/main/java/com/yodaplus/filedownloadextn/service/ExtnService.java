package com.yodaplus.filedownloadextn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yodaplus.filedownload.service.IFileService;
import com.yodaplus.filedownloadextn.model.File;



@Service
public class ExtnService implements IExtnService {
	
	@Autowired
	private IFileService fs;
	
	@Override
	public void callDownloadFile(File file) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writeValueAsString(file);
		
		fs.writeFile(file.getFileName(), file.getUrl(), file.getPath());
	}

}
