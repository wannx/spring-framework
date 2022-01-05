package com.asen;

import com.asen.aop.Calculate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainStart {

	public static void main(String[] args) {
		/**
		 * IOC
		 */
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(com.asen.ioc.MainConfig.class);

//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(com.asen.ioc.MainConfig.class);
//		Apple apple = (Apple) ctx.getBean("apple");

		/**
		 * AOP
		 */
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(com.asen.aop.MainConfig.class);
		Calculate calculate = (Calculate) ctx.getBean("calculate");
		calculate.add(1, 3);
	}
}
