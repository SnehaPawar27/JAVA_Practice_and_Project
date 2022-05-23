package ObjectsandConstructors;

public class Constructor1 {
	int l,b;
	Constructor1()
	{
		l=10;
		b=20;
	}
	public static void main(String args[])
	{
		Constructor1 r=new Constructor1();
		System.out.println(r.l);
		System.out.println(r.b);
	}

}
