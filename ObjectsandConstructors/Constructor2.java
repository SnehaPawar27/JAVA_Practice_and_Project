package ObjectsandConstructors;

public class Constructor2 {
	int l,b;
	Constructor2(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public static void main(String args[])
	{
		Constructor2 r=new Constructor2(10,20);
		System.out.println(r.l);
		System.out.println(r.b);
	}



}
