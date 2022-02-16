import javax.swing.*;
import java.io.*;

//import javafx.event.ActionEvent;
//import javafx.print.PageLayout;

public class GUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("TEST GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);

        JButton buttonEncode = new JButton("Encode");
        JButton buttonDecode = new JButton("Decode");

       //buttonEncode.addActionListener(l);

       /* frame.getContentPane().add(buttonEncode);
        frame.getContentPane().add(buttonDecode);
        frame.setVisible(true);*/

        JPanel panel = new JPanel();
        panel.add(buttonEncode);
        panel.add(buttonDecode);

       // JPanel panelDown = new JPanel();
        

        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(panel);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        }

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
