
package games.game5;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author emaphis
 */
public class UtilityTimerEx extends JFrame {

    public UtilityTimerEx() {
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
            UtilityTimerEx ex = new UtilityTimerEx();
            ex.setVisible(true);
        });
    }

}
