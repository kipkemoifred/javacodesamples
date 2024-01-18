package tutorials.threads;

public class ThreadExample extends Thread{
    public static int amount = 0;
    @Override
    public void run() {
        super.run();
        System.out.println("This code is running in a thread");
        amount++;
    }

    public static void main(String[] args) {
        ThreadExample thread = new ThreadExample();
        thread.start();
        System.out.println("This code is outside of the thread");

        // Wait for the thread to finish
        while(thread.isAlive()) {
            System.out.println("Waiting...");
        }
        System.out.println(amount);
        amount++;
        System.out.println(amount);


        ThreadInterface obj = new ThreadInterface();
        Thread threadI = new Thread(obj);
        threadI.start();
        System.out.println("Runnable example");
    }
}

 class ThreadInterface implements Runnable {
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
