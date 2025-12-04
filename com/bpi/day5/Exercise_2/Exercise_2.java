package com.bpi.day5.Exercise_2;

public class Exercise_2 {

	public static void main(String[] args) {
		Car car = new Car(4, "Toyota");
		Truck truck = new Truck(6, "Volvo");

		car.startEngine();
		car.refuel();

		truck.startEngine();
		truck.refuel();

		destroyVehicle(car);
		destroyVehicle(truck);
	}

	static void destroyVehicle(Vehicle v) {
		v.destroy();
	}

}
