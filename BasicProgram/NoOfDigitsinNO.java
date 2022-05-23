import java.util.Scanner;
public class NoOfDigitsinNO {
	public static void main(String args[])
	{
		int n,a=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		n=sc.nextInt();
		while(n!=0)
		{
		n=n/10;
		a++;
		}
		System.out.println(a);
	}
}
