package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.example.demo.config.WebConfig;

@Configuration
@ComponentScan(basePackages = "com.example")
@Import({ WebConfig.class})
@EnableAutoConfiguration
public class Assignment4FileDownloadExtnApplication {
	
	 private static Class applicationClass = Assignment4FileDownloadExtnApplication.class;

	public static void main(String[] args) {
		SpringApplication.run(Assignment4FileDownloadExtnApplication.class, args);
	}
	
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(applicationClass);
	    }
}
