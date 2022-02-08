package com.phani.spring.basics.springin5steps.cdi;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Named
public class SomeCDIDAO {
	
	public int[] getData() {
		return new int[] {5, 89, 100};
	}
	
}
