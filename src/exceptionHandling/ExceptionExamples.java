package exceptionHandling;

public class ExceptionExamples {

	public static void main(String[] args) {
		
		System.out.println("Started");
		
	//	Thread.sleep(4000);		// giving InterruptedException (checked exception)
		
		int i=10;
		System.out.println(i/0);		// ArithmeticException (Unchecked exception - not identified by java compiler)
		
		System.out.println("Stopped");
	}

}
