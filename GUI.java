import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.Path;

class Events implements ActionListener {

    JFrame frame=new JFrame();
    JButton button1=new JButton("Choose file");
    JButton button2=new JButton("Encode");
    JButton button3=new JButton("Decode");
    JFileChooser chooser=new JFileChooser("C:\\Grošelj\\Maturitetna\\maturitetna");

    Events(){
        prepareGUI();
        buttonProperties1();
    }

    public void prepareGUI(){
        frame.setTitle("Grošl Encoder");
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setBounds(200,200,400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public void buttonProperties1(){
        button1.setBounds(130,300,100,40);
        button2.setBounds(30,200,100,40);
        button3.setBounds(230,200,100,40);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == button1){
            fileChooser();
        }else if (obj == button2){

        }else if (obj == button3){

        }
    }

    public String fileChooser(){
        int result = chooser.showOpenDialog(button1);
        File selectedFile;
        String filePath;
        if(result == JFileChooser.APPROVE_OPTION){
            selectedFile = chooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            filePath = selectedFile.getAbsolutePath();
        }
        return null;
    }

}

public class GUI {
    public static void main(String[] args)
    {
        new Events();
    }
}