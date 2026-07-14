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

    Piece pawnW = Piece.create(Piece.WHITE, 'p');
    Piece pawnB = Piece.create(Piece.BLACK, 'P');

    public void testCreate() {

        Piece pawn1 = Piece.create(Piece.WHITE, 'p');
        assertEquals("white", pawn1.getColor());
        assertEquals('p', pawn1.getRepresentation());

        Piece pawn2 = Piece.create(Piece.BLACK, 'P');
        assertEquals("black", pawn2.getColor());
        assertEquals('P', pawn2.getRepresentation());

        Piece empty = Piece.create(Piece.EMPTY, '.');
        assertEquals("none", empty.getColor());
        assertEquals('.', empty.getRepresentation());
    }


}
