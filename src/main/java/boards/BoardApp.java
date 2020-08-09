package boards;

import java.util.Scanner;

/**
 * (1, 3) (2, 3) (3, 3) col -> row (1, 2) (2, 2) (3, 2) (1, 1) (2, 1) (3, 1)
 */
public class BoardApp {

    private static Board board;
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //char[] pieces = {'1', '2', '3',  '4', '5', '6',  '7', '8', '9'};
        System.out.println("Got here aaaaa");
        char[] pieces = getPieceNames();
        board = new Board(pieces);
        System.out.println();

        gameLoop();

        //putPiece('X', 1, 2);
        //putPiece('O', 2, 2);
        //putPiece('X', 3, 3);
        //putPiece('O', 3, 3);
        board.outputBoard();
    }

    private static void gameLoop() {
        boolean move = false;
        boolean finished = false;
        Piece piece = Piece.X;   // start with 'X'
        while (!finished) {
            while (!move) {
                System.out.print("Enter the coordinates: ");
                String line = scan.nextLine();
                move = nextMove(piece, line);
            }
            piece = board.switchPiece(piece);
            move = false;
            finished = isFinished();
        }
    }

    static char[] getPieceNames() {
        System.out.print("Enter pieces: ");
        String line = scan.nextLine();
        char[] pieceNames = line.toCharArray();
        return pieceNames;
    }

    static void putPiece(char name, int col, int row) {
        //System.out.print(board.empty(col, row) + ":");
        Piece piece = board.createPiece(name);
        if (board.empty(col, row)) {
            board.put(piece, col, row);
        } else {
            board.put(Piece.ERROR, col, row);
        }
    }

    static boolean nextMove(Piece piece, String line) {
        if (!line.matches("\\d\\s\\d")) {
            System.out.println("You should only use numbers!");
            return false;
        }

        String[] parts = line.split(" ");

        int col = Integer.parseInt(parts[0]);
        if (col > 3 || col < 1) {
            System.out.println("Coordinates should be from 1 to 3");
            return false;
        }

        int row = Integer.parseInt(parts[1]);
        if (row > 3 || row < 1) {
            System.out.println("Coordinates should be from 1 to 3");
            return false;
        }

        if (board.empty(col, row)) {
            board.put(piece, col, row);
            board.outputBoard();
            return true;
        }

        System.out.println("This cell is occupied! Choose another one!");
        return false;
    }

    static boolean isFinished() {
        GameState state = board.evaluateBoard();

        switch (state) {
            case XWINS:
                System.out.println("X wins");
                return true;
            case OWINS:
                System.out.println("X wins");
                return true;
            case IMPOSSIBLE:
                System.out.println("Impossible");
                return true;
            case SCRATCH:
                System.out.print("Draw");
                return true;
            case NOTFINISHED:
                return false;
            default:
                return false;

        }
    }
}
