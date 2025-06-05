package OOPs_Polymorphism;

class Animal{
	void sound() {
		System.out.println("The Animal sounds...");
	}
}
class dog extends Animal{
	void sound() {
		System.out.println("The dog: bow! bow!");
	}
	void eat() {
		System.out.println("The dog: biscuits");
	}
}
class cat extends Animal{
	void sound() {
		System.out.println("The cat: meow! meow!");
	}
	void eat() {
		System.out.println("The cat: milk...");
	}
}
public class Method_Overridding {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.sound();
		Animal dog = new dog();
		dog.sound();
		Animal cat = new cat();
		cat.sound();
		
		dog  obj = new dog();
		obj.eat();
		cat obj1 = new cat();
		obj1.eat();
		
	}
}
