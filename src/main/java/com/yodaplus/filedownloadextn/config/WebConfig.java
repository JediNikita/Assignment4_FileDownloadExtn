package com.yodaplus.filedownloadextn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter
{
    @Bean
    public InternalResourceViewResolver viewResolver() {
    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    resolver.setPrefix("WEB-INF/views/");     
    resolver.setSuffix(".jsp");
    //resolver.setExposeContextBeansAsAttributes(true);
    return resolver;
    }

    @Override
    public void configureDefaultServletHandling(
    DefaultServletHandlerConfigurer configurer) {
    configurer.enable();
    }
    
	/*
	 * @Bean public HttpInvokerProxyFactoryBean invoker() {
	 * HttpInvokerProxyFactoryBean invoker = new HttpInvokerProxyFactoryBean();
	 * invoker.setServiceUrl("http://localhost:8081/downloadFile");
	 * invoker.setServiceInterface(FileService.class); return invoker; }
	 */
}
