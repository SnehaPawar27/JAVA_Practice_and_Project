
public class NumericPattern1 {
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int s=1;s<=i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(i==j) {
				System.out.print(j);
			}
				else
				{
					System.out.print(" ");
				}
			
		}
			System.out.println();
	}

}
}
