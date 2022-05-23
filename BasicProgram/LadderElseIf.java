import java.util.Scanner;
public class LadderElseIf {
	public static void main(String args[])
	{
		int s1,s2,s3,s4,s5,t,P;
		System.out.println("Enter Marks:");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		s4=sc.nextInt();
		s5=sc.nextInt();
		t=s1+s2+s3+s4+s5;
		P=(t*100)/500;
		System.out.println("Your Percentage are:" +P+"%");
		if(P>90 && P<=100)
		{
			System.out.println("You Got A+ Grade...!");
		}
		else if(P>80 && P<=90)
		{
			System.out.println("You Got A Grade...!");
		}
		else if(P>70 && P<=80)
		{
			System.out.println("You Got B Grade...!");
		}
		else if(P>60 && P<=70)
		{
			System.out.println("You Got C Grade...!");
		}
		else if(P>50 && P<=60)
		{
			System.out.println("You Got D Grade...!");
		}
		else 
		{
			System.out.println("Sorry :( You are Fail...!");
		}
	}

}
