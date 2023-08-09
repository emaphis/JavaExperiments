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
        Player playerX = getPlayer(board, PieceType.X, "medium");
        Player playerO = getPlayer(board, PieceType.O, "medium");

        if (playerX != null && playerO != null) {
            board.outputBoard();
            gameLoop(playerX, playerO);
        } else {
            System.out.println("Bad players!");
        }
    }

    private static void gameLoop(Player playerX, Player playerO) {
        boolean finished = false;

        // start game loop.
        while (!finished) {

            // 'X' plays. (first)
            System.out.println("X plays"); //////
            finished = makeMove(playerX);

            if (!finished) {
                // 'O' playes
                System.out.println("O plays"); ///////
                finished = makeMove(playerO);
            }
        }
    }

    static char[] getPieceString() {
        System.out.print("Enter cells: ");
        String line = scan.nextLine();
        return line.toCharArray();
    }

    /** translate string to player */
    static Player getPlayer(Board board, PieceType piece, String player) {
        switch (player) {
            case "easy":
                return new EasyPlayer(board, piece);
            case "medium":
                return new MediumPlayer(board, piece);
            case "user":
                return new UserPlayer(board, piece, scan);
            default:
                return null;  // Opps.
        }
    }

    static boolean makeMove(Player player) {
        player.play();
        board.outputBoard();
        return isFinished();
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
