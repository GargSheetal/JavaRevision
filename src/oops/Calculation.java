package oops;

public class Calculation {

	int a;
	int b;
	
	// 1) Method may not take parameters and just performing operations
	// 4) Method may not return any value
/*	void sum()
	{
		System.out.println(a+b);
	}	*/
	
	// 2) Method take parameters 
/*	void sum(int x, int y)
	{
		a=x;
		b=y;
		System.out.println(a+b);
	}	*/
	
	// 3) Method returns some value
	int sum()
	{
		return(a+b);
	}
		
	
	public static void main(String[] args) {
		
		Calculation cal = new Calculation();
		
		// 1) Method may not take parameters 
	/*	cal.a = 100;
		cal.b = 200;
		cal.sum();		*/
		
		// 2) Method take parameters 
		//cal.sum(100, 200);
		
		// 3) Method returns some value
		cal.a = 100;
		cal.b = 200;
		int res = cal.sum();
		System.out.println(res);
		
		
	}

}
