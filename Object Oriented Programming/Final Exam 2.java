import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinalExam
{
    public static void main(String[] args)
    {
        final Color bgcolor = new Color(0, 188, 255);
        final Color panelcolor1 = new Color(255, 245, 0);
        final Color panelcolor2 = new Color(255, 105, 180);
        final Color panelcolor3 = new Color(125, 249, 255);
        final Color panelcolor4 = new Color(144, 238, 144);
        
        JFrame frame = new JFrame ("Granada Final Examination");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        JLabel multiple_choice1, multiple_choice2, TrueFalse1, TrueFalse2,Essay, Identify1, Identify2;
        JCheckBox choice1_1,choice1_2,choice1_3,choice1_4;
        JCheckBox choice2_1,choice2_2,choice2_3,choice2_4;
        JRadioButton True1,False1,True2,False2;
        JTextArea essaybox = new JTextArea();
        JTextField blank1, blank2;
        JButton button = new JButton("Submit");
        
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        panel1.setPreferredSize (new Dimension(420,175));
        panel2.setPreferredSize (new Dimension(420,105));
        panel3.setPreferredSize (new Dimension(420,180));
        panel4.setPreferredSize (new Dimension(420,55));
        panel1.setBackground(panelcolor1);
        panel2.setBackground(panelcolor2);
        panel3.setBackground(panelcolor3);
        panel4.setBackground(panelcolor4);
        
        
        multiple_choice1 = new JLabel("What does OOP means?");
        multiple_choice2 = new JLabel("What Programming Langauge do you use?");
        TrueFalse1 = new JLabel ("Java was invented in the year 1991.");
        TrueFalse2 = new JLabel ("HTML is a programming language.");
        Essay = new JLabel("Essay: Why do you like programming?");
        Identify1 = new JLabel("It was originally called \"C with Classes\"");
        Identify2 = new JLabel("What was Java originally called?");
        blank1 = new JTextField();
        blank2 = new JTextField();
        
        multiple_choice1.setBounds(10,0,500,30); 
        multiple_choice2.setBounds(10,85,500,30); 
        TrueFalse1.setBounds(10,180,500,30);
        TrueFalse2.setBounds(10,230,500,30);
        Essay.setBounds(10,290,500,30);
        blank1.setBounds(10,485,50,20);
        blank2.setBounds(10,510,50,20);
        
        choice1_1 = new JCheckBox("Oriented Object Programming");
        choice1_2 = new JCheckBox("Object Oriented Programming");
        choice1_3 = new JCheckBox("Orienting Object Programming");
        choice1_4 = new JCheckBox("Objects Oriented Programming");
        
        choice2_1 = new JCheckBox("Java");
        choice2_2 = new JCheckBox("Python");
        choice2_3 = new JCheckBox("C++");
        choice2_4 = new JCheckBox("Javascript");
        
        True1 = new JRadioButton("True");
        False1 = new JRadioButton("False");
        True2 = new JRadioButton("True");
        False2 = new JRadioButton("False");
        
        choice1_1.setBounds(10,20,250,30);
        choice1_2.setBounds(10,35,250,30);
        choice1_3.setBounds(10,50,250,30);
        choice1_4.setBounds(10,65,250,30);
        choice2_1.setBounds(10,105,250,30);
        choice2_2.setBounds(10,120,250,30);
        choice2_3.setBounds(10,135,250,30);
        choice2_4.setBounds(10,150,250,30);
        True1.setBounds(10,195,250,30);
        False1.setBounds(10,210,250,30);
        True2.setBounds(10,245,250,30);
        False2.setBounds(10,260,250,30);
        essaybox.setBounds(15,315,400,150);
        Identify1.setBounds(65,480,250,30);
        Identify2.setBounds(65,505,250,30);
        
        ButtonGroup group1 = new ButtonGroup();
        group1.add(choice1_1);group1.add(choice1_2);group1.add(choice1_3);group1.add(choice1_4);
        choice1_1.setOpaque(false);choice1_2.setOpaque(false);choice1_3.setOpaque(false);choice1_4.setOpaque(false);
        frame.add(choice1_1);frame.add(choice1_2);frame.add(choice1_3);frame.add(choice1_4);
        
        choice2_1.setOpaque(false);choice2_2.setOpaque(false);choice2_3.setOpaque(false);choice2_4.setOpaque(false);
        frame.add(choice2_1);frame.add(choice2_2);frame.add(choice2_3);frame.add(choice2_4);
        
        ButtonGroup group2 = new ButtonGroup();
        group2.add(True1);group2.add(False1);
        True1.setOpaque(false);False1.setOpaque(false);
        frame.add(True1);frame.add(False1);
        
        ButtonGroup group3 = new ButtonGroup();
        group3.add(True2);group3.add(False2);
        True2.setOpaque(false);False2.setOpaque(false);
        frame.add(True2);frame.add(False2);
        
        blank1.setOpaque(false);blank2.setOpaque(false);
        
        button.setBounds(160,545,100,30);
        
        frame.add(multiple_choice1);
        frame.add(multiple_choice2);
        frame.add(TrueFalse1);
        frame.add(TrueFalse2);
        frame.add(Essay);
        frame.add(essaybox);
        frame.add(Identify1);
        frame.add(Identify2);
        frame.add(blank1);
        frame.add(blank2);
        frame.add(button);
        
        JPanel backgroundmain = new JPanel();
        backgroundmain.setBackground(bgcolor);
        frame.setPreferredSize (new Dimension(450, 625));
        frame.getContentPane().add(backgroundmain);
        frame.pack();
        frame.setVisible(true);
        
        backgroundmain.add(panel1);
        backgroundmain.add(panel2);
        backgroundmain.add(panel3);
        backgroundmain.add(panel4);

button.addActionListener(new ActionListener() 
    {
        @Override
        public void actionPerformed(ActionEvent click) 
            {
                if (click.getSource()== button)
                {JOptionPane.showMessageDialog(frame,"You are done with the Quiz!");}
            }
        });
} 
}