
package gui.investments;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This program displays the growth of an investment.
 * @author emaphis
 */
public class InvestmentViewer12 {
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 100;

    private static final double INTEREST_RATE = 10;
    private static final double INITIAL_BALANCE = 1000;

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        // The button th trigger the calculatio
        JButton button = new JButton("Add interest");

        // The applicatin adds interesst to this bank accout
        final BankAccount account = new BankAccount(INITIAL_BALANCE);

        // The label for displaying the results
        final JLabel label = new JLabel("balance: " + account.getBalance());

        // The panel that holds the user-interface components.
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        frame.add(panel);

        class AddInterestListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                double interest = account.getBalance() * INTEREST_RATE / 100;
                account.deposite(interest);
                label.setText("balance: " + account.getBalance());
            }
        }

        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
