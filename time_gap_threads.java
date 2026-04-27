class GoodMorning extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 1; i++) {
                System.out.println("GOOD MORNING");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Hello extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 1; i++) {
                System.out.println("HELLO");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Welcome extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 1; i++) {
                System.out.println("WELCOME");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        GoodMorning t1 = new GoodMorning();
        Hello t2 = new Hello();
        Welcome t3 = new Welcome();

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Program Finished");
    }
}
