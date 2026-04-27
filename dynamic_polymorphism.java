class MyArea
{
	void area()
	{
		System.out.println("A concrete function called Area()");
	}
}
class SQArea extends MyArea
{
	double s;
	void area() {
		double areasq;
		s=10.0;
		areasq=s*s;
		System.out.println("Area of Square " + areasq);
	}
}
class RECTArea extends MyArea
{
	double l,b;
	void area() {
		double arearect;
		l=10.0;
		b=2.0;
		arearect=l*b;
		System.out.println("Area of Rectangle " + arearect);
	}
}

public class Main
{
	public static void main(String a[])
	{
		MyArea ma;
		ma=new SQArea();
		ma.area();
		ma=new RECTArea();
		ma.area();

	}
}
