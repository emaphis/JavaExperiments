package boards;

import java.util.Random;

public class Board {

    /**
     * Represents a board with a layout of: (col, row)
     * and a dimension of LEN * LEN = 9
     * (1, 3) (2, 3) (3, 3)
     * (1, 2) (2, 2) (3, 2)
     * (1, 1) (2, 1) (3, 1)
     *
     * Iterate:
     * for (int row = LEN; row > 0; row--) {
     *     for (int col = 1; col <= LEN; col++) {
     *          cell = get(col, row);
     *      }
     * }
     */
    private final Piece[][] board;
    public static final int LEN = 3;
    private static final Random rand = new Random();

    private static final char[] clear = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

    public Board() {
        this(clear);
    }

    public Board(final char[] pieces) {
        board = new Piece[LEN][LEN];
        int count = 0;
        for (int row = LEN; row > 0; row--) {
            for (int col = 1; col <= LEN; col++) {
                char pieceName = pieces[count];
                Piece piece = createPiece(pieceName);
                put(piece, col, row);
                count++;
            }
        }
    }

    /** Convert char to Piece */
    public final Piece createPiece(char name) {
        switch (name) {
            case 'X':
                return Piece.X;
            case 'O':
                return Piece.O;
            case '_':
            case ' ':
            default:
                return Piece.NONE;
        }
    }

    public final Piece get(int col, int row) {
        return board[LEN - row][col - 1];
    }

    public final void put(Piece piece, int col, int row) {
        board[LEN - row][col - 1] = piece;
    }

    public boolean isEmpty(int col, int row) {
        return get(col, row) == Piece.NONE;
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

    public void playEasy(Piece piece) {
        int numEmpty = countEmpty();
        int indx = rand.nextInt(numEmpty);
        int count = 0;

        // find the empty square to play, then play
        for (int row = LEN; row > 0; row--) {
            for (int col = 1; col <= LEN; col++) {
                if (isEmpty(col, row)) {
                    if (count == indx) {
                        put(piece, col, row);
                        return;
                    }
                    count++;
                }
            }
        }
    }


    /// Medium player

    private void placeOnEmpty(Piece piece, int col1, int row1, int col2, int row2, int col3, int row3) {
        int count = 0;
        if (get(col1, row1) == Piece.NONE) {
            put(piece, col1, row1);
            return;
        }
        if (get(col2, row2) == Piece.NONE) {
            put(piece, col2, row2);
            return;
        }
        if (get(col3, row3) == Piece.NONE) {
            put(piece, col3, row3);
            return;
        }
    }

    public void playMedium(Piece piece) {
        // rows
        if (countLine(piece, get(1, 3), get(2, 3), get(3, 3)) == 2) {
            placeOnEmpty(piece, 1, 3, 2, 3, 3, 3);
            return;
        }
        if (countLine(piece, get(1, 2), get(2, 2), get(3, 2)) == 2) {
            placeOnEmpty(piece, 1, 2, 2, 2, 3, 2);
            return;
        }
        if (countLine(piece, get(1, 1), get(2, 1), get(3, 1)) == 2) {
            placeOnEmpty(piece, 1, 1, 2, 1, 3, 1);
            return;
        }

        // columns
        if (countLine(piece, get(1, 3), get(1, 2), get(1, 1)) == 2) {
            placeOnEmpty(piece, 1, 3, 1, 2, 1, 1);
            return;
        }
        if (countLine(piece, get(2, 3), get(2, 2), get(2, 1)) == 2) {
            placeOnEmpty(piece, 2, 3, 2, 2, 2, 1);
            return;
        }
        if (countLine(piece, get(3, 3), get(3, 2), get(3, 1)) == 2) {
            placeOnEmpty(piece, 3, 3, 3, 2, 3, 1);
            return;
        }

        // diagonals
        if (countLine(piece, get(1, 3), get(2, 2), get(3, 1)) == 2) {
            placeOnEmpty(piece, 1, 3, 2, 2, 3, 1);
            return;
        }
        if (countLine(piece, get(1, 1), get(2, 2), get(3, 3)) == 2) {
            placeOnEmpty(piece, 1, 1, 2, 2, 3, 3);
            return;
        }

        // no combos available so play random
        playEasy(piece);
    }

    public void outputBoard() {
        System.out.println("---------");
        System.out.printf("| %c %c %c |\n", get(1, 3).getPiece(), get(2, 3).getPiece(), get(3, 3).getPiece());
        System.out.printf("| %c %c %c |\n", get(1, 2).getPiece(), get(2, 2).getPiece(), get(3, 2).getPiece());
        System.out.printf("| %c %c %c |\n", get(1, 1).getPiece(), get(2, 1).getPiece(), get(3, 1).getPiece());
        System.out.println("---------");
    }


    public GameState evaluateBoard() {
        boolean xWins = wins(Piece.X);
        boolean oWins = wins(Piece.O);

        if (xWins && oWins) {
            return GameState.IMPOSSIBLE;
        }

        if (xWins) {
            return GameState.XWINS;
        }

        if (oWins) {
            return GameState.OWINS;
        }

        int numX = countPiece(Piece.X);
        int numO = countPiece(Piece.O);

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
    public int countLine(Piece piece, Piece piece1, Piece piece2, Piece piece3) {
        int count = 0;
        if (piece == piece1) {
            count++;
        }
        if (piece == piece2) {
            count++;
        }
        if (piece == piece3) {
            count++;
        }
        return count;
    }


    public boolean wins(Piece piece) {
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

    public int countPiece(Piece piece) {
        int num = 0;
        for (int i = 0; i < LEN; i++) {
            for (int j = 0; j < LEN; j++) {
                if (board[i][j] == piece) {
                    num++;
                }
            }
        }
        return num;
    }

}
