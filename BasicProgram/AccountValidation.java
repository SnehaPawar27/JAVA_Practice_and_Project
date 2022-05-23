import java.util.Scanner;
public class AccountValidation {
	public static void main(String args[])
	{
		int AccountNo,WithdrawAmt,Balance=10000;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Account Number:");
		AccountNo=sc.nextInt();
		if(AccountNo>=1000 && AccountNo<=999999999)
		{
			System.out.println("Enter Amount to be Withdrawn:");
			WithdrawAmt=sc.nextInt();
			if(WithdrawAmt<=Balance)
			{
				Balance=Balance-WithdrawAmt;
				System.out.println("The Remaining Balance:"+Balance);
			}
			else
			{
				System.out.println("Sorry:( Insufficient Balance...");
			}
		}
		else
		{
			System.out.println("Your Account Number is not valid:");
		}
	}

}
