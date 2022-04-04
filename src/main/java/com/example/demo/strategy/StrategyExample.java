package com.example.demo.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class StrategyExample {
	
	@Autowired
	ApplicationContext context;
	
	public void testStrategy(String type) {
		
		if(context.containsBean(type)) {
			Strategy strategy=(Strategy) context.getBean(type);
			strategy.process();
		}
		
	}

}
