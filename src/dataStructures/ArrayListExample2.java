package dataStructures;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		System.out.println("Number of elements in array list before adding elements are: " + al.size());
		
		// adding elements to array list
		al.add("Welcome");
		al.add(10);
		al.add(10.456);
		al.add('C');
		
		System.out.println("Number of elements in array list after adding elements are: " + al.size()); // number of elements in array list
		System.out.println("Elements in array list: " + al);
		
		// inserting elements in array list
		
		al.add(2, "training");		// adding new element after 2 elements, 2 is not the position/index here. It describes after the number of elements
		al.add(1, 1234);		// adding new element after 1st element
		
		System.out.println("Number of elements in array list after adding new elements are: " + al.size());
		
		System.out.println("Elements in array list: " + al);	// specify the array name directly to print the elements in it
		
		
		// deleting elements from array list
		al.remove("Welcome");	// removing element from array list by specifying the element
		System.out.println(al.size());
		
		al.remove(1);		// removing the element from array list by specifying the index, removes '10' from above array list
		System.out.println(al.size());
		
		System.out.println("Elements in array list: " + al);
		
		
		

	}

}
