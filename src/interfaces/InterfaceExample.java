package interfaces;

interface TestInterface
{
	int a=10;	// by default variable is static and final
	void display();		// by default public and abstract method
}



public class InterfaceExample implements TestInterface {
	
	public void display()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		InterfaceExample ie = new InterfaceExample();
		ie.display();
		
		TestInterface ti = new InterfaceExample(); // instantiate the interface with the sub class
		ti.display();
		
		
	}

}
