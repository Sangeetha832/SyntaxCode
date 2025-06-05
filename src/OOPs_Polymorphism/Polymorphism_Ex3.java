package OOPs_Polymorphism;

class Wild_Animal {
	void eat() {
		System.out.println("Animal eats");
	}

	void eat(String food) {
		System.out.println("Animal is eating " + food);
	}

	void eat(String food1, String food2) {
		System.out.println("Animal is eating " + food1 + " and " + food2);
	}

	
}

class Dog extends Wild_Animal {
	void eat() {
		System.out.println("Dog is eating bones.");
	}
}

public class Polymorphism_Ex3 {
	public static void main(String[] args) {
		Wild_Animal animal = new Wild_Animal();
		animal.eat();
		animal.eat("legs");
		animal.eat("legs", "bones");
		
		Wild_Animal dog = new Dog();
		dog.eat();
		dog.eat("dog: legs");
		dog.eat("dog: legs", "dog: bones");
	}
}
