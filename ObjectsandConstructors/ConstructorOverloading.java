package ObjectsandConstructors;

public class ConstructorOverloading {
	ConstructorOverloading()
	{
		this(10);
		System.out.println("Empty Constructor");
		System.out.println();
	}
	
	ConstructorOverloading(int x,int y)
	{
		this();
		System.out.println("Area of R1: "+(x*y));
		System.out.println();
	}
	ConstructorOverloading(int x,double y)
	{
		this(10.20,20.10);
		System.out.println("Area of R2: "+(x*y));
		System.out.println();
	}
	ConstructorOverloading(float x,int y)
	{
		this(10,10.20);
		System.out.println("Area of R3: "+(x*y));
		System.out.println();
	}
	ConstructorOverloading(int x)
	{
		System.out.println("Area of R4: "+(x*x));
		System.out.println();
	}
	ConstructorOverloading(double x,double y)
	{
		this();
		System.out.println("Area of R5: "+(x*y));
		System.out.println();
	}
	public static void main(String args[]) 
	{
		ConstructorOverloading r=new ConstructorOverloading();
		ConstructorOverloading r1=new ConstructorOverloading(10,20);
		ConstructorOverloading r2=new ConstructorOverloading(10,20.00);
		ConstructorOverloading r3=new ConstructorOverloading(10.00,20);
		ConstructorOverloading r4=new ConstructorOverloading(10);
		ConstructorOverloading r5=new ConstructorOverloading(10.1234,20.1234);
		ConstructorOverloading r6=new ConstructorOverloading(10.9876,20.9876);
	}

}
