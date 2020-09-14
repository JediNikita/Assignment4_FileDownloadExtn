package com.yodaplus.filedownloadextn.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.yodaplus.filedownload.service.FileService;

@Configuration
public class RootConfig implements WebMvcConfigurer {
	
	@Value("${assignment2.fileservice.url}")
	private String fsurl;
	
	public HttpInvokerProxyFactoryBean exporter() {
		HttpInvokerProxyFactoryBean b = new HttpInvokerProxyFactoryBean();
		b.setServiceUrl(fsurl);
		b.setServiceInterface(FileService.class);
		return b;
	}
	
}
