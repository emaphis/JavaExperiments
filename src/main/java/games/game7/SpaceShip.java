
package games.game7;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author emaphis
 */
public class SpaceShip {

    private int dx;
    private int dy;
    private int x = 40;
    private int y = 60;
    private int w;
    private int h;
    private Image image;

    public SpaceShip() {
        loadImage();
    }

    private void loadImage() {
        ImageIcon ii = new ImageIcon("src/resources/craft.png");
        image = ii.getImage();

        w = image.getWidth(null);
        h = image.getHeight(null);
    }

    public void move() {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return w;
    }

    public int getHeight() {
        return h;
    }

    public Image getImage() {
        return image;
    }

    public void keyPressed(KeyEvent ev) {
        int key = ev.getKeyCode();

        if (key == KeyEvent.VK_H) {
            dx = -2;
        }

        if (key == KeyEvent.VK_L) {
            dx = 2;
        }

        if (key == KeyEvent.VK_J) {
            dy = -2;
        }

        if (key == KeyEvent.VK_K) {
            dy = 2;
        }
    }


    public void keyReleased(KeyEvent ev) {
        int key = ev.getKeyCode();

        if (key == KeyEvent.VK_H) {
            dx = 0;
        }

        if (key == KeyEvent.VK_L) {
            dx = 0;
        }

        if (key == KeyEvent.VK_J) {
            dy = 0;
        }

        if (key == KeyEvent.VK_K) {
            dy = 0;
        }
    }
}
