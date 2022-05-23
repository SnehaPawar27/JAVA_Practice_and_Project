package ObjectsandConstructors;

public class Student {
	int rollno;
	String name;
	int age;
	Student(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public static void main(String args[])
	{
		System.out.println("StudentsDetails:");
		Student s=new Student(1,"Sneha",21);
		System.out.println("Roll Number: " +s.rollno);
		System.out.println("Name:" +s.name);
		System.out.println("Age: " +s.age);
	}

}
