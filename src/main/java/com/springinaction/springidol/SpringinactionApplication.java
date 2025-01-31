package com.springinaction.springidol;
import com.springinaction.springidol.exceptions.PerformanceException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringinactionApplication {

	public static void main(String[] args) throws PerformanceException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-idol.xml");

		SomeClass someBean = context.getBean("someBean", SomeClass.class);
		System.out.println(someBean.getCityNames().toString()); //[Chicago, Atlanta, Dallas, Houston]


	}



}
