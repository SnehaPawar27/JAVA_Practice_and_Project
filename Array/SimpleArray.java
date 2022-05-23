package Array;
import java.util.Scanner;
public class SimpleArray {
	public static void main(String args[])
	{
		int a[]=new int[10];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println("Printing the values of array a:");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println("Printing the values of array b:");
		int b[]= {10,20,30,40,50};
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		System.out.println(b[4]);
		System.out.println("Printing the values of array c:");
		int c[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<=9;i++)
		{
			System.out.println(c[i]);
		}
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of elements in array:");
		n=sc.nextInt();		
		int d[]=new int[n];
		for(int i=0;i<d.length;i++)
		{
			d[i]=sc.nextInt();
		}
		System.out.println("Printing the values of array d:");
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
		
	}

}
