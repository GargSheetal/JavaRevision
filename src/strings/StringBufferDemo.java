package strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		// StringBuffer is mutable. You can change the data
		StringBuffer sb = new StringBuffer("Manisha");
		
		// capacity gives you the capacity of the string buffer
		// by default the capacity is 16 even if the String is empty. 
		//It gives extra spaces in case the data changes and expand. And if that happens it has to relocate so it gives buffer to prevent relocation
		System.out.println(sb.capacity());	// 23
		
		// length()
		System.out.println(sb.length()); // 7
		
		// append() data
		sb.append(" Mehra");
		System.out.println(sb); // Manisha Mehra
		
		// Converting string buffer data to String - toString()
		String str = sb.toString();
		
		
	
		
		
		
		

	}

}
