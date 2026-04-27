class Quadratic
{
    double a, b, c, r1, r2, d;

    void inputEquation(double x, double y, double z)
    {
        a = x;
        b = y;
        c = z;
    }

    void findRoots()
    {
        d = b * b - 4 * a * c;

        if (d >= 0)
        {
            r1 = (-b + Math.sqrt(d)) / (2 * a);
            r2 = (-b - Math.sqrt(d)) / (2 * a);
        }
    }

    void displayRoots()
    {
        if (d < 0)
        {
            System.out.println("No real roots");
        }
        else
        {
            System.out.println("Root 1 = " + r1);
            System.out.println("Root 2 = " + r2);
        }
    }
}

public class Main
{
    public static void main(String args[])
    {
        Quadratic q = new Quadratic();

        q.inputEquation(1, -5, 6);

        q.findRoots();

        q.displayRoots();
    }
}
