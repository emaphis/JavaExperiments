
import java.util.ArrayList;


/**
 * Represents a Chess Board in the Application
 * @author emaph
 */
public class ChessBoard {
    
    ArrayList pawnList = new ArrayList();

    int getNumberOfPieces() {
        return pawnList.size();
    }

   void addPawn(Pawn pawn) {
       pawnList.add(pawn);
   }
}    

