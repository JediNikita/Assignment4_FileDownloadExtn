package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter
{
    @Bean
    public InternalResourceViewResolver viewResolver() {
    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    resolver.setPrefix("/WEB-INF/views/");          
    resolver.setSuffix(".jsp");
    //resolver.setViewClass (JstlView.class);
    //resolver.setExposeContextBeansAsAttributes(true);
    return resolver;
    }

    @Override
    public void configureDefaultServletHandling(
    DefaultServletHandlerConfigurer configurer) {
    configurer.enable();
    }
    
	/*
	 * @Override public void addResourceHandlers(final ResourceHandlerRegistry
	 * registry) {
	 * registry.addResourceHandler("/*.js/**").addResourceLocations("/ui/static/");
	 * registry.addResourceHandler("/*.css/**").addResourceLocations("/ui/static/");
	 * }
	 */
}
