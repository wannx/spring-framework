package com.asen.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//@Configuration
@ComponentScan(basePackages = {"com.asen"})
public class MainConfig {

	@Bean("apple")
	public Apple apple(){
		Apple apple = new Apple();
		apple.setCherry(cherry());
		return apple;
	}

	@Bean("cherry")
	public Cherry cherry(){
		Cherry cherry = new Cherry();
		return cherry;
	}
}
