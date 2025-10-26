package javaLambdaExpressions;

interface Calculator{
	int calculate(int a,int b);
}

class Addition implements Calculator{
	@Override
	public int calculate(int a,int b) {
		return a+b;
	}
}
class Subtraction implements Calculator{
	@Override
	public int calculate(int a,int b) {
		return a-b;
	}
}	
class Multiplication implements Calculator{
	@Override
	public int calculate(int a,int b) {
		
	return a*b;
	}

}
class Division implements Calculator{
	@Override
	public int calculate(int a,int b) {
		
	return a/b;
	}

}
public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator resultAddition = new Addition();	
		Calculator resultSubtraction = new Subtraction();
		Calculator resultMultiplication = new Multiplication();
		Calculator resultDivision = new Division();
		System.out.println("Addition result is "+resultAddition.calculate(10, 20));
		
		

 
		
		
		System.out.println("Subtraction result is no lambda expression used "+resultSubtraction.calculate(10, 20));
		System.out.println("Multiplication result is no lambda expression "+resultMultiplication.calculate(10, 20));
		System.out.println("Division result is no lambda expression "+resultDivision.calculate(10, 20));
		
		System.out.println("\n");
		
		
		
		//Calculator addition = (a,b) -> a+b;
		System.out.println("Addition using lambda expressions :"+ calculate(10,20,(a,b)->a+b));
		
//		Calculator subtraction = (a,b) -> a-b;
		System.out.println("Subtraction using Lambda expression :"+ calculate(10,20,(a,b)->a-b));
		
//		Calculator multiplication = (a,b) -> a*b;
		System.out.println("Multiplication using Lambda expression :"+ calculate(10,20,(a,b)->a*b));
		
//		Calculator division = (a,b) -> a/b;
		System.out.println("Division using Lambda expression :"+ calculate(10,20,(a,b)->a/b));
	}
	
	private static int calculate(int a,int b,Calculator calculator) {
		return calculator.calculate(a, b);
	}

}
