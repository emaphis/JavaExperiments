
package games.game8;

/**
 *
 * @author emaphis
 */
public class Missile extends Sprite {

    private final int BOARD_WIDTH = 390;
    private final int MiSSILE_SPEED = 2;

    public Missile(int x, int y) {
        super(x, y);

        initMissile();
    }

    private void initMissile() {
        loadImage("src/resources/missile.png");
        getImageDimensions();
    }

    public void move() {
        x += MiSSILE_SPEED;

        if (x > BOARD_WIDTH) {
            visible = false;
        }
    }
}
