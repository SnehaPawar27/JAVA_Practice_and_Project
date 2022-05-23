package ObjectsandConstructors;

public class MethodDeclarationAndCalling {
	int rollno=1;
	String name="Sneha";
	void display()
	{
		System.out.println(rollno);
		System.out.println(name);
	}
	public static void main(String args[])
	{
		MethodDeclarationAndCalling s=new MethodDeclarationAndCalling();
				System.out.println(s.rollno);
				System.out.println(s.name);
				System.out.println();
				s.display();
	}

}
