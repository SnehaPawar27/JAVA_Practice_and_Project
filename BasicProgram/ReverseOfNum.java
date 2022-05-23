import java.util.Scanner;
public class ReverseOfNum {
	public static void main(String args[])
	{
		int n,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		n=sc.nextInt();
		while(n!=0)
		{
			rev=rev*10+(n%10);
			n=n/10;
		}
		System.out.println("Reverse of entered number is:"+rev);
		
	}

}
