package staticKeyword;


class Mobile {
	
	String brand;
	int price;
	static String name;
	
	public void show()
	{
		System.out.println(brand + " : " + price + " : " + name);
	}
	
	// cannot access non-static variables in static method directly. But can be done using object reference
	// So create the class obj parameter in the static method and access the non-static variables using object reference
	public static void show1(Mobile obj)
	{
		System.out.println(obj.brand + " : " + obj.price + " : " + name);
	}
	
}


public class StaticMethodExample {

	public static void main(String[] args) {
		
		Mobile.name = "SmartPhone";
		
		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 1200;
		
		Mobile obj2 = new Mobile();
		obj2.brand = "Samsung";
		obj2.price = 1100;
		
		obj1.show(); // non-static method accessed using object reference
		obj2.show();
		
		Mobile.show1(obj1); // static method accessed using class name
		Mobile.show1(obj2);
			

	}

}
