package inheritance;


//Method Overriding--> involves rewriting the methods in child classes. Method definition, parameters should not change. Method body should change.
//Method overriding can be achieved only by inheritance. It needs atleast 2 classes.




class Bank			// superclass
{
	int getRateOfInterest()
	{
		return 0;
	}
}

class SBI extends Bank		//method overriding
{
	int getRateOfInterest()
	{
		return 10;
	}
}

class ICICI extends Bank		//method overriding
{
	int getRateOfInterest()
	{
		return 15;
	}
}

class AXIS extends Bank		//method overriding
{
	int getRateOfInterest()
	{
		return 12;
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
		
		SBI sbiobj = new SBI();
		System.out.println(sbiobj.getRateOfInterest());		//10
		
		ICICI iciciobj = new ICICI();
		System.out.println(iciciobj.getRateOfInterest());		//15
		
		AXIS axisobj = new AXIS();
		System.out.println(axisobj.getRateOfInterest());		//12

	}

}
