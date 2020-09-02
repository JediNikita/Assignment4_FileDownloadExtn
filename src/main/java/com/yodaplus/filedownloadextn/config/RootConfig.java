package com.yodaplus.filedownloadextn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.yodaplus.filedownload.service.IFileService;

@Configuration
public class RootConfig implements WebMvcConfigurer {
	
	public HttpInvokerProxyFactoryBean exporter() {
		HttpInvokerProxyFactoryBean b = new HttpInvokerProxyFactoryBean();
		b.setServiceUrl("http://localhost:8081/FileService");
		b.setServiceInterface(IFileService.class);
		return b;
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry vcr) {
		vcr.addViewController("/").setViewName("home");
	}
}
