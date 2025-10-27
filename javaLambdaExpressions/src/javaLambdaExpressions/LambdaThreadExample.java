package javaLambdaExpressions;

class ThreadDemo implements Runnable{
	
	@Override
	public void run() {
		System.out.println("run method is calling");
	}
}

public class LambdaThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new ThreadDemo());
		thread.start();
		
//		Runnable withLambda = () -> {System.out.println("Printing from lambda");};
		Thread thread1 = new Thread(() -> System.out.println("Printing from lambda"));
		thread1.start();
		
	}

}
