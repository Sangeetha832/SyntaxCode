package OOPs_Inheritance;

class Employee{
	int employeeId;
	double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("inside constructor");
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
		// TODO Auto-generated constructor stub
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
		
		Manager manager = new Manager();
		manager.display(001,25000.00);
		manager.show();
		manager.displaySalary();
		
		developer dev = new developer();
		dev.display(3,3500.00);
		dev.show();
		dev.displaySalary();
		
		Employee poly = new Manager();
		poly.show();
		Employee deve = new developer();
		dev.show();
		
		
		
	}
}
