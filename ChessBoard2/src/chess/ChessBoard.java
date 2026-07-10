package chess;

import java.util.ArrayList;
import pieces.Pawn;


/**
 * Represents a Chess Board. A container for chess pieces
 * @author emaph
 */
class ChessBoard {
    private ArrayList<Pawn> pawns = new ArrayList<Pawn>();

    public ChessBoard() {
    }

    /**
     * @return number of Pawns add to ChessBoard.
     */
    int getNumPieces() {
        return pawns.size();
    }

    /**
     * Adds a
     * @param pawn Pawn added to the ChessBoard
     */
    void addPawn(Pawn pawn) {
        pawns.add(pawn);
    }

    /**
     * @return The list of Pawns added to  ChessBoard.
     */
    ArrayList<Pawn> getPawnList() {
        return pawns;
    }

}
