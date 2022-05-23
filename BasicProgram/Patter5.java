
public class Patter5 {
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int space=4;space>=i;space--)
			{
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
