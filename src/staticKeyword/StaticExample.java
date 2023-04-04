package staticKeyword;


class Help {
	
	static
	{
		System.out.println("Help class static block");
	}
	
	static void wish() {
		System.out.println("Help Class Static Method: HELLO!!");
	}
}



public class StaticExample {
	
	static {
		System.out.println("Static block executed before main method and constructor");
	}
	
	{
		// non-static block
		System.out.println("Non-static block executed before the execution of constructor");
	}
	
	StaticExample() {
		System.out.println("StaticExample class constructor");
	}

	public static void main(String[] args) {
		
		System.out.println("Main Method executed");
		
		StaticExample se = new StaticExample(); //non static block executed when we create object 
		
		//Help help; // this will not execute static block of Help class
		Help help = new Help();	// this will execute static block of Help class
		Help.wish(); // this will execute static block of Help class
	}

}
