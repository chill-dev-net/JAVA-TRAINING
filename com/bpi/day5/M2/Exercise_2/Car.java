package com.bpi.day5.M2.Exercise_2;

class Car extends Vehicle implements Refuelable {
	Car(int numberOfWheels, String brand) {
		super(numberOfWheels, brand);
	}

	@Override
	void startEngine() {
		System.out.println("Car engine started.");
	}

	@Override
	public void refuel() {
		System.out.println("Car is refueled.");
	}
}
