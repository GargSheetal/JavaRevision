
//Example for try catch finally block in real time: establishing database connection-- put the code for database connection in try block-->
// if it doesn't happen, it is caught by catch block which shows the msg for the exception--> put the code for connecting to another database
// in the finally block


package exceptionHandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		// 1st case--Exception occurs, handled by catch block, finally block is executed
		int arr[] = new int[5];
		
		try
		{
			arr[10] = 100;			// ArrayIndexOutOfBoundException
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("This is Finally Block");		// usually recovery statements are written in the finally block such as 
		}														// reconnecting with the database or 2nd database if 1st is not available.
		
		
		// 2nd case--Exception occurs, not handled by catch block, finally block is still executed
	/*	int a[] = new int[5];
		
		try
		{
			a[10] = 100;			// ArrayIndexOutOfBoundException
		}
		catch(ArithmeticException e)	// wrong exception type--catch block will not handle exception
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("This is Finally Block");		// still finally block gets executed 
		}		*/
		
		
		// 3rd case--Exception does not occurs, catch block ignores it, finally block is executed
		int arr1[] = new int[5];
		
		try
		{
			arr1[4] = 100;			// no exception
			System.out.println(arr1[4]);
		}
		catch(ArrayIndexOutOfBoundsException e)		
		{
			System.out.println(e.getMessage());		// catch block ignores it as there is no exception
		}
		finally
		{
			System.out.println("This is Finally Block");		// finally block gets executed
		}	
		
		
		
	}

}
