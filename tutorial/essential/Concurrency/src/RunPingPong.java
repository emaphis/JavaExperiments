
/**
 *
 * @author emaph
 */
public class RunPingPong implements Runnable {

    private final String word;  //the sord to print
    private final int delay;  // how long to pause

    public RunPingPong(String whatToSay, int delayTime) {
        this.word = whatToSay;
        this.delay = delayTime;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.print(word + " ");
                Thread.sleep(delay);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        Runnable ping = new PingPong("Ping", 33);
        Runnable pong = new PingPong("PONG", 100);

        new Thread(ping).start();
        new Thread(pong).start();
    }
}
