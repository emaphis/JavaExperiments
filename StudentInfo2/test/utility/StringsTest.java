
package utility;

import junit.framework.TestCase;

/**
 * Tests of String functionality
 *
  * @author emaph
 */
public class StringsTest extends TestCase {

    public StringsTest(String testName) {
        super(testName);
    }

    public void testChars() {
        char capitalA = 'A';
        assertEquals(65, capitalA);
        assertEquals('\u0041', capitalA); // unicode
        assertEquals('\101', capitalA); // octal
    }

    public void testStrings() {
        String a = "abc";
        //String b = new String("abc");  // akward

        assertEquals("abcd", "ab".concat("cd"));  // concatenation
        assertEquals("abcdef", "abc" + "def");
        assertEquals("123456", "12" + "3" + "456");
    }

    public void testWhitespace() {
        assertTrue(Character.isWhitespace(' '));
        assertTrue(Character.isWhitespace('\t'));
        assertTrue(Character.isWhitespace('\n'));
        assertTrue(Character.isWhitespace('\r'));

        assertFalse(Character.isWhitespace('a'));
        assertFalse(Character.isWhitespace('A'));
        assertFalse(Character.isWhitespace('1'));
        assertFalse(Character.isWhitespace('.'));
    }

    public void testIdentifiers() {
        assertTrue(Character.isJavaIdentifierPart('a'));
        assertTrue(Character.isJavaIdentifierPart('$'));
        assertTrue(Character.isJavaIdentifierPart('2'));
        assertFalse(Character.isJavaIdentifierPart('^'));
        assertFalse(Character.isJavaIdentifierPart('*'));
    }

    //public void testStringBuilder() {
    //}
}
