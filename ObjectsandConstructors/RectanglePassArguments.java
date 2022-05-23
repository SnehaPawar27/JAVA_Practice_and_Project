package ObjectsandConstructors;
import java.util.Scanner;

public class RectanglePassArguments {
	
	
	int Area(int x,int y)
	{
		int a=x*y;
		return a;
	}
	public static void main(String args[])
	{
		System.out.println("Enter values:");
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int b=sc.nextInt();
		RectanglePassArguments r=new RectanglePassArguments();
		int area=r.Area(l,b);
		System.out.println("Area of Rectangle is:"+area);
		int a2=r.Area(l,b);
		System.out.printf("Area of Rectangle is:%d",a2);
	}

}
