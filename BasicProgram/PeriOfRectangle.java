import java.util.Scanner;
public class PeriOfRectangle {
	public static void main(String args[])
	{
		float peri,length,width;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length:");
		length=sc.nextFloat();
		System.out.println("Enter width:");
		width=sc.nextFloat();
		peri=2*(length+width);
		System.out.println("Peimeter of Rectangle is"+peri);
		
	}
	
}
