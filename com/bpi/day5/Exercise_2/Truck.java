package com.bpi.day5.Exercise_2;

class Truck extends Vehicle implements Refuelable {
	Truck(int numberOfWheels, String brand) {
		super(numberOfWheels, brand);
	}

	@Override
	void startEngine() {
		System.out.println("Truck engine started.");
	}

	@Override
	public void refuel() {
		System.out.println("Truck is refueled.");
	}
}
