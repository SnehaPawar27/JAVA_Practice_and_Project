package Array;
import java.util.Scanner;
public class Merging2Arrays {
	public static void main(String args[])
	{
		int d=0;
		int a[]= {10,20,30,40,50};
		int b[]= {60,70,80,90,100};
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[d]=a[i];
			d++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[d]=b[i];
			d++;
		}
		System.out.println("Elements in array c:");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}

}
