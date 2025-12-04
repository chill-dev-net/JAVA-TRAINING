package com.bpi.day5.M2.Exercise_2;

abstract class Vehicle {
	int numberOfWheels;
	String brand;

	Vehicle(int numberOfWheels, String brand) {
		this.numberOfWheels = numberOfWheels;
		this.brand = brand;
	}

	abstract void startEngine();

	void destroy() {
		System.out.println(brand + " is destroyed.");
	}
}
