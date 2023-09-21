


/**
 * Listing 1-4. Demonstrating Thread Sleep
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

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println("interrupt = " + ex.getLocalizedMessage());
        }

        thdA.interrupt();
        thdB.interrupt();
    }
}
