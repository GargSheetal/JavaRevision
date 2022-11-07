package inheritance;


class Vehicle
{
	void run()
	{
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle
{
	void run()
	{
		System.out.println("Bike is running");
	}
}


public class MethodOverriding2 {

	public static void main(String[] args) {
		
	/*	Vehicle vobj = new Vehicle();
		vobj.run();	*/
		
		Bike bobj = new Bike();
		bobj.run();

	}

}
