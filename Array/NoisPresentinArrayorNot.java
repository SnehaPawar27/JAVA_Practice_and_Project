package Array;
import java.util.Scanner;
public class NoisPresentinArrayorNot {
	public static void main(String args[])
	{
		int flag=0;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. to be search in Array:");
		n=sc.nextInt();
		int a[]= {10,20,30,40,50,60,70,80,90};
		for(int i=0;i<a.length;i++)
		{
			
		
			if(a[i]==n)
			{
				flag=1;
				break;
			}
			
		
	}
		if(flag==1)
		{
			System.out.println("Entered number is present in array.");
		}
		else
		{
			System.out.println("Entered number is not present in array.");
		}

}
}