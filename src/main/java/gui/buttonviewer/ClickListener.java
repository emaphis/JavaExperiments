
package gui.buttonviewer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * An action listener that prints a message.
 * @author emaphis
 */
public class ClickListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("I was clicked.");
    }

}
