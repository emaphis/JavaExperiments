
package threads.examples.lib;

import java.util.*;

public class CharacterEventHandler {
    private final Vector<CharacterListener> listeners = new Vector<>();

    public void addCharacterListener(CharacterListener cl) {
        listeners.add(cl);
    }

    public void removeCharacterListener(CharacterListener cl) {
        listeners.remove(cl);
    }

    public void fireNewCharacter(CharacterSource source, int c) {
        CharacterEvent ce = new CharacterEvent(source, c);
        CharacterListener[] cl = listeners.toArray(new CharacterListener[0]);
        for (int i = 0; i < cl.length; i++) {
            cl[i].newCharacter(ce);
        }
    }
}
