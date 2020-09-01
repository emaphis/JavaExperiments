
package games.game9;

/**
 *
 * @author emaphis
 */
class Alien extends Sprite {

    private final int INITIAL_X = 400;

    Alien(int x, int y) {
        super(x, y);

        initAlien();
    }

    private void initAlien() {
        loadImage("src/resources/alien.png");
        getImageDimensions();
    }

    public void move() {
        if (x < 0) {
            x = INITIAL_X;
        }

        x -= 1;
    }
}
