
public class TraingleStar {
	public static void main(String args[])
	{
		int c=1; 
		for(int i=1;i<=5;i++)
		{
			for(int s=4;s>=i;s--)
			{
				System.out.print("  ");
			}
			for(int j=c;j>=1;j--)
			{
				System.out.print(Math.abs(j-1)+" ");
			}
			c=c+2;
			System.out.println();
			
		}
	}

}
