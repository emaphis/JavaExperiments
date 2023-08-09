
package threads.examples.lib;

public class CharacterEvent {
    public CharacterSource source;
    public int charater;

    public CharacterEvent(CharacterSource cs, int c) {
        this.source = cs;
        this.charater = c;
    }

}
