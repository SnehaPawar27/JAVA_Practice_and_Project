import java.util.Scanner;
public class BitwiseOperators {
	public static void main(String args[])
	{
		byte a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ethe value of a: ");
		a=sc.nextByte();
		System.out.println("Enter ethe value of b: ");
		b=sc.nextByte();
		System.out.println("Applying Bitwise operators:");
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);
		System.out.println(~b);
		System.out.println(a<<2);
		System.out.println(a>>2);
	}

}
