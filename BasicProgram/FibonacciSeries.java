import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String args[])
	{
		int n,a=0,b=1,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number upto which you want fibonacci series");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
		
		
	}

}
