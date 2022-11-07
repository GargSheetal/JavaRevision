
// Access Modifiers: Define the scope of variables and methods. 4 types:
// 1) private: it can be accessed only within the class
// 2) default: if we don't specify any modifier, it is treated as default. Default modifier is accessible only within the package.
// 3) protected: it is accessible within the package and outside the package but through inheritance only.
// 4) public: can be accessed anywhere within the class, package, outside the package.




package accessModifiers;

/*class A
{
	private int a=10;
	private void m1()
	{
		System.out.println(a);
	}
}	*/

class A
{
	int a=10;		// default (can be accessed within the package)
	void m1()		// default method (can be accessed within the package)
	{
		System.out.println(a);
	}
}


public class AccessModifiersExample {

	public static void main(String[] args) {
		
		A aobj = new A();
	//	aobj.a = 20;		// cannot access the variable 'a' since it is private
	//	aobj.m1();		// cannot access method m1() since it is private. Private methods and variables can only be accessed within the same class.
		
		aobj.a = 20;
		aobj.m1();
		
	}

}
