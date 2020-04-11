package com.mtech.mithun.mTestProject;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties.LocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class MTestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MTestProjectApplication.class, args);
	}
	
	@Bean
	public LocaleResolver locateResolver() {
		SessionLocaleResolver localeResolver=new SessionLocaleResolver();
		localeResolver.setDefaultLocale(Locale.US);
		return null;
		
	}
	
//	@Bean
//	public ResourceBundleMessageSource resourceBundleMessageSource()
//	{
//		ResourceBundleMessageSource resourceBundleMessageSource=new ResourceBundleMessageSource();
//		resourceBundleMessageSource.setBasename("messages");
//		return resourceBundleMessageSource;
//		
//	}
}

