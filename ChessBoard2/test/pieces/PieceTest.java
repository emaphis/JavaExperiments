package pieces;

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
public class PieceTest extends TestCase {

    public PieceTest(String testName) {
        super(testName);
    }


    public void testCreate() {
        Piece.resetCounters();

        Piece pawn1 = Piece.create(Piece.WHITE, 'p');
        assertEquals("white", pawn1.getColor());
        assertEquals('p', pawn1.getRepresentation());

        Piece pawn2 = Piece.create(Piece.BLACK, 'P');
        assertEquals("black", pawn2.getColor());
        assertEquals('P', pawn2.getRepresentation());

        Piece empty = Piece.create(Piece.EMPTY, '.');
        assertEquals("none", empty.getColor());
        assertEquals('.', empty.getRepresentation());

        assertEquals(1, Piece.getPieceCount(Piece.WHITE));
        assertEquals(1, Piece.getPieceCount(Piece.BLACK));
    }

    public void testColorPredicates() {
        Piece pawn1 = Piece.create(Piece.WHITE, 'p');
        Piece pawn2 = Piece.create(Piece.BLACK, 'P');
        Piece empty = Piece.create(Piece.EMPTY, '.');

        assertTrue(pawn1.isWhite());
        assertFalse(pawn2.isWhite());

        assertFalse(pawn1.isBlack());
        assertTrue(pawn2.isBlack());

        assertFalse(empty.isWhite());
        assertFalse(empty.isBlack());

    }
}
