
import java.util.ArrayList;


/**
 * Represents a chess Board
 * @author emaph
 */
class Board {
    private ArrayList<Pawn> pieces = new ArrayList<Pawn>();

    /**
     * Add passed Pawn to Board.
     * @param pawn add to board
     */
    void addPiece(Pawn pawn) {
        pieces.add(pawn);
    }

    /**
     * @return number of Pawn contained by Board
     */
    int getNumberPieces() {
        return pieces.size();
    }

    /**
     * @param index of Pawn
     * @return Pawn at index.
     */
    Pawn getPiece(int index) {
        return pieces.get(index);
    }

}
