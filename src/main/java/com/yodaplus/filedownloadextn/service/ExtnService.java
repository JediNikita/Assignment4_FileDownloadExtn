package com.yodaplus.filedownloadextn.service;

import org.springframework.stereotype.Service;

import yodaplus.resource.File;


@Service

public interface ExtnService {
	
	public void callDownloadFile(File file) throws Exception;
}
