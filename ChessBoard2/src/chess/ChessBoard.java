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
        fillRankWithPawn(rank2, Piece.Color.BLACK);
        fillRankWithPawn(rank3, Piece.Color.NONE);
        fillRankWithPawn(rank4, Piece.Color.NONE);
        fillRankWithPawn(rank5, Piece.Color.NONE);
        fillRankWithPawn(rank6, Piece.Color.NONE);
        fillRankWithPawn(rank7, Piece.Color.WHITE);
        fillRankWithPieces(rank8, Piece.Color.WHITE);
    }

    /**
     * Produces a String representing the passed rank. The char representation
     * determines the type of Piece.
     *
     * @param rank the rank to fill
     * @param representation the String representing the rank.
     */
    private void fillRankWithPawn(List<Piece> rank, Piece.Color color) {
        for (int i = 0; i < 8; i++) {
            Piece pawn;
            if (color == Piece.Color.WHITE) {
                pawn = Piece.create(Piece.Color.WHITE, Piece.Type.PAWN);
            } else if (color == Piece.Color.BLACK) {
                pawn = Piece.create(Piece.Color.BLACK, Piece.Type.PAWN);
            } else {
                pawn = Piece.create(Piece.Color.NONE, Piece.Type.NO_PIECE);
            }
            rank.add(pawn);
        }
    }

    private void fillRankWithPieces(List<Piece> rank, Piece.Color color) {
        rank.add(Piece.create(color, Piece.Type.ROOK));
        rank.add(Piece.create(color, Piece.Type.KNIGHT));
        rank.add(Piece.create(color, Piece.Type.BISHOP));
        rank.add(Piece.create(color, Piece.Type.QUEEN));
        rank.add(Piece.create(color, Piece.Type.KING));
        rank.add(Piece.create(color, Piece.Type.BISHOP));
        rank.add(Piece.create(color, Piece.Type.KNIGHT));
        rank.add(Piece.create(color, Piece.Type.ROOK));
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
            if (piece.getColor() != Piece.Color.NONE) {
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
