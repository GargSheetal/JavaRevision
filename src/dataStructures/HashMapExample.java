package dataStructures;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		//Declaring HashMap
		
		// HashMap <datatype> hm = new HashMap<datatype>();
		
		HashMap<Integer, String> hm = new HashMap<Integer, String> ();
		
		// adding pairs in HashMap
		hm.put(100, "Pavan");
		hm.put(200, "Raj");
		hm.put(300, "Simran");
		
		// printing the values in the HasMap
		
		System.out.println(hm);
		
		
		// Printing the values of HashMap using for..each loop
		// entrySet is a method name for getting the key pair in java. 
		
		for(Map.Entry m:hm.entrySet())  // storing the values of each entrySet or Key pair in the variable 'm'. Its type is Map.Entry
		{
			// "m" contains both the key and pair value. We need to separate them to read them. The method m.getkey() gets the key value 
			// and m.getvalue() method gets the value of the "Value".
			
			System.out.println(m.getKey() + "  " + m.getValue());
		}
		
		
		//Removing pair for HashMap:
		
		hm.remove(300);		// specifying just the key removes the whole pair
		System.out.println("After removing a pair: "+ hm);

	}

}
