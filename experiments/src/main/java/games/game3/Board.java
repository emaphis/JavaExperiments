
package games.game3;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author emaphis
 */
public class Board extends JPanel {

    private Image bardejov;

    public Board() {
        initBoard();
    }

    private void initBoard() {
        loadImage();

        int w = bardejov.getWidth(this);
        int h = bardejov.getHeight(this);
        setPreferredSize(new Dimension(w, h));
    }

    private void loadImage() {
        ImageIcon ii = new ImageIcon("src/resources/Bardejov.jpg");
        bardejov = ii.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(bardejov, 0, 0, null);
    }

}
