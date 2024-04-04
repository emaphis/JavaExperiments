/*
    First example program to thest the environment
*/

package start;

import javax.swing.*;

/**
 * Hello World Swing Application
 * @author emaph
 */
public class HelloWorldSwing {

    /**
     * Create the GUI and show it. For thread safety,
     * this method should be invoked from the
     * event-dispatching thread
     */
    private static void createAndShowGUI() {
        // Create and setup a window
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        // Display the window
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Schedule the job for the event-dispatching thread.
        // creating and showing the application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
