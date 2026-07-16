package chess;

import java.util.*;
import pieces.Piece;


/**
 * Represents a Chess Board. A container for chess pieces
 * @author emaph
 */
class ChessBoard {

    public List<Piece> rank1 = new ArrayList<Piece>();
    public List<Piece> rank2 = new ArrayList<Piece>();
    public List<Piece> rank3 = new ArrayList<Piece>();
    public List<Piece> rank4 = new ArrayList<Piece>();
    public List<Piece> rank5 = new ArrayList<Piece>();
    public List<Piece> rank6 = new ArrayList<Piece>();
    public List<Piece> rank7 = new ArrayList<Piece>();
    public List<Piece> rank8 = new ArrayList<Piece>();

    public ChessBoard() {
        //   initialize();
    }

    /**
     * Initialize the ChessBoard. Called by the constructor.
     */
    public void initialize() {
        Piece.resetCounters();
        fillRankWithPieces(rank1, Piece.Color.BLACK);
        fillRankWithPawn(rank2, 'P');
        fillRankWithPawn(rank3, '.');
        fillRankWithPawn(rank4, '.');
        fillRankWithPawn(rank5, '.');
        fillRankWithPawn(rank6, '.');
        fillRankWithPawn(rank7, 'p');
        fillRankWithPieces(rank8, Piece.Color.WHITE);
    }

    /**
     * Produces a String representing the passed rank. The char representation
     * determines the type of Piece.
     *
     * @param rank the rank to fill
     * @param representation the String representing the rank.
     */
    private void fillRankWithPawn(List<Piece> rank, char representation) {
        for (int i = 0; i < 8; i++) {
            Piece pawn;
            if (representation == 'p') {
                pawn = Piece.create(Piece.Color.WHITE, representation);
            } else if (representation == 'P') {
                pawn = Piece.create(Piece.Color.BLACK, representation);
            } else {
                pawn = Piece.create(Piece.Color.NONE, representation);
            }
            rank.add(pawn);
        }
    }

    private void fillRankWithPieces(List<Piece> rank, Piece.Color color) {
        rank.add(Piece.create(color, 'r'));
        rank.add(Piece.create(color, 'n'));
        rank.add(Piece.create(color, 'b'));
        rank.add(Piece.create(color, 'q'));
        rank.add(Piece.create(color, 'k'));
        rank.add(Piece.create(color, 'b'));
        rank.add(Piece.create(color, 'n'));
        rank.add(Piece.create(color, 'r'));
    }

    /**
     * @return number of Pieces add to ChessBoard.
     */
    int pieceCount() {
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
    private int countRank(List<Piece> rank) {
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
    public String getRankRepresentation(List<Piece> rank) {
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

    public String print() {
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
