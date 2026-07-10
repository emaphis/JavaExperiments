package pieces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import pieces.Pawn;
import junit.framework.TestCase;

/**
 *
 * @author emaph
 */
public class PawnTest extends TestCase {

    public PawnTest(String testName) {
        super(testName);
    }

    public void testCreate() {

        Pawn pawn1 = new Pawn(Pawn.WHITE);
        assertEquals("white", pawn1.getColor());

        Pawn pawn2 = new Pawn(Pawn.BLACK);
        assertEquals("black", pawn2.getColor());
    }

    public void testCreateDefualt() {
        Pawn pawn1 = new Pawn();
        assertEquals("white", pawn1.getColor());
    }

}
