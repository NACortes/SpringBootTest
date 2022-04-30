package com.example.demo.transformation;

import java.util.HashMap;
import java.util.Map;

public enum CarTransformBuilder {
	
	VENTO("Vento"){
		@Override
		public CarTransform getTransformCar() {
			return new VentoTransform();
		}
	},
	VOCHO("Vocho"){
		public CarTransform getTransformCar() {
			return new VochoTransform();
		}
	}
	;
	
	private String value;
	private CarTransformBuilder(String carType) {
		this.value = carType;
	}
	
	public String getValue() {
		return this.value;
	}
	
	public abstract CarTransform getTransformCar();
	
	private static final Map<String, CarTransformBuilder> lookupIndex = new HashMap<>(CarTransformBuilder.values().length);
	
	static {
		for (CarTransformBuilder carBuilder : CarTransformBuilder.values()) {
			lookupIndex.put(carBuilder.toString(), carBuilder);
		}
	}
	
	public static CarTransformBuilder getCarBuilder(String car) {
		return lookupIndex.get(car);
	}

}
