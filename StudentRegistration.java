import javax.swing.*;

public class StudentRegistration {
    public static void main(String[] args) {
        JFrame f = new JFrame("Student Registration");

        JLabel l1 = new JLabel("Name");
        JLabel l2 = new JLabel("USN");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JButton b = new JButton("Register");

        l1.setBounds(30,30,80,25);
        t1.setBounds(120,30,150,25);
        l2.setBounds(30,70,80,25);
        t2.setBounds(120,70,150,25);
        b.setBounds(100,120,100,30);

        b.addActionListener(e -> {
            if(t1.getText().isEmpty() || t2.getText().isEmpty())
                JOptionPane.showMessageDialog(f,"Please fill all fields");
            else
                JOptionPane.showMessageDialog(f,"Registration Successful");
        });

        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(b);

        f.setSize(330,220);
        f.setLayout(null);
        f.setVisible(true);
    }
}