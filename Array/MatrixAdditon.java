package Array;
import java.util.Scanner;
public class MatrixAdditon {
	public static void main(String args[])
	{
		int r,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of row:");
		r=sc.nextInt();
		System.out.println("Enter the no. of columns:");
		c=sc.nextInt();
		System.out.println("Enter values of matrix A:");
		int d[][]=new int[r][c];
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("Enter values of matrix B:");
		int b[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				b[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				d[i][j]=(a[i][j])+(b[i][j]);
				System.out.println(d[i][j]);
			}
		
	}

}
}
