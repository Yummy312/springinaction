package com.springinaction.springidol;
import com.springinaction.springidol.exceptions.PerformanceException;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringinactionApplication {

	public static void main(String[] args) throws PerformanceException {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-idol.xml");
		Performer performer = (Performer) context.getBean("poeticDuke");
		performer.perform();

	}



}
