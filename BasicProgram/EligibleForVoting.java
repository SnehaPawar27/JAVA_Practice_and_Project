import java.util.Scanner;
public class EligibleForVoting {
	public static void main(String args[])
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age of candidate:");
		age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Candidate is eligible for voting...!");
		}
		else
		{
			System.out.println("Candidate is not eligible for voting...!");
		}
	}

}
