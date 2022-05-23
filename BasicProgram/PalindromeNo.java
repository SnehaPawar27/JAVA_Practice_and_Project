import java.util.Scanner;
public class PalindromeNo {
	public static void main(String args[])
	{
		int n,rev=0,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		n=sc.nextInt();
		a=n;
		while(n!=0)
		{
			rev=rev*10+(n%10);
			n=n/10;
			
		}
		System.out.println("Reverse of entered number is:"+a);
		if(a==rev)
		{
			System.out.println("Entered Number is Plindrome Number...");
		}
		else
		{
			System.out.println("Entered Number is not Plindrome Number...");
		}
		
	}
		

}
