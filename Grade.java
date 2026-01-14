import javax.swing.*;

public class Grade {
    public static void main(String[] args) {
        int marks = Integer.parseInt(
            JOptionPane.showInputDialog("Enter Marks")
        );

        if(marks >= 75)
            JOptionPane.showMessageDialog(null,"Grade A - Pass");
        else if(marks >= 50)
            JOptionPane.showMessageDialog(null,"Grade B - Pass");
        else
            JOptionPane.showMessageDialog(null,"Fail");
    }
}