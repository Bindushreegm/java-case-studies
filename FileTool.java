import java.io.File;
import javax.swing.*;

public class FileTool {
    public static void main(String[] args) {
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);

        File file = fc.getSelectedFile();

        JOptionPane.showMessageDialog(null,
            "File Name: " + file.getName() +
            "\nSize: " + file.length() +
            "\nType: " + (file.isFile() ? "File" : "Folder")
        );
    }
}