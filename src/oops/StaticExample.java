package oops;

public class StaticExample {
	
	int a;		// non static variable
	static int b;		// static variable
	
	static void m1()		// static method
	{
		System.out.println("This is m1-static method");
	}
	
	void m2()		// non-static method
	{
		System.out.println("This is m2-non-static method");
	}
	
	void m3()
	{
		a=500;		// non-static
		b=1000;		//static variable
		m1();		// static method
		m2();		// no-static method
	}
	
	
	public static void main(String[] args) {
		
		b=100;		// static variable -- it can be called directly
		System.out.println(b);
		m1();		// static method
		
	//	a= 200;		// non-static variable-- can only be called with the help of object creation
	//	m2();		// non-static method
		
		StaticExample se = new StaticExample();
		se.a = 200;
		System.out.println(se.a);
		se.m2();
		
		
		
	}

}
