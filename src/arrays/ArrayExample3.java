package arrays;

public class ArrayExample3 {

	public static void main(String[] args) {
	
		// int a[] = new int[5];
		//new method (Any number of elements can be added in this type of array as the number of elements is not specified)
		
		int a[] = {100, 200, 300, 400, 500};
		int sum = 0;
		
		for(int i:a)
		{
			System.out.println(i);
			sum=sum+i;	// 100, 300, 600, 1000, 1500
		}
			
		System.out.println("Sum of the elements in the array is: " + sum);
		
		
	}

}
