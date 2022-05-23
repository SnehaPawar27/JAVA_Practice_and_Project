import java.util.Scanner;
public class PrimeNoSeries {
	public static void main(String args[])
	{
		int n=2,flag=0;
		Scanner sc=new Scanner(System.in);
		for(int i=2;i<=50;i++)
		{
			for(int j=2;j<=n;j++)
			{
				if((i%j)==0)
				{
					flag=1;
					break;
				}
				else
				{
					flag=0;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
			}
			
		}
	}

}
