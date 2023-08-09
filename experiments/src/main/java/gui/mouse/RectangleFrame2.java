
package gui.mouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 * This frame contains a moving rectangle.
 * @author emaphis
 */
public class RectangleFrame2 extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;

    private RectangleComponent2 scene;

    class MousePressedListener implements MouseListener {

        @Override
        public void mousePressed(MouseEvent event) {
            int x = event.getX();
            int y = event.getY();
            scene.moveRectangleTo(x, y);
        }

        // Do-nothing methods
        public void mouseReleased(MouseEvent event) {}
        public void mouseClicked(MouseEvent event) {}
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}
    }


    public RectangleFrame2() {
        scene = new RectangleComponent2();
        add(scene);

        MouseListener listener = new MousePressedListener();
        scene.addMouseListener(listener);

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
}
