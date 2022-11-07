package interfaces;

final class Test
{
	final int a = 100;
	
	final void m1()
	{
		//a = 200;	// final variable value cannot be changed
		System.out.println(a);
	}
}

/*class Test123 extends Test		// class Test is final so it cannot be extended to any other class
{
	/*void m1()		// method m1 is final so it cannot be overridden
	{
		System.out.println("m1 is overridden");
	}	
}	*/




public class FinalExample {

	public static void main(String[] args) {
		

	}

}
