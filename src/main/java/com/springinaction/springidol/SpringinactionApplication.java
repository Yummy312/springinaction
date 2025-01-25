package com.springinaction.springidol;
import com.springinaction.springidol.exceptions.PerformanceException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringinactionApplication {

	public static void main(String[] args) throws PerformanceException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-idol.xml");

		// Кенни
		Instrumentalist kenny = context.getBean("kenny", Instrumentalist.class);
		kenny.perform(); // Playing 'Pubg theme music' : TOOT TOOT TOOT

		// Карл исполняет ту же песню, что и Кенни
		Instrumentalist carl = context.getBean("carl", Instrumentalist.class);
		carl.perform(); // Playing 'Pubg theme music' : TOOT TOOT TOOT

		Instrumentalist jeremy = context.getBean("jeremy", Instrumentalist.class);
		jeremy.perform(); // Playing {песня}: TOOT TOOT TOOT


	}



}
