import java.util.Scanner;
public class LeapYear {
	public static void main(String args[])
	{
		int Year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Year:");
		Year=sc.nextInt();
		if(Year%4==0)
		{
				if(Year%100==0)
				{
					if(Year%400==0)
					{
						System.out.println("Leap Year");
					}
					else
					{
						System.out.println("Not Leap Year");
					}
				}
				else
				{
					System.out.println("Leap Year");
				}
			}
			else
			{
				System.out.println("Not Leap Year");
			}
		}
		}
			
		
	


