import java.util.Scanner;
public class TableOfNo {
	public static void main(String args[])
	{
		int a,b=1,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		a=sc.nextInt();
		while(b<=10)
		{
			c=a*b;
			System.out.println(a+"  *  "+b+"  =  "+c );
			b++;
		}
	}

}
