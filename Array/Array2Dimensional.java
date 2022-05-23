package Array;

public class Array2Dimensional {
	public static void main(String args[])
	{
		int a[][]=new int[10][10];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		a[2][0]=7;
		a[2][1]=8;
		a[2][2]=9;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		int b[][]= {{1,2,3},{1,2,3},{1,2,3}};
		System.out.println(b[0][0]);
		System.out.println(b[1][0]);
		System.out.println(b[2][0]);
		int c[][]=new int[3][];
		c[0]=new int[3];
		c[0][0]=1;
		c[0][1]=2;
		c[0][2]=3;
		System.out.println(c[0][0]);
		System.out.println(c[0][1]);
		System.out.println(c[0][2]);
	}

}
