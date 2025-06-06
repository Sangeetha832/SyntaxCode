package OOPs_Abstraction;

abstract class Ani{
	String name;

	public Ani(String name) {
		super();
		this.name = name;
	}
	abstract void makeSound();
	
	void eat() {
		System.out.println(name+" eats");
	}
}
class cow extends Ani{

	public cow(String name) {
		super(name);
		
	}

	@Override
	void makeSound() {
		System.out.println("boww!!");
		
	}
	
}
class goat extends Ani{

	public goat(String name) {
		super(name);
	}

	@Override
	void makeSound() {
		System.out.println("Mmmeheh...");
		
	}
	
}
public class Abstraction_Ex1 {
	public static void main(String[] args) {
		Ani obj = new cow("eruma");
		obj.eat();
		obj.makeSound();
		Ani obj1 = new goat("Aadu");
		obj1.eat();
		obj1.makeSound();
	}
}
