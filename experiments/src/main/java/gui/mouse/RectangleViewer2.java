
package gui.mouse;

import javax.swing.JFrame;

/**
 * This program moves the rectangle.
 * @author emaphis
 */
public class RectangleViewer2 {

    public static void main(String[] args) {
        JFrame frame = new RectangleFrame2();
        frame.setTitle("A movable rectangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
