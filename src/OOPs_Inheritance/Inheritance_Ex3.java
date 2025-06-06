package OOPs_Inheritance;

class Vehicle{
	void start() {
		System.out.println("Vehicle is Starting");
	}
}
class Car extends Vehicle{
	@Override
	void start() {
		System.out.println("Car engine started.");
	}
	void openTrunk() {
		System.out.println("Car trunk opened");
	}
}
class MotorCycle extends Vehicle{
	@Override
	void start() {
		System.out.println("MotorCycle engine started");
	}
	void startKick() {
		System.out.println("MotorCycle kicked to start");
	}
}

public class Inheritance_Ex3 {
	public static void main(String[] args) {
	System.out.println("Creating the obj using Vehicle Reference:");
		Vehicle vehicle = new Vehicle();
		vehicle.start();
		Vehicle car = new Car();
		car.start();
		Vehicle motorCycle = new MotorCycle();
		motorCycle.start();
		System.out.println("========================");
		System.out.println("Creating the obj using Subclass Reference Car and MotorCycle:");
		Car cars = new Car();
		cars.openTrunk();
		cars.start();
		
		MotorCycle motor = new MotorCycle();
		motor.startKick();
		motor.start();
	}
}
