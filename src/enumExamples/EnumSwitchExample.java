package enumExamples;


//Here Status is a class and Running etc are constants/Objects
enum Success1
{
	Running, Failed, Pending, Success;
}

public class EnumSwitchExample {

	public static void main(String[] args) {
		
		Success1 s = Success1.Success;
		
		switch(s)
		{
			case Running:
				System.out.println("All good"); break;
			case Failed:
				System.out.println("Try Again"); break;
			case Pending:
				System.out.println("Please Wait"); break;
			default:
				System.out.println("Done");
		}

	}

}
