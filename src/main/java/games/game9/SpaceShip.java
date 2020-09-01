
package games.game9;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emaphis
 */
public class SpaceShip extends Sprite {

    private int dx;
    private int dy;
    private List<Missile> missiles;

    public SpaceShip(int x, int y) {
        super(x, y);

        initCraft();
    }

    private void initCraft() {
        missiles = new ArrayList<>();

        loadImage("src/resources/craft.png");
        getImageDimensions();
    }

    public void move() {
        x += dx;
        y += dy;

        if (x < 1) {
            x = 1;
        }

        if (y < 1) {
            y = 1;
        }
    }

    public List<Missile> getMissiles() {
        return missiles;
    }

    public void keyPressed(KeyEvent ev) {
        int key = ev.getKeyCode();

        // fire
        if (key == KeyEvent.VK_SPACE) {
            fire();
        }

        // left
        if (key == KeyEvent.VK_H) {
            dx = -1;
        }

        // right
        if (key == KeyEvent.VK_K) {
            dx = 1;
        }

        // up
        if (key == KeyEvent.VK_U) {
            dy = -1;
        }

        // down
        if (key == KeyEvent.VK_J) {
            dy = 1;
        }
    }

    public void fire() {
        missiles.add(new Missile(x + width, y + height / 2));
    }


    public void keyReleased(KeyEvent ev) {
        int key = ev.getKeyCode();

        if (key == KeyEvent.VK_H) {
            dx = 0;
        }

        if (key == KeyEvent.VK_K) {
            dx = 0;
        }

        if (key == KeyEvent.VK_U) {
            dy = 0;
        }

        if (key == KeyEvent.VK_J) {
            dy = 0;
        }
    }
}
