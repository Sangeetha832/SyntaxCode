package OOPs_Abstraction;

interface Printable {
	default void show() {
		System.out.println("show default method parent class inteface");
	}

	static void display() {
		System.out.println("display static method parent class interface");
	}

	abstract void print();
}

class Book implements Printable {

	public void print() {
		
		System.out.println("Print book");
	}
	
	@Override
	public void show() {
		Printable.super.show();
		System.out.println("show method from child class Book ");
	}

}

class Magazine implements Printable {

	public void print() {
		System.out.println("Magazine print");
	}
	@Override
	public void show() {
		System.out.println("show method from child class Magazine ");
	}

}

public class interface_ex1 {
	public static void main(String[] args) {
		Printable obj = new Book();
		obj.show();
		obj.print();

		Printable obj1 = new Magazine();
		obj1.show();
		obj1.print();

		Printable.display();

	}
}
