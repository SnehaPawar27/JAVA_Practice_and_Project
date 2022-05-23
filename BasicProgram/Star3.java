
public class Star3 {
	public static void main(String args[])
	{
		int count=1;
		for(int i=1;i<=5;i++)
		{
			for(int s=4;s>=i;s--)
			{
				System.out.print(" ");
			}
			System.out.print("*");	
				if(i==1)
				{
					System.out.println();
					continue;
				}
				else
				{
					for(int k=1;k<=count;k++)
					{
						System.out.print(" ");
					}
					System.out.print("*");
				}
				System.out.println();
				count=count+2;
	}

}
}