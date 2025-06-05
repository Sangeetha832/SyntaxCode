package OOPs;

public class Student {
	private int rollNo;
	private String name;
	private int marks;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	void display() {
		System.out.println("name: "+name+" roll no "+rollNo+" marks: "+marks);
	}
	
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setMarks(90);
		stu.setName("Sam");
		stu.setRollNo(01);
		stu.display();
	}
}
