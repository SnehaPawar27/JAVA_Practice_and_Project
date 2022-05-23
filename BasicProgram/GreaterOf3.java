import java.util.Scanner;
public class GreaterOf3 {
	public static void main(String args[])
	{
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbers:");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		if(x>y)
		{
			if(x>z)
			{
				System.out.println("X is Greatest...!");
			}
			else
			{
				System.out.println("Z is Greatest...!");
			}
		}
		else
		{
		if(y>z)
		{
			System.out.println("Y is Greatest...!");
		}
		else 
		{
			System.out.println("Z is Greatest...!");
		}
	}

}
}