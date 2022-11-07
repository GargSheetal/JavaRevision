package accessModifierPackage2;

import accessModifierPackage1.A;

public class B extends A
{

	public static void main(String[] args) {
		
		// for default
	/*	A aobj = new A();		
		aobj.i=20;		// cannot access class A variables and method as they are default
		aobj.m1();	*/
		
		// for protected (it is accessible within the package and outside the package but through inheritance only)
		B bobj = new B();
		bobj.a = 20;
		bobj.m2();
		
		// for public (can be accessed everywhere -- within the class, package and across packages directly)
		bobj.b = 30;
		bobj.m3();
		
	}

}
