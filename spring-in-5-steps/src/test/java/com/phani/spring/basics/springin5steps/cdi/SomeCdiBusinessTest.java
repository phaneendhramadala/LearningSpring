package com.phani.spring.basics.springin5steps.cdi;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
//import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.phani.spring.basics.springin5steps.SpringIn5StepsApplication;
import com.phani.spring.basics.springin5steps.SpringIn5StepsCdiApplication;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {
	
	//Inject Mock
	@InjectMocks
	SomeCDIBusiness business;
	
	//create Mock
	@Mock
	SomeCDIDAO daoMock;
	
	@Test
	public void testBasicScenario() {
		
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2, 4});
		//when daoMock.getData() method is called return int[] {2, 4}
		assertEquals(4, business.findGreatest());
		
	}
	
	@Test
	public void testBasicScenarioNoElements() {
		
		Mockito.when(daoMock.getData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, business.findGreatest());
		
	}
	
	@Test
	public void testBasicScenarioEqualElements() {
		
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2, 2});
		assertEquals(2, business.findGreatest());
		
	}

}
