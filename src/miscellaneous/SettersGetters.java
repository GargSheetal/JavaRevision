package miscellaneous;

// binding the data with the methods is known as encapsulation


class Human {
	
	private int age;
	private String name;
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getName()
	{
		return name;
	}
}


public class SettersGetters {

	public static void main(String[] args) {
		
		Human human = new Human();
		human.setAge(20);
		human.setName("Praveen");
		
		System.out.println(human.getName() + " : " + human.getAge());

	}

}
