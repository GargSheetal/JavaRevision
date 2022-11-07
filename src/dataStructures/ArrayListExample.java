
// Always use for..each loop for reading values for ArrayList/ 2 dimensional array

package dataStructures;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		//adding elements to array list
		list.add("Raj");
		list.add("Ravi");
		list.add("Pavan");
		list.add("Naveen");
		list.add("Simran");
		
		System.out.println(list.size());		// returns the number of elements in array list
		
		// reading elements from array list
		for(String s:list)
		{
			System.out.println(s);
		}

	}

}
