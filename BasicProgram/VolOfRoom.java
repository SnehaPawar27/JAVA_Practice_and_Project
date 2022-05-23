import java.util.Scanner;
public class VolOfRoom {
	public static void main(String args[])
	{
		float l,w,h,v;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length: ");
		l=sc.nextFloat();
		System.out.println("Enter width: ");
		w=sc.nextFloat();
		System.out.println("Enter height: ");
		h=sc.nextFloat();
		v=l*w*h;
		System.out.println("Volume of a room: " +v);
		
	}

}
