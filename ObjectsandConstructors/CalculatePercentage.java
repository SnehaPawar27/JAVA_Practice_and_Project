package ObjectsandConstructors;
import java.util.Scanner;
public class CalculatePercentage {
	
	int m1,m2,m3,m4,m5;
	
	Scanner sc=new Scanner(System.in);
	
	int Percentage()
	{
		System.out.println("Enter marks:");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
		m5=sc.nextInt();
		int p=((m1+m2+m3+m4+m5)*100)/500;
		return p;
	}
	public static void main(String args[])
	{
		CalculatePercentage c=new CalculatePercentage();
		int P=c.Percentage();
		System.out.println("Percentage are:"+P);
	}

}
