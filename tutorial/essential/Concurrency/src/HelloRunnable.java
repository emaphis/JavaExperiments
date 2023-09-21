
public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("hello from a thread!");
    }

    public static void main(String[] args) {
        Thread runnable = new Thread(new HelloRunnable());
        runnable.start();
    }
}
