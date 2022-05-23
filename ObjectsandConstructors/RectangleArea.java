package ObjectsandConstructors;

public class RectangleArea {
	int l=20,b=10;
	int Area()
	{
		int a=l*b;
		return a;
	}
	public static void main(String args[])
	{
		RectangleArea r=new RectangleArea();
		int area=r.Area();
		System.out.println("Area of rectangle is:"+area);
	}

}
