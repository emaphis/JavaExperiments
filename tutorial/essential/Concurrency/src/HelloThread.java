
public class HelloThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String[] args) {
        HelloThread runnable = new HelloThread();
        runnable.start();
    }
}
