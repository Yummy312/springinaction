package com.springinaction.springidol;
import com.springinaction.springidol.exceptions.PerformanceException;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringinactionApplication {

	public static void main(String[] args) throws PerformanceException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-idol.xml");

		Instrumentalist eddie = context.getBean("eddie", Instrumentalist.class);

		eddie.perform();


	}



}
