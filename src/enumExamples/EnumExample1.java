package enumExamples;

// Here Status is a class and Running etc are constants/Objects
enum Status
{
	Running, Failed, Pending, Success;
}


public class EnumExample1 {

	public static void main(String[] args) {
//		
//		Status s = Status.Running; // creating an object of enum class
//		System.out.println(s);  // prints Running
		
		// Can also print order/position of the contant
	//	System.out.println(s.ordinal());  // prints the position of Running. Order starts from 0 here. So, it will print 0
		
		// Can also store all the constants in an array
		Status[] ss = Status.values(); 
		
		// printing the values using index
	//	System.out.println(ss[3]);  // Success
		
		//printing all the values in the array with their order
		for(Status s:ss)
		{
			System.out.println(s + " : " + s.ordinal());
		}
		
		
		
		

	}

}
