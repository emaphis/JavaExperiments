
package games.game2;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author emaphis
 */
public class DonutExample extends JFrame {
   static int WIDTH = 330;
   static int HEIGHT = 330;

    public DonutExample() {
        initUI();
    }

    private void initUI() {
        add(new Board());

        setSize(WIDTH, HEIGHT);

        setTitle("Donut Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            DonutExample ex = new DonutExample();
            ex.setVisible(true);
        });
    }

}
