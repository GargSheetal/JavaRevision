package miscellaneous;

// By default all classes extend Object class in java. So here class A extends Object class even though its not mentioned
// By default every constructor have the super() method which calls the super class constructor
// So if you call Class B constructor, Class A default constructor will be automatically called
// if you want to call the parameterized constructor of super class, you have to explicitly mention it in the sub-class constructor
// super(<parameter>)
// If you want to call both the constructors of the same class-default, parameterized, you need to use the this() method. 
// this() method refers and calls the current class constructor
// super() method refers and calls the constructor of the super class

class A
{
	public A() 
	{
		System.out.println("in A");
	}
	
	public A(int n)
	{
		System.out.println("in A int");
	}
}

class B extends A
{
	public B() {
		System.out.println("in B");
	}
	
	public B(int n)
	{
	//	super(n);  // calling the parameterized constructor of parent/super class
		this();  // calls the constructor of the same class
		System.out.println("in B int");
	}
}


public class SuperAndThisExample {
	
	
	public static void main(String[] args) {
		
		B obj = new B(5);
		
	}

}
