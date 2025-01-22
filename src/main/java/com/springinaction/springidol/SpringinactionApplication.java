package com.springinaction.springidol;
import com.springinaction.springidol.exceptions.PerformanceException;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringinactionApplication {

	public static void main(String[] args) throws PerformanceException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-idol.xml");
		Performer performer = (Performer) context.getBean("poeticDuke");
		performer.perform();

		Auditorium auditorium = context.getBean("auditorium", Auditorium.class);
		context.close(); // вызывает методы уничтожения (destroy-method) для всех бинов

		/*
			я изменил тип ApplicationContext переменной context на тип ClassPathXmlApplicationContext
			Потому что:
			ApplicationContext — это интерфейс, который предоставляет базовую функциональность
			для управления Spring-контекстом.
			ClassPathXmlApplicationContext — это конкретная реализация ApplicationContext,
			которая поддерживает дополнительные методы управления временем жизни контекста, такие как close().
		*/


	}



}
