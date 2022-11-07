package arrays;

public class ArrayExample2 {

	public static void main(String[] args) {
		
		String s[] = new String[3];
		
		s[0] = "welcome";
		s[1] = "to";
		s[2] = "training";
		
		System.out.println(s.length);		// s.length method gives the length of an array i.e. arrayName.length
		
		// Print the element's values in an array
		for(String i:s)
		{
			System.out.println(i);
		}

	}

}
