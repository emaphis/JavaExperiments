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
        System.out.println("aaa");
        //char[] pieces = getPieceString();
        //board = new Board(pieces);
        board = new Board();
        board.outputBoard();

//        System.out.println("Get two players");
//        String line = scan.nextLine();
//        String[] parts = line.split(" ");

        PlayerType player1 = getPlayer("medium");
        PlayerType player2 = getPlayer("medium");

        if (player1 != PlayerType.ERROR && player2 != PlayerType.ERROR) {
            gameLoop(player1, player2);
        } else {
            System.out.println("Bad players!");
        }
    }

    private static void gameLoop(PlayerType player1, PlayerType player2) {
        boolean finished = false;

        // start game loop.
        while (!finished) {

            // 'X' plays. (first)
            System.out.println("X plays"); //////
            finished = makeMove(Piece.X, player1);

            if (!finished) {
                // 'O' playes
                System.out.println("O plays"); ///////
                finished = makeMove(Piece.O, player2);
            }
        }
    }

    static char[] getPieceString() {
        System.out.print("Enter cells: ");
        String line = scan.nextLine();
        return line.toCharArray();
    }

    /** translate string to player */
    static PlayerType getPlayer(String player) {
        switch (player) {
            case "easy":
                return PlayerType.EASY;
            case "medium":
                return PlayerType.MEDIUM;
            case "user":
                return PlayerType.USER;
            default:
                return PlayerType.ERROR;  // Opps.
        }
    }

    static boolean makeMove(Piece piece, PlayerType player) {
        switch (player) {
            case USER:
                playUser(piece);
                break;
            case EASY:
                board.playEasy(piece);
                break;
            case MEDIUM:
                board.playMedium(piece);
                break;
            case ERROR:
            default:
                break;
        }
        board.outputBoard();
        return isFinished();
    }


    // User moves
    static void playUser(Piece piece) {
        boolean move = false;

        while (!move) {
            System.out.println("Enter the coordinates: ");
            String line = scan.nextLine();
            move = legaUserXMove(piece, line);
        }
    }

    static boolean legaUserXMove(Piece piece, String line) {
        if (!line.matches("\\d\\s\\d")) {
            System.out.println("You should enter numbers!");
            return false;
        }

        String[] parts = line.split(" ");

        int col = Integer.parseInt(parts[0]);
        if (col > board.LEN || col < 1) {
            System.out.println("Coordinates should be from 1 to 3!");
            return false;
        }

        int row = Integer.parseInt(parts[1]);
        if (row > board.LEN || row < 1) {
            System.out.println("Coordinates should be from 1 to 3!");
            return false;
        }

        if (!board.isEmpty(col, row)) {
            System.out.println("This cell is occupied! Choose another one!");
            return false;
        } else {
            board.put(piece, col, row);
            return true;
        }
    }

    /** interpret board state */
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
                System.out.println("Draw");
                return true;
            case NOTFINISHED:
            default:
                return false;
        }
    }
}
