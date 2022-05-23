import java.util.Scanner;
public class PrimeNumber {
	public static void main(String args[])
	{
		int n,flag=0;;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		n=sc.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not Prime");
		}
	}

}
