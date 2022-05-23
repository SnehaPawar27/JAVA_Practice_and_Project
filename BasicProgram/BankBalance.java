import java.util.Scanner;
public class BankBalance {
	public static void main(String args[])
	{
		float balance=5000f,withdrawAmt;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to be withdrawn:");
		withdrawAmt=sc.nextInt();
		if(withdrawAmt<=balance)
		{
			balance=balance-withdrawAmt;
			System.out.println("The balance in the account is: "+balance);
		}
		else
		{
			System.out.println("Your balance is insufficient...!");
		}
			
			
	}

}
