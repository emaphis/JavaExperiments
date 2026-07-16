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

        Piece pawn1 = Piece.create(Piece.Color.WHITE, 'p');
        assertEquals(Piece.Color.WHITE, pawn1.getColor());
        assertEquals('p', pawn1.getRepresentation());

        Piece pawn2 = Piece.create(Piece.Color.BLACK, 'P');
        assertEquals(Piece.Color.BLACK, pawn2.getColor());
        assertEquals('P', pawn2.getRepresentation());

        Piece empty = Piece.create(Piece.Color.NONE, '.');
        assertEquals(Piece.Color.NONE, empty.getColor());
        assertEquals('.', empty.getRepresentation());

        assertEquals(1, Piece.getPieceCount(Piece.Color.WHITE));
        assertEquals(1, Piece.getPieceCount(Piece.Color.BLACK));
    }

    public void testColorPredicates() {
        Piece pawn1 = Piece.create(Piece.Color.WHITE, 'p');
        Piece pawn2 = Piece.create(Piece.Color.BLACK, 'P');
        Piece empty = Piece.create(Piece.Color.NONE, '.');

        assertTrue(pawn1.isWhite());
        assertFalse(pawn2.isWhite());

        assertFalse(pawn1.isBlack());
        assertTrue(pawn2.isBlack());

        assertFalse(empty.isWhite());
        assertFalse(empty.isBlack());

    }
}
