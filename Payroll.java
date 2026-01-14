import javax.swing.*;
public class Payroll {
    public static void main(String[] args) {
        int basic = Integer.parseInt(
            JOptionPane.showInputDialog("Enter Basic Salary")
        );

        int hra = basic * 20 / 100;
        int da = basic * 10 / 100;
        int tax = basic * 5 / 100;
        int net = basic + hra + da - tax;

        JOptionPane.showMessageDialog(null,
            "Net Salary: " + net);
    }
}