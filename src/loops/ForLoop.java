package loops;

public class ForLoop {

	public static void main(String[] args) {
		
		int i;
		
		for(i=1; i<=10; i++)
		{
			System.out.println(i);		// 1 2 3 4 5....10
		}
		System.out.println("Program Exited");
		
		
		// Print only odd numbers
		
		for(i=1; i<=10; i+=2)
		{
			System.out.println(i);	// 1 3 5...9
		}
		System.out.println("Program Exited");
		
		
		// Print only even numbers
				
		for(i=2; i<=10; i+=2)
		{
			System.out.println(i);	// 2 4 ...10
		}
		System.out.println("Program Exited");
		
		
		// Print 10-1
		
		for(i=10; i>=1; i--)
		{
			System.out.println(i);	// 10 9 8...1
		}
		System.out.println("Program Exited");
		
	}

}
