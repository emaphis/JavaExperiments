
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

    public void testIdentifierPart() {
        assertEquals(true, Character.isJavaIdentifierPart('a'));
        assertEquals(true, Character.isJavaIdentifierPart('A'));
        assertEquals(true, Character.isJavaIdentifierPart('$'));
        assertEquals(true, Character.isJavaIdentifierPart('1'));
        assertEquals(true, Character.isJavaIdentifierPart('_'));

        assertEquals(false, Character.isJavaIdentifierPart('@'));
    }

}
