package inheritance;


class D			// This is parent class/ Super class/ Base class
{
	int a;
	int b;
	
	public void display()
	{
		System.out.println(a+b);
	}
}

class E extends D			// This is child class/ Sub class/ Derived class
{
	int x;
	int y;
	
	public void show()
	{
		System.out.println(x+y);
	}
}


class F extends E
{
	int p;
	int q;
	
	public void addition()
	{
		System.out.println(p+q);
	}
}


public class MultiLevelInheritance {

	
	public static void main(String[] args) {
		
		F fobj = new F();
		fobj.a=100;
		fobj.b=200;
		fobj.x=300;
		fobj.y=400;
		fobj.p=500;
		fobj.q=600;
		
		fobj.display();
		fobj.show();
		fobj.addition();

	}

}
