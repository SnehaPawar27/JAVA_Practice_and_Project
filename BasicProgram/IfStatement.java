import java.util.Scanner;
public class IfStatement {
	public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		if (a>0)
		{
			System.out.println("a is Posotive...!");
		}
		else
		{
		System.out.println("a is Negtive...!");
		}
		
	}

}
