package com.phani.spring.basics.springin5steps;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.phani.spring.basics.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan("com.phani.spring.basics.springin5steps.basic")
public class SpringIn5StepsApplication {
	
	//What are the beans?
	//What are the dependencies of a bean?
	//Where to search for beans?

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringIn5StepsApplication.class)) {
				//SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println(result);
		}
	}

}
