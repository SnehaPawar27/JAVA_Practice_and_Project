import java.util.Scanner;
public class AreaOfTraingle {
	public static void main(String args[])
	{
		float Area, base,height;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base:");
		base=sc.nextFloat();
		System.out.println("Enter height:");
		height=sc.nextFloat();
		Area=(base*height)/2;
		System.out.println("Area of Triangle is:" +Area);
		
		
	}

}
