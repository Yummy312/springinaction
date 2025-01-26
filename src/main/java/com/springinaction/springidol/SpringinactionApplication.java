package com.springinaction.springidol;
import com.springinaction.springidol.exceptions.PerformanceException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringinactionApplication {

	public static void main(String[] args) throws PerformanceException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-idol.xml");

		SomeClass someObject1 = context.getBean("someObject1", SomeClass.class);
		System.out.println(someObject1.getMultiplier()); // 3.141592653589793

		SomeClass someObject2 = context.getBean("someObject2", SomeClass.class);
		System.out.println(someObject1.getRandomNumber()); // 0.0


	}



}
