package com.springinaction.springidol;
import com.springinaction.springidol.exceptions.PerformanceException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringinactionApplication {

	public static void main(String[] args) throws PerformanceException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-idol.xml");

		List<City> cities = context.getBean("cities", List.class);
		System.out.println(cities.get(1).getName());

	}



}
