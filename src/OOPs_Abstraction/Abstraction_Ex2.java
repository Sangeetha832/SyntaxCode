package OOPs_Abstraction;

interface Controllable{
	abstract void turnOn();
	abstract void turnOff();
	default void sound() {
		System.out.println("electronic sounds");
	}
	static void tube() {
		System.out.println("tube turnOn");
	}
	
}
abstract class ElectronicDevice implements Controllable{
	String brand;

	public ElectronicDevice(String brand) {
		super();
		this.brand = brand;
	}
	public void turnOn() {
		System.out.println(brand+" device is turn on");
	}
	public void turnOff() {
		System.out.println(brand+" device is turn off");
	}
	abstract void operate();
}
class Television extends ElectronicDevice{

	public Television(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}
	void operate() {
		System.out.println("watching TV");
	}
	
}
class Smartphone extends ElectronicDevice{
	public Smartphone(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	void operate() {
		System.out.println("Browsing the internet");
	}
	
}
public class Abstraction_Ex2 {
	public static void main(String[] args) {

		ElectronicDevice TV = new Television("MI");
		TV.operate();
		TV.turnOff();
		TV.turnOn();
		ElectronicDevice phone = new Smartphone("MOTO");
		phone.operate();
		phone.turnOff();
		phone.turnOn();
		
		Controllable[] arr = new Controllable[2];
		arr[0] = new Television("Sony");
		arr[1] = new Smartphone("realme");
		
		for (Controllable controllable : arr) {
			controllable.turnOff();
			controllable.turnOn();
		}
		
	}
}
