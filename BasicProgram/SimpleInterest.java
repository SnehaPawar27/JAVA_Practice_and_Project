import java.util.Scanner;
public class SimpleInterest {
	public static void main(String args[])
	{
		float rate,time,principal,si;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rate:");
		rate=sc.nextFloat();
		System.out.println("Enter Principal :");
		principal=sc.nextFloat();
		System.out.println("Enter Duaration:");
		time=sc.nextFloat();
		si=(rate*time*principal)/100;
		System.out.println("Simple interest is: "+si);

	}
	

}
