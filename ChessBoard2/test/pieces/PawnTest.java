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

    Pawn pawnW = new Pawn(Pawn.WHITE, 'p');
    Pawn pawnB = new Pawn(Pawn.BLACK, 'P');

    public void testCreate() {

        Pawn pawn1 = new Pawn(Pawn.WHITE, 'p');
        assertEquals("white", pawn1.getColor());
        assertEquals('p', pawn1.getRepresentation());

        Pawn pawn2 = new Pawn(Pawn.BLACK, 'P');
        assertEquals("black", pawn2.getColor());
        assertEquals('P', pawn2.getRepresentation());

        Pawn empty = new Pawn(Pawn.EMPTY, '.');
        assertEquals("none", empty.getColor());
        assertEquals('.', empty.getRepresentation());
    }

    public void testCreateDefault() {
        Pawn pawn1 = new Pawn();
        assertEquals("white", pawn1.getColor());
        assertEquals('p', pawn1.getRepresentation());
    }

}
