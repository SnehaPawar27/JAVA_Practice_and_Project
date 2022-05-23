package Array;
import java.util.Scanner;
public class BubbleSortOfArray {
	public static void main(String args[])
	{
		int temp;
		int a[]= {100,90,50,60,40};
		System.out.println(" Array in Ascending order is: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			System.out.println(a[i]);
			
		}
		System.out.println(" Array in Descending  order is: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			System.out.println(a[i]);
			
		}
		}

}
