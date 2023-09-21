/*
    Write an IntSleep application that creates a background thread
    to repeatedly output Hello and then sleep for 100 milliseconds.
    After sleeping for 2 seconds, the default main thread should
    interrupt the background thread, which should break out of the
    loop after outputting interrupted.
 */

/**
 * Listing 1-4. Demonstrating Thread Sleep
 *
 * @author emaph
 */
public class IntSleep {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //int count = 0;
        Runnable r = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        System.out.println("Hello... ");
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        System.out.println("interrupted");
                        break;
                    }
                }
            }
        };

        Thread t = new Thread(r);

        t.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println("interrupt = " + ex.getLocalizedMessage());
        }

        t.interrupt();
    }
}
