package loops;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int a[] = new int [5];		// declaration of array with 5 elements
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		// For Each loop---- Just initialize the variable i with the name of the array
		for(int i:a)
		{
			System.out.println(i);
		}
		
		

	}

}
