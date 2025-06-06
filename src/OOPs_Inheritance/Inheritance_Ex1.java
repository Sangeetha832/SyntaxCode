package OOPs_Inheritance;

class Animal{
	void makeSound() {
		System.out.println("General animal sounds.");
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

public class Inheritance_Ex1 {
	public static void main(String[] args) {
		Animal[] animal = new Animal[4];
		animal[0]= new Dogs();
		animal[1]= new Cat();
		animal[2]= new Cow();
		animal[3]= new Animal();
		for(Animal animals : animal) {
			animals.makeSound();
		}
	}
}
