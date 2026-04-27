class MessageRunnable implements Runnable {
    private String message;
    private int delay;

    MessageRunnable(String message, int delay) {
        this.message = message;
        this.delay = delay;
    }

    public void run() {
        try {
            for (int i = 1; i <= 2; i++) {   // run only 5 times
                System.out.println(message);
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MessageRunnable("GOOD MORNING", 1000));
        Thread t2 = new Thread(new MessageRunnable("HELLO", 2000));
        Thread t3 = new Thread(new MessageRunnable("WELCOME", 3000));

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
