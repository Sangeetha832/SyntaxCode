package OOPs_Abstraction;

interface Printables{
	default void show() {
		System.out.println("Printable interface, default method show()");
	}
	static void display() {
		System.out.println("Printable interface, static method display()");
	}
	void print();
	
}
interface Shareable{
	default void show() {
		System.out.println("Shareable interface, default method show()");
	}
	static void display() {
		System.out.println("Shareable interface, static method display()");
	}
	void share();
}
class Document implements Printables, Shareable{
	@Override
	public void show() {
		Printables.super.show();
		Shareable.super.show();
		System.out.println("Document class resolves show():");
	}
	@Override
	public void print() {
		System.out.println("Documented Printed.");
	}
	@Override
	public void share() {
		System.out.println("Documented Shared.");
	}
}
public class interface_ex2 {
public static void main(String[] args) {
	Document doc = new Document();
	doc.show();
	doc.print();
	doc.share();
	
	Printables.display();
	Shareable.display();
}
}
