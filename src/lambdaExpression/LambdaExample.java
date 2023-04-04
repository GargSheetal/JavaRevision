package lambdaExpression;

// a functional interface is an interface wit only one method. @FunctionalInterface annotation restricts the interface to have more than 1 function
// functional interface is also called SAM - single abstract method 
// there are various ways to implement the interface: 
// By Class, By anonymous inner class, By lambda expression
// lambda expression can only be used with functional interfaces

@FunctionalInterface
interface D
{
	//void show(int i);
	int add(int i, int j);
}

// Implementing interface using class
//class E implements D
//{
//	public void show()
//	{
//		System.out.println("in Show");
//	}
//}

public class LambdaExample {

	public static void main(String[] args) {
		
//		// implementing interface D using anonymous inner class
//		D obj = new D()
//		{
//			public void show()
//			{
//				System.out.println("in Show");
//			}
//		};
		
		// implementing interface D using lambda expression (like arrow functions in JavaScript)
		
	//	D obj = () -> System.out.println("in Show");
		
	// if the method to be implemented accepts parameter
//		D obj = i -> System.out.println("in Show " + i);
//		
//		obj.show(5);
		
		// implementing method with a return
		D obj = (i, j) -> i + j;
		
		System.out.println(obj.add(3,  4));
	}

}
