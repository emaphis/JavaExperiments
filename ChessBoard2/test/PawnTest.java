/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;

/**
 *
 * @author emaph
 */
public class PawnTest extends TestCase {
    private final String WHITE = "white";
    private final String BLACK = "black";

    public PawnTest(String testName) {
        super(testName);
    }
    
    public void testCreate() {
        
        Pawn pawn1 = new Pawn(WHITE);
        assertEquals("white", pawn1.getColor());
        
        Pawn pawn2 = new Pawn(BLACK);
        assertEquals("black", pawn2.getColor());
    }
    
}
