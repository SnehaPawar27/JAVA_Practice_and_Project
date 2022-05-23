import java.util.Scanner;
public class ArmstrongNo {
	public static void main(String args[])
	{
		int n,rev=0,a,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		n=sc.nextInt();
		a=n;
		while(n!=0)
		{
			rev=n%10;
			sum=sum+(rev*rev*rev);
			n=n/10;
			
		}
		if(a==sum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
			
		}
	}

}
