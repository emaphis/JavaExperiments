
package threads.examples.ch02.example2;

import java.util.Random;
import threads.examples.lib.*;


public class RandomCharacterGenerator extends Thread implements CharacterSource {
    static char[] chars;
    static String charArray = "abcdefghijklmnopqrstuvwxyz0123456789";
    static {
        chars = charArray.toCharArray();
    }

    Random random;
    CharacterEventHandler handler;

    public RandomCharacterGenerator() {
        this.random = new Random();
        this.handler = new CharacterEventHandler();
    }

    public int getPauseTime() {
        return (int) (Math.max(1000, 5000 * random.nextDouble()));
    }

    public void addCharacterListener(CharacterListener cl) {
        handler.addCharacterListener(cl);
    }

    public void removeCharacterListener(CharacterListener cl) {
        handler.removeCharacterListener(cl);
    }

    public void nextCharacter() {
        handler.fireNewCharacter(this,
                (int) chars[random.nextInt(chars.length)]);
    }

    @Override
    public void run() {
        while (true) {
            nextCharacter();
            try {
                Thread.sleep(getPauseTime());
            } catch (InterruptedException ex) {
                return;
            }
        }
    }
}
