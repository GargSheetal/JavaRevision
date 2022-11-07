package exceptionHandling;

public class HandlingUncheckedExceptions {

	public static void main(String[] args) {
		
		System.out.println("Program Started");
		
		int a = 20;
		
		try
		{
			System.out.println(a/0);	// ArithmeticException (it is also a predefined class in java)
		}
		catch(ArithmeticException e)	// creating an object of the exception i.e. 'e'
		{
			System.out.println(e.getMessage());
		}
		
		String s = null;
		
		try
		{
			System.out.println(s.length());		// NullPointerException
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		// using generic exception term for handling exception
		
		int arr[] = new int[5];
		
		try
		{
			arr[10] = 100;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
			
			
		System.out.println("Program is in Progress");
		System.out.println("Program Completed");
		
	}

}
