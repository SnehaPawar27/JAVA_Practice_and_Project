
public class PatterHashStar {
	public static void main (String args[])
	{
		for(int i=5;i>=1;i--)
		{
			for(int s=5;s>=i;s--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("# ");
				}
				
			}
			System.out.println();
		}
	}

}
