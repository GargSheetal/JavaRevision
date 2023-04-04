package miscellaneous;

class Abc
{
	public void show1()
	{
		System.out.println("in A show");
	}
	
	class Xyz
	{
		public void show2()
		{
			System.out.println("In B show");
		}
	}
	
	static class D
	{
		public void config()
		{
			System.out.println("In D config");
		}
	}
}


public class InnerClassExample {

	public static void main(String[] args) {
		
		Abc obj1 = new Abc();
		obj1.show1();
		
		// Xyz is an inner class in class Abc. Its method can only be accessed by Using Abc class reference i.e. using its object
		// To create an object class Xyz, you need to use the object of class Abc
		Abc.Xyz obj2 = obj1.new Xyz();
		obj2.show2();
		
		// static inner class object can be formed using outer class reference
		Abc.D obj3 = new Abc.D();
		obj3.config();

	}

}
