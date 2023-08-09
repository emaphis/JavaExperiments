
package games.game6;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author emaphis
 */
public class ThreadAnimationEx extends JFrame {

    public ThreadAnimationEx() {
        initUI();
    }

    private void initUI() {
        add(new Board());

        setResizable(false);
        pack();

        setTitle("Star Animation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            ThreadAnimationEx ex = new ThreadAnimationEx();
            ex.setVisible(true);
        });
    }
}
