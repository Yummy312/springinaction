package com.springinaction.springidol;
import com.springinaction.springidol.exceptions.PerformanceException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringinactionApplication {

	public static void main(String[] args) throws PerformanceException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-idol.xml");

		Counter counter = context.getBean("counter", Counter.class);
		System.out.println(counter.getCount()); // 5

		Message message = context.getBean("message", Message.class);
		System.out.println(message.getMessage()); // The value


		Temperature temperature = context.getBean("temperature", Temperature.class);
		System.out.println(temperature.getFrequency()); // 89.7

		Car car = context.getBean("car", Car.class);
		System.out.println(car.getCapacity()); // 10000.0

		Button button = context.getBean("button", Button.class);
		System.out.println(button.getEnabled()); // false
	}



}
