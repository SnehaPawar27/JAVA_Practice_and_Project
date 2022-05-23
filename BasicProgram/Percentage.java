import java.util.Scanner;
public class Percentage {
	public static void main(String args[])
	{
		int s1,s2,s3,s4,s5,total,percentage;
		Scanner sc=new Scanner(System.in);
		System.out.println("Marks out of 500");
		System.out.println("Enter Marks of English: ");
		s1=sc.nextInt();
		System.out.println("Enter Marks of Marathi: ");
		s2=sc.nextInt();
		System.out.println("Enter Marks of Maths: ");
		s3=sc.nextInt();
		System.out.println("Enter Marks of History: ");
		s4=sc.nextInt();
		System.out.println("Enter Marks of EVS: ");
		s5=sc.nextInt();
		total=s1+s2+s3+s4+s5;
		System.out.println("Print Total: "+total);
		
		percentage=(total*100)/500;
		System.out.println("Percentage are as follows: "+percentage);
	}

}
