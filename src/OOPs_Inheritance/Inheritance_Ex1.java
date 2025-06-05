package OOPs_Inheritance;

public class Inheritance_Ex1 {
	public static void main(String[] args) {
		Animal[] animal = new Animal[3];
		animal[0]= new Dogs();
		animal[1]= new Cat();
		animal[2]= new Cow();
		for(Animal animals : animal) {
			animals.makeSound();
		}
	}
}
class Animal{
	void makeSound() {
		System.out.println("Generic animal sound.");
	}
}
class Dogs extends Animal{
	@Override
	void makeSound() {
		System.out.println("Woof!..");
	}
}
class Cat extends Animal{
	@Override
	void makeSound() {
		System.out.println("Meow!..");
	}
}

class Cow extends Animal{
	@Override
	void makeSound() {
		System.out.println("Moo!..");
	}
}