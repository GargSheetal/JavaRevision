package enumExamples;

//Here Status is a class and Running etc are constants/Objects
enum Result
{
	Running, Failed, Pending, Success;
}

public class EnumIfElse {

	public static void main(String[] args) {
		
		Result r = Result.Running;
		
		if(r == Result.Running)
			System.out.println("All Good");
		else if(r == Result.Failed)
			System.out.println("Try Again");
		else if(r == Result.Pending)
			System.out.println("Please Wait");
		else if(r == Result.Success)
			System.out.println("Done");

	}

}
