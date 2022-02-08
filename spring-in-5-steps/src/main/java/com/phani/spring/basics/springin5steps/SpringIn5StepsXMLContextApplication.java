package com.phani.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.phani.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.phani.spring.basics.springin5steps.xml.XMLPersonDAO;

public class SpringIn5StepsXMLContextApplication {
	
	//What are the beans?
	//What are the dependencies of a bean?
	//Where to search for beans?
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXMLContextApplication.class);

	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml")) {
				
			LOGGER.info("Beans Loaded -> {}", 
					(Object)applicationContext.getBeanDefinitionNames());
			
			XMLPersonDAO personDao = applicationContext.getBean(XMLPersonDAO.class); 
		
			LOGGER.info("{} {}", personDao, personDao.getXMLJdbcConnection());
		}
	}

}
