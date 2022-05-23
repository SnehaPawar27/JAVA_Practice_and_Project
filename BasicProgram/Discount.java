import java.util.Scanner;
public class Discount {
	public static void main(String args[])
	{
		float ProdPrice,discount,decimal,FinalPrice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Price of the product:");
		ProdPrice=sc.nextFloat();
		System.out.println("Enter Discount on the product:");
		discount=sc.nextFloat();
		decimal=discount/100;
		FinalPrice=ProdPrice*decimal;
		System.out.println("Discounted price: " +FinalPrice);
	}

}
