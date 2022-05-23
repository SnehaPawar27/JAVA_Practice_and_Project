import java.util.Scanner;
public class SwapUsingTemVar {
	public static void main(String args[])
	{
		int a,b,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		a=sc.nextInt();
		System.out.println("Enter the value of b: ");
		b=sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println("Values after swapping: ");
		System.out.println("The vlaue of a is: "+a);
		System.out.println("The vlaue of b is: "+b);

		
	}

}
