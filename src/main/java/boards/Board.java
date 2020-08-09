package boards;


public class Board {

    /**
    * Represents a board with a layout of: (col, row)
    * and a dimension of LEN * LEN == 9.
    * (1, 3) (2, 3) (3, 3)
    * (1, 2) (2, 2) (3, 2)
    * (1, 1) (2, 1) (3, 1)
    *
    * Iterate:
    *  for (int row = LEN; row > 0; row--) {
    *      for (int col = 1; col <= LEN; col++) {
    *          cell = get(col, row);
    *      }
    *  }
    */
    private final Piece[][] board;
    public static final int LEN = 3;

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

    //** Convert char to Piece */
    public final Piece createPiece(char name) {
        switch (name) {
            case '_':
            case ' ':
                return Piece.NONE;
            case 'X':
                return Piece.X;
            case 'O':
                return Piece.O;
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

    public boolean empty(int col, int row) {
        return get(col, row) == Piece.NONE;
    }

    // Overly complete
    public Piece switchPiece(Piece piece) {
        switch (piece) {
            case NONE:  // X should always be first
                return Piece.X;
            case X:
                return Piece.O;
            case O:
                return Piece.X;
            default:
                return Piece.X;
        }
    }

    public void out() {
        Piece cell;
        for (int row = LEN; row > 0; row--) {
            for (int col = 1; col <= LEN; col++) {
                cell = get(col, row);
                System.out.print(cell.getPiece() + " ");
            }
            System.out.println();
        }
    }

    public void outputBoard() {
        System.out.println();
        System.out.println("---------");
        System.out.printf("| %c %c %c |\n", get(1, 3).getPiece(), get(2, 3).getPiece(), get(3, 3).getPiece());
        System.out.printf("| %c %c %c |\n", get(1, 2).getPiece(), get(2, 2).getPiece(), get(3, 2).getPiece());
        System.out.printf("| %c %c %c |\n", get(1, 1).getPiece(), get(2, 1).getPiece(), get(3, 1).getPiece());
        System.out.println("---------");
    }


    //// following use board's raw format

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

    public boolean wins(Piece piece) {
        // rows
        if (board[0][0] == piece && board[0][1] == piece && board[0][2] == piece) {
            return true;
        }
        if (board[1][0] == piece && board[1][1] == piece && board[1][2] == piece) {
            return true;
        }
        if (board[2][0] == piece && board[2][1] == piece && board[2][2] == piece) {
            return true;
        }

        // columns
        if (board[0][0] == piece && board[1][0] == piece && board[2][0] == piece) {
            return true;
        }
        if (board[0][1] == piece && board[1][1] == piece && board[2][1] == piece) {
            return true;
        }
        if (board[0][2] == piece && board[1][2] == piece && board[2][2] == piece) {
            return true;
        }

        // diagonals
        if (board[0][0] == piece && board[1][1] == piece && board[2][2] == piece) {
            return true;
        }
        if (board[0][2] == piece && board[1][1] == piece && board[2][0] == piece) {
            return true;
        }

        return false;
    }

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
