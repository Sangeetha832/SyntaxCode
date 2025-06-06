package OOPs_Constructor;


class Student{
	
	// static variable - shared by all objects
	static int studentcount = 0;
	
	// final variable - must be initialized once
	final int studentId; 
	String name;
	
	Student(int id, String name){
		this.studentId= id;		//final variable set in constructor
		this.name = name;
		studentcount++; // increment the student count
	}
	
	void display() {
		System.out.println("student id "+ studentId+" name "+name);
	}
	static void showCount() {
		System.out.println("Student count: "+ studentcount);
	}
}
public class Constructor_static_final {

	public static void main(String[] args) {
		
		Student st1 = new Student(1, "Jack");
		Student st2 = new Student(2, "sam");
		Student st3 = new Student(3, "Jerry");
		
		st1.display();
		st2.display();
		st3.display();
		
		Student.showCount();		// call static method without object
		
		
		
	}
}
