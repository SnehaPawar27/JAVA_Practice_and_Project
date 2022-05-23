package ObjectsandConstructors;

class Test1 {
   public int l,b;
	Test1(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	void Area()
	{
		System.out.println("Area:"+(l*b));
	}
	
}
 public class Test
{
	public static void main(String args[])
	{
		Test1 r=new Test1(10,20);
		System.out.println(r.l);
		System.out.println(r.b);
	}
}

