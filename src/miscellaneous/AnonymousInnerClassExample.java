package miscellaneous;

/* We can create a new anonymous inner class after creating an object of a class that contains the method.
 * We do not need to use a class keyword with an anonymous inner class.
 * It just starts with braces and contains the method and its new implementation.
 * Anonymous inner class starts just the creation of an object and ends with the semicolon of that object.
*/

abstract class X 
{
	public abstract void show();
	
}



public class AnonymousInnerClassExample {

	public static void main(String[] args) {
		
		X obj = new X()
		{
			public void show()
			{
				System.out.println("In new show");
			}
		};
		obj.show();
	}

}
