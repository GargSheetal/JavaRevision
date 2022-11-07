package exceptionHandling;


public class HandlingCheckedExceptions {
	
	
	void m1() throws InterruptedException
	{
		Thread.sleep(2000);		// checked exception -- adds throws keyword at the method level.
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		// handling checked exceptions using try catch block
		
		System.out.println("Program Started");
		try
		{
			Thread.sleep(4000);		// checked exception
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();	//for checked exceptions--its type will not be printed in the console i.e. catch block statements will not be printed
		}
		
		System.out.println("Program is in Progress");
		System.out.println("Program Completed");
		
		
		// handling checked exceptions using Throws keyword
		System.out.println("Program Started");
		
		Thread.sleep(4000);
		
		System.out.println("Program is in Progress");
		System.out.println("Program Completed");
		

	}

}
