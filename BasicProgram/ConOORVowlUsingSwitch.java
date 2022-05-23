import java.util.Scanner;
public class ConOORVowlUsingSwitch {
	public static void main(String args[])
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your choice:");
		ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
		case 'b':
			System.out.println("Consonant");
			default:
				System.out.println("Invalid Input");
		}
	}

}
