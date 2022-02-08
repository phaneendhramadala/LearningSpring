package com.phani.spring.basics.springin5steps;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.phani.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.phani.spring.basics.springin5steps.properties.SomeExternalService;

@Configuration
@ComponentScan("com.phani.spring.basics.springin5steps.properties")
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {
	
	//What are the beans?
	//What are the dependencies of a bean?
	//Where to search for beans?

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class)) {
				
			SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
		
			System.out.println(service);
			System.out.println(service.returnServiceURL());
		
		}
	}

}
