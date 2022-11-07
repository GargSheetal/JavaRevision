package arrays;

public class ObjectArray {

	public static void main(String[] args) {
		
		Object a[]=new Object[5];
		
		a[0]=10;
		a[1]=20.5;
		a[2]="wecome";
		a[3]='G';
		a[4]=true;
		
		for(Object i:a)
		{
			System.out.println(i);
		}
		
		// Object array without specifying number of elements
		
		Object b[] = {100, 345.67, "welcome", 'D', false};
		
		for(Object i:b)
		{
			System.out.println(i);
		}

	}

}
