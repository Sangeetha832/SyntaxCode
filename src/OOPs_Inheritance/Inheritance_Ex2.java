package OOPs_Inheritance;

public class Inheritance_Ex2 {
	public static void main(String[] args) {

		Shape[] shape = new Shape[2];
		shape[0] = new Rectangle(4, 5);
		shape[1] = new Circle(2);
		for (Shape shapes : shape) {

			System.out.println("Area " + shapes.calculateArea());
		}
	}
}

abstract class Shape {
	abstract double calculateArea();
}

class Rectangle extends Shape {

	double length, width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	double calculateArea() {
		System.out.println("Rectangle");
		return length * width;
	}
}

class Circle extends Shape {

	double radius;

	public Circle(double radius) {
		
		this.radius = radius;
	}

	@Override
	double calculateArea() {
		System.out.println("Circle");
		return (int) (Math.PI * radius * radius);
	}

}
