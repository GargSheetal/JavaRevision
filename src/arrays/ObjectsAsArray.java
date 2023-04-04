package arrays;



class Student {
	
	String name;
	int rollNo;
	int marks;
}



public class ObjectsAsArray {

	public static void main(String[] args) {
		
		// creating student objects 
		
		Student s1 = new Student();
		s1.name = "Vikas";
		s1.rollNo = 1;
		s1.marks = 78;
		
		Student s2 = new Student();
		s2.name = "Kiran";
		s2.rollNo = 2;
		s2.marks = 89;
		
		Student s3 = new Student();
		s3.name = "Mehul";
		s3.rollNo = 3;
		s3.marks = 60;
		
		// creating an array of students
		Student students[] = new Student[3];
		
		//assigning student objects to students[] array
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		// printing the array
//		for(int i=0; i<students.length; i++)
//		{
//			System.out.println(students[i].name + " : " + students[i].marks);
//		}
		
		// enhanced for loop
		for(Student stud: students) // iterating the students array and storing it in Student type variable
		{
			System.out.println(stud.name + " : " + stud.marks);
		}
		

	}

}
