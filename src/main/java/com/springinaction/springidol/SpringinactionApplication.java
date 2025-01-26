package com.springinaction.springidol;
import com.springinaction.springidol.exceptions.PerformanceException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringinactionApplication {

	public static void main(String[] args) throws PerformanceException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-idol.xml");

		SomeClass someBean = context.getBean("someBean", SomeClass.class);
		System.out.println(someBean.getAdjustedAmount());
		System.out.println(someBean.getCircumference());
		System.out.println(someBean.getAverage());
		System.out.println(someBean.getRemainder());
		System.out.println(someBean.getArea());



	}



}
