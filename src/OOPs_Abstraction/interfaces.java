package OOPs_Abstraction;

interface vehicle{
	void start();
	void stop();
	default void show() {
		System.out.println("show default method");
	}
	static void display() {
		System.out.println("display static method");
	}
}
class car implements vehicle{
	public void start() {
		System.out.println("car started");
	}
	public void stop() {
		System.out.println("car stoped");
	}
}
public class interfaces {

	public static void main(String[] args) {
		vehicle obj = new car();
		
		obj.start();
		obj.stop();
		obj.show();
		
		vehicle.display();
	}
}
