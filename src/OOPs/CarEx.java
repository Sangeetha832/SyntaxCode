package OOPs;

public class CarEx {
	public static void main(String[] args) {

		Car obj = new Car();
		obj.make="Toyota";
		obj.model="Camry";
		obj.year=2022;
		obj.color="Silver";
		
		Car obj2 = new Car();
		obj2.make="BMW";
		obj2.model="X5";
		obj2.year=2024;
		obj2.color="Blue";
	}
}
class Car{
	String make;
	String model;
	int year;
	String color;
	
	void startEngine() {
		System.out.println(make+" "+model+"'s engine is starting....");
	}
	void display() {
		System.out.println("Car Details:  ");
		System.out.println("Make: "+make);
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
		System.out.println("Color: "+color);
	}
}