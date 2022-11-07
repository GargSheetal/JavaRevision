package exceptionHandling;

public class UncheckedExceptions {

	public static void main(String[] args) {
		int a = 20;
	//	System.out.println(a/0);	// ArithmeticException
		
		String s = null;
	//	System.out.println(s.length());		// NullPointerException
		
		String st = "1234";
		int i = Integer.parseInt(st);		// this string method converts string value into integer value
		System.out.println(i);
		
		String str = "abcd";
	//	int j = Integer.parseInt(str);		// Throws NumberFormatException  as alphabets cannot be converted into integers.
	//	System.out.println(j);
		
		int arr[] = new int[5];
		arr[10] = 100;					// ArrayIndexOutOfBoundexception 
		
	}

}
