
package games.game3;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author emaphis
 */
public class ImageExample extends JFrame {

    public ImageExample() {
        initUI();
    }

    private void initUI() {
        add(new Board());

        pack();

        setTitle("Bardejov Town Hall");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            ImageExample ex = new ImageExample();
            ex.setVisible(true);
        });
    }

}
