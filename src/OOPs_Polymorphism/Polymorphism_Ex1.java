package OOPs_Polymorphism;

abstract class shape{
	 abstract void draw();
}
class circle extends shape{

	@Override
	void draw() {
		System.out.println("Drawing a circle");
		
	}
	
}
class Rectangle extends shape{

	@Override
	void draw() {
		System.out.println("Drawing a Rectangle");
	}
	
}
class Triangle extends shape{
	@Override
	void draw() {
		System.out.println("Drawing a Triangle");
	}
}
public class Polymorphism_Ex1 {
	public static void main(String[] args) {
		shape[] arr = new shape[3];
		arr[0] = new circle();
		arr[1] = new Rectangle();
		arr[2] = new Triangle();
		
		for (shape shape : arr) {
			shape.draw();
		}
	}
}
