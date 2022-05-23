import java.util.Scanner;
public class CalcluateNotes {
	public static void main(String args[])
	{
		int Amt,bal=10000,c,d,e;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to be withdrawan:");
		Amt=sc.nextInt();
		if(Amt%100==0)
		{
			c=Amt/1000;
			System.out.println("Notes of 1000:" +c);
			c=Amt%1000;
			d=c/500;
			System.out.println("Notes of 500:" +d);
			d=c%500;
			e=d/100;
			System.out.println("Notes of 500:" +e);
		}
		else
		{
			System.out.println("SORRY...! You can't withdraw entered Amount.");
		}
		
	}

}
