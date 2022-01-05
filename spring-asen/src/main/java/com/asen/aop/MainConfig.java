package com.asen.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.asen")
public class MainConfig {

	@Bean
	public Calculate calculate() {
		return new MyCalculate();
	}

}
