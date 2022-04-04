package com.example.demo.strategy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//This configuration class is used for return the same strategy for different names same behavior

@Configuration
public class BeanConfigForStrategy {
	
	@Bean(name = {"name1", "name2","name3"}) 
	public Strategy getBean() {
		return  new StrategyImpl();
	}

}
