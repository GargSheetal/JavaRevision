package javaRevision;

public class Operators {

	public static void main(String[] args) {
		
		//Arithematic operators +, -, *, /, % 
		
		int a = 10;
		int b = 20;
		
		System.out.println(a+b);	//30
		System.out.println(b-a);	//10
		System.out.println(a*b);	//200
		System.out.println(a/b);	//0
		System.out.println(a%b);	//10
		
		
		//Relational Operators <, >, <=, >=, ==, != (Returns boolean value i.e. either true/false)
		
		System.out.println(a<b);	//true
		System.out.println(a>b);	//false
		System.out.println(a<=b);	//true
		System.out.println(a>=b);	//false
		System.out.println(a==b);	//false
		System.out.println(a!=b);	//true
		System.out.println("------------");
		
		// logical operators &&, ||, ! (returns boolean value either true/false)
		
		boolean x = true;
		boolean y = false;
		
		System.out.println(x && y);	//false
		System.out.println(x || y);	//true
		System.out.println(!x);	 //false
		System.out.println(!y);	//true
		
		
		// Assignment operators =, +=, -=, *=, /=
		
		int c;
		c = a;
		System.out.println(c);
		
		c=b;
		System.out.println(c);
		
		c = 100;
		//c = c+5; 	//105
		c+=5;	//105
		System.out.println(c);
		
		c = 100;
		c-=5;	
		System.out.println(c);
		
		
		// Increment operators ++
		
		c =100;
		//c = c+1;	//101
		c++;	//101
		System.out.println(c);
		
		
		
		// Decrement operator
		c=100;
		//c = c-1;	//99
		c--;
		System.out.println(c);
		
			
		
		
	}

}
