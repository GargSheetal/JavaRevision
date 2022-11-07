package arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = "Welcome";
		
		// length()
		System.out.println(s.length());	// 7
		
		// concat()
		String s1 = "welcome";
		String s2 = " to training";
		
		System.out.println(s1+s2);	// using + operator
		System.out.println(s1.concat(s2));	// using concat() method
		
		System.out.println("Welcome" + " to training");
		System.out.println("Welcome".concat(" to training"));
		
		// equals() & equalsIgnoreCase()
		String s3 = "WELCOME";
		String s4 = "welcome";
		
		System.out.println(s3.equals(s4));		//false
		System.out.println(s3.equalsIgnoreCase(s4));	// true
		
		//contains()
		System.out.println(s3.contains("WEL"));		// true
		System.out.println(s3.contains("DEL"));		//false
		System.out.println(s3.contains("com"));		// false as it is in lower case
		System.out.println(s3.contains("COM"));		// true
		
		//substring(starting index, ending index)
		System.out.println(s.substring(0,3));
		System.out.println(s.substring(2,5));
		System.out.println(s.substring(4,7));
		
		// replace()
		s = "Welcome";
		System.out.println(s.replace('e', 'a'));		// replacing the characters
		System.out.println(s.replace("come", "crow"));		// replacing the string
		
	}

}
