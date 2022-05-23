package Array;
import java.util.Scanner;
public class SplitArray {
	public static void main(String args[])
	{
		int d=0,e=0;
		int loc;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Location at which you want to split the array:");
		loc=sc.nextInt();
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		
		int b[]=new int[loc];
		int c[]=new int[a.length-loc];
		
		for(int i=0;i<loc;i++)
		{
			b[d]=a[i];
			d++;
		}
		
		for(int i=loc;i<a.length;i++)
		{
			c[e]=a[i];
			e++;
		}
		System.out.println("Values in Array b:");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
			
		}
		System.out.println("Values in Array c:");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
			
		}
		
	}

}
