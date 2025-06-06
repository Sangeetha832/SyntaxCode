package Lambda_expression;

interface Operation{
	double opCritieria(double firstName, double secondName);
}
class calculator{
	public static double doOperation(double firstNum, double secondNum, Operation operator) {
		return  operator.opCritieria(firstNum, secondNum);
	}
}
public class Calc_Lambda {
	public static void main(String[] args) {
		
		// Lambda Expressions
		
		Operation add = (a,b) -> a+b;
		Operation sub = (a,b) -> a-b;
		Operation mul = (a,b) -> a*b;
		Operation div = (a,b) -> a/b;
		
		System.out.println(calculator.doOperation(12,4,div));
	}
}
