package enumExamples;


enum Laptop
{
	// can also have an object without price but you have to create a default constructor for that
	MacBook(2000), XPS(2200), Surface, ThinkPad(2400);
	
	private int price;
	
	// setting default value for the price if not provided
	private Laptop() {
		price = 500;
	}

	// creating private constructor as we are creating the object in the same class itself
	private Laptop(int price) {
		this.price = price;
	}

	// getters and setters method to get the price
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}


public class EnumObjectsAndConstructors {

	public static void main(String[] args) {
		
	//	Laptop lap = Laptop.MacBook;
//		System.out.println(lap);
		
		// getting the class which enum extends by default
	//	System.out.println(lap.getClass().getSuperclass());	// class java.lang.Enum
		
		// printing all the values using array
		for(Laptop lap : Laptop.values())
		{
			System.out.println(lap + " : " + lap.getPrice());
		}
	}

}
