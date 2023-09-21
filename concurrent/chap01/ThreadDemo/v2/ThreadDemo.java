
/**
 * Listing 1-2. Demonstrating Thread Interruption
 * @author emaph
 */
public class ThreadDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                int count = 0;
                while (!Thread.interrupted()) {
                    System.out.println(name +": " + count++);
                }
            }
        };

        Thread thdA = new Thread(r);
        Thread thdB = new Thread(r);

        thdA.start();
        thdB.start();

        int count = 0;
        String name = Thread.currentThread().getName();

        while (true) {
            double n = Math.random();
            if (n >= 0.49999999 && n <= 0.50000001)
                break;
            System.out.println(name +": " + count++);
            if (count > 1500) {
                Thread.currentThread().interrupt();
                break;
            }
        }

        thdA.interrupt();
        thdB.interrupt();
    }
}
