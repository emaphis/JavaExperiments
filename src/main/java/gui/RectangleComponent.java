
package gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 * A component that draws tow rectangles.
 * @author emaphis
 */
public class RectangleComponent extends JComponent {

    private static final long serialVersionUID = 10012L;

    @Override
    protected void paintComponent(Graphics g) {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        // Costruct a rectangle and draw it.
        Rectangle box = new Rectangle(5, 10, 20, 30);
        g2.draw(box);

        // Move rectangle 15 units to the right and 25 units down
        box.translate(15, 25);

        // Draw the moved rectangle
        g2.draw(box);
    }

}
