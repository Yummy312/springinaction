package com.springinaction.springidol;
import com.springinaction.springidol.exceptions.PerformanceException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringinactionApplication {

	public static void main(String[] args) throws PerformanceException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-idol.xml");

		SomeClass someBean = context.getBean("someBean", SomeClass.class);
		System.out.println(someBean.getLargeCircle()); // true

		Shape shape = context.getBean("shape", Shape.class);
		System.out.println(shape.getKind()); // circle
		System.out.println(shape.getPerimeter()); // 150000


	}



}
