package OOPs_Inheritance;

// hierarchical inheritance - multiple subclass inherits one super class

class Employee{
	int employeeId;
	double salary;
	public Employee() {
		
		System.out.println("inside employee constructor");
	}
	void show() {
		System.out.println("employee class");
	}
	void displaySalary() {
		System.out.println("salary: "+salary);
	}
}
class Manager extends Employee{
	public Manager() {
		System.out.println("inside manager constructor");
	}
	void display(int employeeid, double salary) {
		this.employeeId = employeeid;
		this.salary = salary;
		System.out.println(employeeId+" "+salary);
	}
	void show() {
		System.out.println("Manager class");
	}
}
class developer extends Employee{
	void display(int employeeid, double salary) {
		this.employeeId = employeeid;
		this.salary = salary;
		System.out.println(employeeId+" "+salary);
	}
	void show() {
		System.out.println("developer class");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.show();
		System.out.println("--------------------");
		Manager manager = new Manager();
		manager.display(001,25000.00);
		manager.show();
		manager.displaySalary();
		System.out.println("--------------------");

		developer dev = new developer();
		dev.display(3,3500.00);
		dev.show();
		dev.displaySalary();
		System.out.println("--------------------");

		Employee poly = new Manager();
		poly.show();
		
		System.out.println("--------------------");

		Employee deve = new developer();
		dev.show();
		
		System.out.println("--------------------");

		
	}
}
