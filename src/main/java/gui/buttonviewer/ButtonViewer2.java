
package gui.buttonviewer;

import java.awt.Frame;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * This program demonstrates how to install an action listener.
 * @author emaphis
 */
public class ButtonViewer2 {
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 60;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Chick Me!");
        frame.add(button);

        button.addActionListener(ev -> System.out.println("I was clicked."));

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
