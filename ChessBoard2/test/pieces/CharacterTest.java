
package pieces;

import junit.framework.TestCase;

/**
 * Unit test white space recognition
 * @author emaph
 */
public class CharacterTest extends TestCase {

    public void testWhiteSpace() {
        assertEquals(true, Character.isWhitespace('\n'));
        assertEquals(true, Character.isWhitespace('\t'));
        assertEquals(true, Character.isWhitespace(' '));
        assertEquals(true, Character.isWhitespace('\f'));
        assertEquals(true, Character.isWhitespace('\r'));
    }

}
