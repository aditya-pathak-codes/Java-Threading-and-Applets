class Fibonacci
{
    int fibRecursive(int n)
    {
        if (n <= 1)
            return n;
        else
            return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    int fibNonRecursive(int n)
    {
        if (n <= 1)
            return n;

        int a = 0, b = 1, c = 0;

        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    void display(int n)
    {
        System.out.println("Recursive Fibonacci value: " + fibRecursive(n));
        System.out.println("Non-Recursive Fibonacci value: " + fibNonRecursive(n));
    }
}

public class Main
{
    public static void main(String args[])
    {
        Fibonacci f = new Fibonacci();

        int n = 10;

        f.display(n);
    }
}
