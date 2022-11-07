package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		int a[][] = new int[3][2];			// declaration of array
		
		// assigning values in 2-dimensional array
		a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]=60;
		
		// classic for loop for reading the values in the array
		
		for(int i=0; i<=2; i++)		// for incrementing the rows
		{
			for(int j=0; j<=1; j++)		// for incrementing the columns for each row
			{
				System.out.print(a[i][j] + "  ");		// for printing the values in the same line
			}
			System.out.println();
		}

		
		//For..each loop
		
		for(int i[]:a)		// Converting the values of the first row into a single dimensional array i[]
		{
			for(int j:i)		// assigning the values of the array to variable j in order to read them
			{
				System.out.print(j + "  ");
			}
			System.out.println();
		}
		
		
		
	}

}
