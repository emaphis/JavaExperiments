
package gui.investments;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * This program demonstrates how an action listener can access
 * a variable from a surrounding block.
 * @author emaphis
 */
public class InvestmentViewer1 {
    private static final int FRAME_WIDTH = 120;
    private static final int FRAME_HEIGHT = 60;

    private static final double INTEREST_RATE = 10;
    private static final double INITIAL_BALANCE = 1000;

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        // The button th trigger the calculatio
        JButton button = new JButton("Add interest");
        frame.add(button);

        // The applicatin adds interesst to this bank accout
        final BankAccount account = new BankAccount(INITIAL_BALANCE);

        class AddInterestListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                // The listener method accesses the account variable
                // from the surrounding block
                double interest = account.getBalance() * INTEREST_RATE / 100;
                account.deposite(interest);
                System.out.println("balance: " + account.getBalance());
            }
        }

        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
