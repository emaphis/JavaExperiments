
import java.util.ArrayList;


/**
 * Represents a chess Board
 * @author emaph
 */
class Board {
    private ArrayList<Pawn> pieces = new ArrayList<Pawn>();

    int getNumberPieces() {
        return pieces.size();
    }

    void addPiece(Pawn pawn) {
        pieces.add(pawn);
    }

    Pawn getPiece(int index) {
        return pieces.get(index);
    }

}
