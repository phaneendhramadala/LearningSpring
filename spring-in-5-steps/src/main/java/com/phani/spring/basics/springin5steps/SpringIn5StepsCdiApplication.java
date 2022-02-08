package com.phani.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.phani.spring.basics.springin5steps.cdi.SomeCDIBusiness;

//import ch.qos.logback.classic.Logger;

@Configuration
@ComponentScan("com.phani.spring.basics.springin5steps.cdi")
public class SpringIn5StepsCdiApplication {
	
	//What are the beans?
	//What are the dependencies of a bean?
	//Where to search for beans?
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);
	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class)) {
				//SpringApplication.run(SpringIn5StepsCdiApplication.class, args);
		
		SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);
		
		LOGGER.info("{}", business);
		}
	}

}
