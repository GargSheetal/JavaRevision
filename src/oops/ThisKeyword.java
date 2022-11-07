package oops;

public class ThisKeyword {

	int a;		// //instance or class variables
	int b;
	
	void sum(int a, int b)			// method or external variables (first method)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}
	
	void sum()			// second
	{
		System.out.println(a+b);
	}
	
	ThisKeyword(int a, int b)		// constructor	
	{
		this.a=a;
		this.b=b;
	}
	
	
	
	public static void main(String[] args) {
		
		// ThisKeyword tk = new ThisKeyword();		// object initialization
		// tk.sum(10, 20);
		
		ThisKeyword tk = new ThisKeyword(10, 20);		// constructor initialization
		tk.sum();

	}

}
