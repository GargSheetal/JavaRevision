package arrays;

public class TwoDimensionalArray1 {

	public static void main(String[] args) {
		
		int a[][] = {{10, 20, 25}, {30, 40, 45}, {50, 60, 65}, {70, 80, 85}, {90, 100, 95}};
		
		for(int i[]:a)			// Converting the values of the first row into a single dimensional array i[]
		{
			for(int j:i)			// assigning the values of the array to variable j in order to read them
			{
				System.out.print(j + "  ");
			}
			System.out.println();
		}

	}

}
