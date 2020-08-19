package boards;

import java.util.Random;

public class Board {

    /**
     * Represents a board with a layout of: (col, row)
     * and a dimension of LEN * LEN = 9
     * <p>
     * (1, 3) (2, 3) (3, 3)
     * (1, 2) (2, 2) (3, 2)
     * (1, 1) (2, 1) (3, 1)
     * <p>
     * Iterate:
     * for (int row = LEN; row > 0; row--) {
     *     for (int col = 1; col <= LEN; col++) {
     *          cell = get(col, row);
     *      }
     * }
     */
    private final Cell[][] board;
    public static final int LEN = 3;
    private static final Random rand = new Random();

    //private static final char[] clear = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

    public Board() {
        this.board = new Cell[LEN][LEN];
        for (int row = LEN; row > 0; row--) {
            for (int col = 1; col <= LEN; col++) {
                put(new Cell(PieceType.NONE), col, row);
            }
        }
    }

    public Board(final char[] pieces) {
        this.board = new Cell[LEN][LEN];
        int count = 0;
        for (int row = LEN; row > 0; row--) {
            for (int col = 1; col <= LEN; col++) {
                char pieceName = pieces[count];
                PieceType type = getType(pieceName);
                put(new Cell(type), col, row);
                count++;
            }
        }
    }

    /** Convert char to PieceType */
    public final PieceType getType(char name) {
        switch (name) {
            case 'X':
                return PieceType.X;
            case 'O':
                return PieceType.O;
            case '_':
            case ' ':
            default:
                return PieceType.NONE;
        }
    }

    public final Cell get(int col, int row) {
        return board[LEN - row][col - 1];
    }

    public final void put(Cell cell, int col, int row) {
        board[LEN - row][col - 1] = cell;
    }

    public boolean isEmpty(int col, int row) {
        return get(col, row).isEmpty();
    }

    ////// Easy player.
    public int countEmpty() {
        int count = 0;
        for (int row = LEN; row > 0; row--) {
            for (int col = 1; col <= LEN; col++) {
                if (isEmpty(col, row)) {
                    count++;
                }
            }
        }
        return count;
    }

    public void playEasy(PieceType pieceType) {
        int numEmpty = countEmpty();
        int indx = rand.nextInt(numEmpty);
        int count = 0;

        // find the empty square to play, then play
        for (int row = LEN; row > 0; row--) {
            for (int col = 1; col <= LEN; col++) {
                if (isEmpty(col, row)) {
                    if (count == indx) {
                        put(new Cell(pieceType), col, row);
                        return;
                    }
                    count++;
                }
            }
        }
    }


    /// Medium player

    private void placeOnEmpty(PieceType pieceType, int col1, int row1, int col2, int row2, int col3, int row3) {
        if (get(col1, row1).isEmpty()) {
            put(new Cell(pieceType), col1, row1);
            return;
        }
        if (get(col2, row2).isEmpty()) {
            put(new Cell(pieceType), col2, row2);
            return;
        }
        if (get(col3, row3).isEmpty()) {
            put(new Cell(pieceType), col3, row3);
            return;
        }
    }

    public void playMedium(PieceType pieceType) {
        // rows
        if (countLine(pieceType, get(1, 3), get(2, 3), get(3, 3)) == 2) {
            placeOnEmpty(pieceType, 1, 3, 2, 3, 3, 3);
            return;
        }
        if (countLine(pieceType, get(1, 2), get(2, 2), get(3, 2)) == 2) {
            placeOnEmpty(pieceType, 1, 2, 2, 2, 3, 2);
            return;
        }
        if (countLine(pieceType, get(1, 1), get(2, 1), get(3, 1)) == 2) {
            placeOnEmpty(pieceType, 1, 1, 2, 1, 3, 1);
            return;
        }

        // columns
        if (countLine(pieceType, get(1, 3), get(1, 2), get(1, 1)) == 2) {
            placeOnEmpty(pieceType, 1, 3, 1, 2, 1, 1);
            return;
        }
        if (countLine(pieceType, get(2, 3), get(2, 2), get(2, 1)) == 2) {
            placeOnEmpty(pieceType, 2, 3, 2, 2, 2, 1);
            return;
        }
        if (countLine(pieceType, get(3, 3), get(3, 2), get(3, 1)) == 2) {
            placeOnEmpty(pieceType, 3, 3, 3, 2, 3, 1);
            return;
        }

        // diagonals
        if (countLine(pieceType, get(1, 3), get(2, 2), get(3, 1)) == 2) {
            placeOnEmpty(pieceType, 1, 3, 2, 2, 3, 1);
            return;
        }
        if (countLine(pieceType, get(1, 1), get(2, 2), get(3, 3)) == 2) {
            placeOnEmpty(pieceType, 1, 1, 2, 2, 3, 3);
            return;
        }

        // no combos available so play random
        playEasy(pieceType);
    }

    public void outputBoard() {
        System.out.println("---------");
        System.out.printf("| %c %c %c |\n", get(1, 3).getPiece(), get(2, 3).getPiece(), get(3, 3).getPiece());
        System.out.printf("| %c %c %c |\n", get(1, 2).getPiece(), get(2, 2).getPiece(), get(3, 2).getPiece());
        System.out.printf("| %c %c %c |\n", get(1, 1).getPiece(), get(2, 1).getPiece(), get(3, 1).getPiece());
        System.out.println("---------");
    }


    public GameState evaluateBoard() {
        boolean xWins = wins(PieceType.X);
        boolean oWins = wins(PieceType.O);

        if (xWins && oWins) {
            return GameState.IMPOSSIBLE;
        }

        if (xWins) {
            return GameState.XWINS;
        }

        if (oWins) {
            return GameState.OWINS;
        }

        int numX = countPiece(PieceType.X);
        int numO = countPiece(PieceType.O);

        if (!(numX == numO + 1 || numO == numX + 1 || numX == numO)) {
            return GameState.IMPOSSIBLE;
        }

        if (numX + numO == LEN * LEN) {
            return GameState.SCRATCH;
        }

        return GameState.NOTFINISHED;
    }

    /** count pieces in a line
       A line is a row, column or diagonal  */
    public int countLine(PieceType piece, Cell cell1, Cell cell2, Cell cell3) {
        int count = 0;
        if (cell1.isType(piece)) {
            count++;
        }
        if (cell2.isType(piece)) {
            count++;
        }
        if (cell3.isType(piece)) {
            count++;
        }
        return count;
    }


    public boolean wins(PieceType piece) {
        // rows
        if (countLine(piece, get(1, 3), get(2, 3), get(3, 3)) == 3) { return true; }
        if (countLine(piece, get(1, 2), get(2, 2), get(3, 2)) == 3) { return true; }
        if (countLine(piece, get(1, 1), get(2, 1), get(3, 1)) == 3) { return true; }

        // columns
        if (countLine(piece, get(1, 3), get(1, 2), get(1, 1)) == 3) { return true; }
        if (countLine(piece, get(2, 3), get(2, 2), get(2, 1)) == 3) { return true; }
        if (countLine(piece, get(3, 3), get(3, 2), get(3, 1)) == 3) { return true; }

        // diagonals
        if (countLine(piece, get(1, 3), get(2, 2), get(3, 1)) == 3) { return true; }
        if (countLine(piece, get(1, 1), get(2, 2), get(3, 3)) == 3) { return true; }

        return false;
    }

    //// following use board's raw format

    public int countPiece(PieceType pieceType) {
        int count = 0;
        for (int i = 0; i < LEN; i++) {
            for (int j = 0; j < LEN; j++) {
                if (board[i][j].isType(pieceType)) {
                    count++;
                }
            }
        }
        return count;
    }

}
