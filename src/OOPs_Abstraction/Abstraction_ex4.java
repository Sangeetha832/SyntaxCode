package OOPs_Abstraction;


abstract class Vehicle{
	abstract void start();
	
}
class Bike extends Vehicle{

	@Override
	void start() {
		System.out.println("Bike started...");
		
	}
	
}
class Car extends Vehicle{
	@Override
	void start() {
		System.out.println("Car started....");
	}
}
public class Abstraction_ex4 {
	public static void main(String[] args) {
		Vehicle obj = new Bike();
		obj.start();
		Vehicle obj1 = new Car();
		obj1.start();
		
	}
}
