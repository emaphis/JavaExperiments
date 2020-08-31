
package games.game8;

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

        initSpaceShip();
    }

    private void initSpaceShip() {
        missiles = new ArrayList<>();

        loadImage("src/resources/craft.png");
        getImageDimensions();
    }

    public void move() {
        x += dx;
        y += dy;
    }

    public List<Missile> getMissiles() {
        return missiles;
    }

    public void keyPressed(KeyEvent ev) {
        int key = ev.getKeyCode();

        if (key == KeyEvent.VK_SPACE) {
            fire();
        }

        if (key == KeyEvent.VK_H) {
            dx = -1;
        }

        if (key == KeyEvent.VK_L) {
            dx = 1;
        }

        if (key == KeyEvent.VK_J) {
            dy = -1;
        }

        if (key == KeyEvent.VK_K) {
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
