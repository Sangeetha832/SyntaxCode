package OOPs;

class human{
	String Gender;
	String Name;
	int Age;
	
	void work() {
		System.out.println("I'm a developer");
	}
	void display() {
		System.out.println("Name: "+Name+", Gender: "+Gender+", Age: "+Age);
	}
}

public class ClassAndObject {
	void show() {
		System.out.println("I'm a Main Class");
	}
	public static void main(String[] args) {
	
		ClassAndObject obj1 = new ClassAndObject();
		obj1.show();
		
		human obj = new human();
		obj.Name = "jack";
		obj.Gender = "male";
		obj.Age = 20;
		obj.display();
		obj.work();
	}
}


