abstract class MyArea
{
    abstract void area();
}

class SQArea extends MyArea
{
    double s;

    void area()
    {
        s = 10.0;
        double areasq = s * s;
        System.out.println("Area of Square " + areasq);
    }
}

class RECTArea extends MyArea
{
    double l, b;

    void area()
    {
        l = 10.0;
        b = 2.0;
        double arearect = l * b;
        System.out.println("Area of Rectangle " + arearect);
    }
}

public class Main
{
    public static void main(String a[])
    {

        MyArea sa = new SQArea();  
        sa.area();

        MyArea ra = new RECTArea(); 
        ra.area();
    }
}
