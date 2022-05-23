import java.util.Scanner;
public class EligibilityForJob {
	public static void main(String args[])
	{
		int Marks,Experience;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks:");
		Marks=sc.nextInt();
		if(Marks>=60)
		{
			System.out.println("Your Experience ?:");
			Experience=sc.nextInt();
			if(Experience>=2)
		{
			System.out.println("You are Eligible for Job...:)");
			
		}
			else
			{
				System.out.println("Sorry:(...! You have not much experience.");
			}
		}
		else
		{
			System.out.println("You are not Eligible for Job...:(");
		}
	}

}
