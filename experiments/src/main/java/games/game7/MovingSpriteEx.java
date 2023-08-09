
package games.game7;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author emaphis
 */
public class MovingSpriteEx extends JFrame {
   static int WIDTH = 400;
   static int HEIGHT = 300;

    public MovingSpriteEx() {
        initUI();
    }

    private void initUI() {
        add(new Board());


        setTitle("Moving sprite");
        setSize(WIDTH, HEIGHT);
        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            MovingSpriteEx ex = new MovingSpriteEx();
            ex.setVisible(true);
        });
    }

}
