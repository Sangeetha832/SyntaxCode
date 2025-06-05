package OOPs_Constructor;

class Overloading{
	int a;
	int b;
	
	Overloading(){
		this(20,3);
		System.out.println("Non parameterzied Constructor Overloading");
	}
	Overloading(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("parent "+(a+b));
		System.out.println("Constructor overloading with two parameters");
	}
	Overloading(double a, float b, int c){
		System.out.println("Constructor overloading with three parameters");
		double d = a+b+c;
		System.out.println(d);
	}
}
class loading extends Overloading{
	loading(){
		this("hello");
	System.out.println("child class constructor called");
	}
	
	loading(String msg){
		super(4,5);
		System.out.println("child class parameter "+msg);
	}
}
class over extends loading{
	over(){
		super();
		System.out.println("grand child constructor");
	}
}
public class Contructor_overloading {
	public static void main(String[] args) {
		Overloading c1 = new Overloading();
		Overloading over = new Overloading(3, 2);
		Overloading c3 = new Overloading(23, 2, 9);
		 loading load = new loading();
		 over o1 = new over();
		
	}
}
