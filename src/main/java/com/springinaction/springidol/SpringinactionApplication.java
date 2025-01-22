package com.springinaction.springidol;
import com.springinaction.springidol.exceptions.PerformanceException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringinactionApplication {

	public static void main(String[] args) throws PerformanceException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-idol.xml");

		OneManBand oneManBand = context.getBean("oneManBand", OneManBand.class);

		oneManBand.perform(); // Twang-twang
					          // Tsss...
		                      // Whee-woo
		
	}



}
