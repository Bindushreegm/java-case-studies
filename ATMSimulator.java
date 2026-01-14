import javax.swing.*;

public class ATM {
    public static void main(String[] args) {
        int balance = 5000;
        int pin = 1234;

        int userPin = Integer.parseInt(
            JOptionPane.showInputDialog("Enter PIN")
        );

        if(userPin == pin) {
            int amt = Integer.parseInt(
                JOptionPane.showInputDialog("Enter Withdraw Amount")
            );

            if(amt <= balance)
                JOptionPane.showMessageDialog(null,
                    "Transaction Successful\nBalance: " + (balance - amt));
            else
                JOptionPane.showMessageDialog(null,"Insufficient Balance");
        } else {
            JOptionPane.showMessageDialog(null,"Invalid PIN");
        }
    }
}