package com.springinaction.springidol;
import com.springinaction.springidol.exceptions.PerformanceException;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringinactionApplication {

	public static void main(String[] args) throws PerformanceException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-idol.xml");

		Magican harry = context.getBean("harry", Magican.class);
		harry.perform();	// Bippity boppity boo
							// The magic box contains...
							// A ferocious tiger


	}



}
