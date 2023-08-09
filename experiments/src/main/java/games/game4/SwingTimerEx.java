
package games.game4;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author emaphis
 */
public class SwingTimerEx extends JFrame {

    public SwingTimerEx() {
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
            SwingTimerEx ex = new SwingTimerEx();
            ex.setVisible(true);
        });
    }

}
