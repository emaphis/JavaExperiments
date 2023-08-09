
package boards;

import java.util.Scanner;
import static boards.Board.LEN;

/**
 *
 * @author emaphis
 */
public class UserPlayer extends Player {
    Scanner scan;

    public UserPlayer(Board board, PieceType piece, Scanner scan) {
        super(board, piece);
        this.scan = scan;
    }

    @Override
    public void play() {

        boolean move = false;

        while (!move) {
            System.out.println("Enter the coordinates: ");
            String line = scan.nextLine();
            move = legaUserMove(line);
        }
    }


    private boolean legaUserMove(String line) {
        if (!line.matches("\\d\\s\\d")) {
            System.out.println("You should enter numbers!");
            return false;
        }

        String[] parts = line.split(" ");

        int col = Integer.parseInt(parts[0]);
        if (col > LEN || col < 1) {
            System.out.println("Coordinates should be from 1 to 3!");
            return false;
        }

        int row = Integer.parseInt(parts[1]);
        if (row > LEN || row < 1) {
            System.out.println("Coordinates should be from 1 to 3!");
            return false;
        }

        if (!board.isEmpty(col, row)) {
            System.out.println("This cell is occupied! Choose another one!");
            return false;
        } else {
            board.put(new Cell(piece), col, row);
            return true;
        }
    }

}
