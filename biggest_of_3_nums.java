class Largest {
    int num1, num2, num3, res;

    void inputData(int a, int b, int c) {
        num1 = a;
	num2 = b;
        num3 = c;
    }

    void findLargest() {
        res = num1;
        if (num2 > res) {
            res = num2;
        }
        if (num3 > res) {
            res = num3;
        }
    }

    void displayLargest() {
        System.out.println("The largest number is: " + res);
    }
}
public class Main {
    public static void main(String[] args) {
        Largest obj = new Largest();
        obj.inputData(10, 25, 15);
        obj.findLargest();
        obj.displayLargest();
    }}
