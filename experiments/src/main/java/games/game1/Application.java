
package games.game1;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author emaphis
 */
public class Application extends JFrame {
   static int WIDTH = 250;
   static int HEIGHT = 200;

    public Application() {
        initUI();
    }

    private void initUI() {
        add(new Board());

        setSize(WIDTH, HEIGHT);

        setTitle("Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Application ex = new Application();
            ex.setVisible(true);
        });
    }

}
