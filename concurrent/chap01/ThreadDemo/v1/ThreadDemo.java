
/**
 *  Listing 1-1. Demonstrating Thread Fundamentals
 * @author emaph
 */
public class ThreadDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        boolean isDeamon = args.length != 0;
        Runnable r = new Runnable() {
            @Override
            public void run() {
                Thread thd = Thread.currentThread();
                while (true) {
                    System.out.printf("%s is %salive and in state%n",
                            thd.getName(),
                            thd.isAlive() ?  "" : "not ",
                            thd.getState());
                }
            }
        };

        Thread t1 = new Thread(r, "thd1");
        if (isDeamon)
            t1.setDaemon(true);
        System.out.printf("%s is %salive and in %s state%n",
                t1.getName(), t1.isAlive() ? "" : "not ", t1.getState());

        Thread t2 = new Thread(r);
        t2.setName("thd2");
        if (isDeamon)
            t2.setDaemon(true);

        System.out.printf("%s is %salive and in %s state%n",
                t2.getName(), t2.isAlive() ? "" : "not ", t2.getState());

        //t1.start();
        //t2.start();
    }
}
