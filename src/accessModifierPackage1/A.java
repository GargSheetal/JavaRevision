package accessModifierPackage1;

public class A {
	
	// for default (Default modifier is accessible only within the package)
/*	int i = 10;		// default
	void m1()		//default
	{
		System.out.println(i);
	}	*/
	
	// for protected (it is accessible within the package and outside the package but through inheritance only)
	protected int a = 10;		
	protected void m2()		
	{
		System.out.println(a);
	}
	
	// for public (can be accessed anywhere within the class, package, outside the package)
	public int b = 20;
	public void m3()
	{
		System.out.println(b);
	}

}
