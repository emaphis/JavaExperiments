
package games.game9;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author emaphis
 */
public class CollisionEx extends JFrame {

    public CollisionEx() {
        initUI();
    }

    private void initUI() {
        add(new Board());


        setTitle("Collisons");
        pack();
        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            CollisionEx ex = new CollisionEx();
            ex.setVisible(true);
        });
    }

}
