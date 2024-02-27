import javax.swing.*;
import java. awt. *;
import java.awt.event.*;

public class main implements ActionListener 
{
    public main() 
    {
        JFrame frame = new JFrame("DCIT50");
        frame.setDefaultCloseOperation (JFrame. EXIT_ON_CLOSE);
        frame.getContentPane ().setLayout (new FlowLayout());
        JButton b = new JButton("Click me! ");
        b. addActionListener(this);
        frame.getContentPane ().add (b);
        frame.pack ();
        frame.setVisible (true);
    }
    public void actionPerformed(ActionEvent e) 
    {
        JOptionPane.showMessageDialog(null, "You Pass!");
    }
    public static void main(String[] args) { new main(); }
    }