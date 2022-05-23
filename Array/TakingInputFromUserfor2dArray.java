package Array;
import java.util.Scanner;
public class TakingInputFromUserfor2dArray {

	public static void main(String args[])
	{
		int r,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of row:");
		r=sc.nextInt();
		System.out.println("Enter the no. of columns:");
		c=sc.nextInt();
		System.out.println("Enter values:");
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println(a[i][j]);
			}
		
		
	}

	}
}
