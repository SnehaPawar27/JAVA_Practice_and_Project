import java.util.Scanner;
public class VowelOrConsonant {
	public static void main(String args[])
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your choice:");
		ch=sc.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I'|| ch=='O' || ch=='U')
		{
		System.out.println("Entered character is vowel...!");
		}
		else
		{
			System.out.println("Not Vowel");
		}
		
		
		
	}

}

