
package games.game8;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author emaphis
 */
public class ShootingMissilesEx extends JFrame {
   static int WIDTH = 400;
   static int HEIGHT = 300;

    public ShootingMissilesEx() {
        initUI();
    }

    private void initUI() {
        add(new Board());


        setTitle("Shooting missiles");
        setSize(WIDTH, HEIGHT);
        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            ShootingMissilesEx ex = new ShootingMissilesEx();
            ex.setVisible(true);
        });
    }

}
