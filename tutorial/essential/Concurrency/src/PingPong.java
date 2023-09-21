
/**
 *
 * @author emaph
 */
public class PingPong extends Thread {

    private String word;  //the sord to print
    private int delay;  // how long to pause

    public PingPong(String whatToSay, int delayTime) {
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
        new PingPong("Ping", 33).start();
        new PingPong("PONG", 100).start();
    }
}
