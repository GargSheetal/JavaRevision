package oops;

public class Employee {
		
		int empid;
		String empName;
		int salary;
		int deptNo;
		
	/*	Employee(int id, String name, int sal, int dno)
		{
			empid=id;
			empName=name;
			salary=sal;
			deptNo=dno;
		}	*/
		
		void setdata(int id, String name, int sal, int dno)
		{
			empid=id;
			empName=name;
			salary=sal;
			deptNo=dno;
		}
			
		void display()
		{
			System.out.println(empid);
			System.out.println(empName);
			System.out.println(salary);
			System.out.println(deptNo);
		}
		
		public static void main(String args[])
		{
		/*	// Assigning values to the class variables by creating object for the class -- First method
			Employee emp1 = new Employee();
			emp1.empid = 101;
			emp1.empName = "Raj";
			emp1.salary = 20000;
			emp1.deptNo = 10;
			emp1.display();		*/
			
		/*	Employee emp2 = new Employee();
			emp2.empid = 102;
			emp2.empName = "Vijay";
			emp2.salary = 30000;
			emp2.deptNo = 20;
			emp2.display();		*/
			
			
			// Assigning values to the class variables using constructor -- 2nd method
			// Constructor is automatically called at the time of object creation by passing the parameters.
			
		/*	Employee emp1 = new Employee(101, "Raj", 20000, 10);
			emp1.display();
			
			Employee emp2 = new Employee(102, "Vijay", 30000, 10);
			emp2.display();			*/
			
			// Assigning values to the class variables using method -- 3rd method
			
			Employee emp1 = new Employee();
			emp1.setdata(101, "Raj", 20000, 10);
			emp1.display();
			
			Employee emp2 = new Employee();
			emp2.setdata(102, "Vijay", 30000, 20);
			emp2.display();
			
			
		}

	}

