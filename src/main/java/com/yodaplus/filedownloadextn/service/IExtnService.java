package com.yodaplus.filedownloadextn.service;

import org.springframework.stereotype.Service;

import com.yodaplus.filedownloadextn.model.File;

@Service

public interface IExtnService {
	
	public void callDownloadFile(File file) throws Exception;
}
