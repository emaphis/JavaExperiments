
package gui;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 *
 * @author emaphis
 */
public class DrawTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new DrawFrame();
            frame.setTitle("Draw Test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

/**
 * A frame that contains a panel with drawings
 */
class DrawFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    public DrawFrame() {
        add(new DrawComponent());
        pack();
    }
}

/**
 * A component that displays rectangle and ellipses.
 */
class DrawComponent extends JComponent {
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 400;

    private static final long serialVersionUID = 1L;

    @Override
    protected void paintComponent(Graphics g) {
        var g2 = (Graphics2D) g;

        // draw a rectagle

        float leftX = 100F;
        float topY = 100F;
        float width = 200F;
        float height = 150F;

        var rect = new Rectangle2D.Float(leftX, topY, width, height);
        g2.draw(rect);

        // draw the enclose ellipse
        var ellipse = new Ellipse2D.Double();
        ellipse.setFrame(rect);
        g2.draw(ellipse);

        // draw a diagonal line
        g2.draw(new Line2D.Double(leftX, topY, leftX + width, topY + height));

        // draw a cirlce with the same center.
        float centerX = (float) rect.getCenterX();
        float centerY = (float) rect.getCenterY();
        float radius = 150F;

        var circle = new Ellipse2D.Float();
        circle.setFrameFromCenter(centerX, centerY, centerX + radius,  centerY + radius);
        g2.draw(circle);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }


}