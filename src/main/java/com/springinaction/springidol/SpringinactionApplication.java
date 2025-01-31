package com.springinaction.springidol;
import com.springinaction.springidol.exceptions.PerformanceException;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringinactionApplication {

	public static void main(String[] args) throws PerformanceException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-idol.xml");

		Instrumentalist kenny = context.getBean("kenny", Instrumentalist.class);
		kenny.perform(); // Playing Jingle Bells : TOOT TOOT TOOT


		Instrumentalist david = context.getBean("david", Instrumentalist.class);
		david.perform(); // Playing Jingle Bells : TOOT TOOT TOOT


	}



}
