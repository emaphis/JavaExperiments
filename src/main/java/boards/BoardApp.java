package boards;

import java.util.Scanner;

/**
 * (1, 3) (2, 3) (3, 3) col -> row
 * (1, 2) (2, 2) (3, 2)
 * (1, 1) (2, 1) (3, 1)
 */
public class BoardApp {

    private static Board board;
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //char[] pieces = {'1', '2', '3',  '4', '5', '6',  '7', '8', '9'};
        //char[] pieces = getPieceNames();
        //board = new Board(pieces);
        board = new Board();
        board.outputBoard();

        gameLoop();

        //putPiece('X', 1, 2);
        //putPiece('O', 2, 2);
    }

    private static void gameLoop() {
        boolean move = false;
        Piece piece;
        boolean finished = false;

        // start game loop.
        while (!finished) {

            // 'X' plays.
            piece = Piece.X;
            while (!move) {  // loop unil legal X move.
                System.out.print("Enter the coordinates: ");
                String line = scan.nextLine();
                move = legalXMove(piece, line);
            }

            move = false;
            finished = isFinished();

            if (!finished) {

                // 'O' plays
                piece = Piece.O;
                board.playEasy(piece);
                finished = isFinished();
            }

            board.outputBoard();
        }
    }

    static char[] getPieceNames() {
        System.out.print("Enter cells: ");
        String line = scan.nextLine();
        return line.toCharArray();
    }

    static void putPiece(char name, int col, int row) {
        Piece piece = board.createPiece(name);
        if (board.empty(col, row)) {
            board.put(piece, col, row);
        } else {
            board.put(Piece.ERROR, col, row);
        }
    }

    static boolean legalXMove(Piece piece, String line) {
        if (!line.matches("\\d\\s\\d")) {
            System.out.println("You should enter numbers!");
            return false;
        }

        String[] parts = line.split(" ");

        int col = Integer.parseInt(parts[0]);
        if (col > 3 || col < 1) {
            System.out.println("Coordinates should be from 1 to 3!");
            return false;
        }

        int row = Integer.parseInt(parts[1]);
        if (row > 3 || row < 1) {
            System.out.println("Coordinates should be from 1 to 3!");
            return false;
        }

        if (!board.empty(col, row)) {
            System.out.println("This cell is occupied! Choose another one!");
            return false;
        } else {
            board.put(piece, col, row);
            board.outputBoard();
            return true;
        }
    }

    static boolean isFinished() {
        GameState state = board.evaluateBoard();

        switch (state) {
            case XWINS:
                System.out.println("X wins");
                return true;
            case OWINS:
                System.out.println("O wins");
                return true;
            case IMPOSSIBLE:
                System.out.println("Impossible");
                return true;
            case SCRATCH:
                System.out.print("Draw");
                return true;
            case NOTFINISHED:
            default:
                return false;
        }
    }
}
