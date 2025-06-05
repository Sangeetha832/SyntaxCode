package OOPs_Constructor;

class current{
	String msg;
	current(){
		this("Hello...");
		System.out.println("non parameterized");
	}
	current(String msg){
		this.msg= msg;
		System.out.println("parameter constructor says: "+msg);
	}
}
public class this_keyword {
	public static void main(String[] args) {
		current current = new current();
		current cur = new current("hey...");
	}
}
