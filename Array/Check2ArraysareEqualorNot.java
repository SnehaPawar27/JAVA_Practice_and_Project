package Array;

public class Check2ArraysareEqualorNot {
	public static void main(String args[])
	{
		boolean EqualorNot=true;
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,4,5};
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					EqualorNot=false;
				}
			}
		}
		else
		{
			EqualorNot=false;
		}
		if(EqualorNot)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
	}

}
