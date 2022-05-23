import java.util.Scanner;
public class AreaOfRectangle {
	public static void main(String args[])
			{
				float Area,length,width;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Length of Rectangle");
				length=sc.nextFloat();
				System.out.println("Enter Width of Rectangle");
				width=sc.nextFloat();
				Area=length*width;
				System.out.println("The area of rectangle is:"+Area);
			}

}
