import java.util.Scanner;
public class SwitchCase {
	public static void main(String args[])
	{
		int choice,a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your choice:");
		choice=sc.nextInt();
		switch (choice)
		{
		case 1:
		{
			System.out.println("Enter the value of a:");
			a=sc.nextInt();
			System.out.println("Enter the value of b:");
			b=sc.nextInt();
			c=a+b;
			System.out.println("Addition of " +a+ " and " +b+ " is " +c);
			break;
		}
		case 2:
		{
			System.out.println("Enter the value of a:");
			a=sc.nextInt();
			System.out.println("Enter the value of b:");
			b=sc.nextInt();
			c=a-b;
			System.out.println("Subtraction of " +a+ " and " +b+ " is " +c);
			break;
		}
		case 3:
		{
			System.out.println("Enter the value of a:");
			a=sc.nextInt();
			System.out.println("Enter the value of b:");
			b=sc.nextInt();
			c=a*b;
			System.out.println("Multiplication of " +a+ " and " +b+ " is " +c);
			break;
		}
		case 4:
		{
			System.out.println("Enter the value of a:");
			a=sc.nextInt();
			System.out.println("Enter the value of b:");
			b=sc.nextInt();
			c=a/b;
			System.out.println("Division of " +a+ " and " +b+ " is " +c);
			break;
		}
		default:
		{
			System.out.println("You entered a wrong choice...!");
		}
		}
	}

}
