package chess;

import java.util.ArrayList;
import pieces.Piece;


/**
 * Represents a Chess Board. A container for chess pieces
 * @author emaph
 */
class ChessBoard {

    public ArrayList<Piece> rank1 = new ArrayList<Piece>();
    public ArrayList<Piece> rank2 = new ArrayList<Piece>();
    public ArrayList<Piece> rank3 = new ArrayList<Piece>();
    public ArrayList<Piece> rank4 = new ArrayList<Piece>();
    public ArrayList<Piece> rank5 = new ArrayList<Piece>();
    public ArrayList<Piece> rank6 = new ArrayList<Piece>();
    public ArrayList<Piece> rank7 = new ArrayList<Piece>();
    public ArrayList<Piece> rank8 = new ArrayList<Piece>();

    public ChessBoard() {
        initialize();
    }

    /**
     * Initialize the ChessBoard. Called by the constructor.
     */
    private void initialize() {
        fillRankWithPawn(rank1, '.');
        fillRankWithPawn(rank2, 'p');
        fillRankWithPawn(rank3, '.');
        fillRankWithPawn(rank4, '.');
        fillRankWithPawn(rank5, '.');
        fillRankWithPawn(rank6, '.');
        fillRankWithPawn(rank7, 'P');
        fillRankWithPawn(rank8, '.');
    }

    /**
     * Produces a String representing the passed rank. The char representation
     * determines the type of Piece.
     *
     * @param rank the rank to fill
     * @param representation the String representing the rank.
     */
    private void fillRankWithPawn(ArrayList<Piece> rank, char representation) {
        for (int i = 0; i < 8; i++) {
            Piece pawn;
            if (representation == 'p') {
                pawn = Piece.create(Piece.WHITE, representation);
            } else if (representation == 'P') {
                pawn = Piece.create(Piece.BLACK, representation);
            } else {
                pawn = Piece.create(Piece.EMPTY, representation);
            }
            rank.add(pawn);
        }
    }

    /**
     * @return number of Pieces add to ChessBoard.
     */
    int getNumPieces() {
        int size = countRank(rank1)
                + countRank(rank2)
                + countRank(rank3)
                + countRank(rank4)
                + countRank(rank5)
                + countRank(rank6)
                + countRank(rank7)
                + countRank(rank8);
        return size;
    }

    /**
     * Count the pieces in the rank. Basically count all pieces without the '.'
     * representation.s
     *
     * @param rank to count
     * @return the count of Pieces in the rank.
     */
    private int countRank(ArrayList<Piece> rank) {
        int count = 0;
        for (Piece piece : rank) {
            if (piece.getRepresentation() != '.') {
                count++;
            }
        }
        return count;
    }

    /**
     * Produce a representation given a rank.
     *
     * @param rank to represent.
     * @return the String representing the rank.
     */
    public String getRankRepresentation(ArrayList<Piece> rank) {
        if (rank.size() > 0) {
            StringBuilder buffer = new StringBuilder();
            for (Piece pawn : rank) {
                buffer.append(pawn.getRepresentation());
            }
            return buffer.toString();
        } else {
            return "........";
        }
    }

    public String getBoardRepresentation() {
        StringBuilder buffer = new StringBuilder();
        buffer.append(getRankRepresentation(rank1));
        buffer.append('\n');
        buffer.append(getRankRepresentation(rank2));
        buffer.append('\n');
        buffer.append(getRankRepresentation(rank3));
        buffer.append('\n');
        buffer.append(getRankRepresentation(rank4));
        buffer.append('\n');
        buffer.append(getRankRepresentation(rank5));
        buffer.append('\n');
        buffer.append(getRankRepresentation(rank6));
        buffer.append('\n');
        buffer.append(getRankRepresentation(rank7));
        buffer.append('\n');
        buffer.append(getRankRepresentation(rank8));
        buffer.append('\n');
        return buffer.toString();
    }
}
