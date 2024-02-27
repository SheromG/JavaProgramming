import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Main extends JFrame implements ActionListener 
{
    JRadioButton course1,course2,course3,course4,course5;
    JButton button1, button2;
    JLabel word1, word2, question1, question2;
    JTextArea essay = new JTextArea();

    Main()
    {
        final Color asul = new Color(51,204,255);
        final Color dilaw = new Color(255,255,153);
        
        JFrame frame = new JFrame ("Granada_Activty 9");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        
        word1 = new JLabel("Essay: ");
        word2 = new JLabel("Multiple Choice: ");
        question1 = new JLabel("What is your Course? ");
        question2 = new JLabel("Why do you choose BSIT? ");
        
        course1 = new JRadioButton("BS in Information Technology");
        course2 = new JRadioButton("BS in Computer Science");
        course3 = new JRadioButton("BS in Computer Engineering");
        course4 = new JRadioButton("BS in Information Systems");
        course5 = new JRadioButton("BS in Information Technology Entrepreneurship");
        button1 = new JButton("Count");
        button2 = new JButton("Submit");
        
        word1.setBounds(10,10,100,30); 
        word2.setBounds(490,10,100,30); 
        question1.setBounds(490,50,1000,30); 
        question2.setBounds(10,50,1000,30); 
        essay.setBounds(10,90,455,315);
        course1.setBounds(490,100,200,30);
        course2.setBounds(490,130,200,30);
        course3.setBounds(490,160,200,30);
        course4.setBounds(490,190,200,30);
        course5.setBounds(490,220,300,30);
        
        button1.setBounds(200, 450, 95,30);
        button2.setBounds(490, 260, 95,30);
        
        add(word1);
        add(word2);
        add(essay);
        add(button1);
        add(question1);
        add(question2);
        
        ButtonGroup group = new ButtonGroup();
        group.add(course1); group.add(course2); group.add(course3); group.add(course4); group.add(course5);
        course1.setOpaque(false); course2.setOpaque(false); course3.setOpaque(false); course4.setOpaque(false); course5.setOpaque(false); 
        add(course1);add(course2);add(course3);add(course4);add(course5);
        add(button2);
        
        JPanel background1 = new JPanel();
        JPanel background2 = new JPanel();
        background1.setPreferredSize (new Dimension(465,490));
        background2.setPreferredSize (new Dimension(465,490));
        background1.setBackground(asul);
        background2.setBackground(dilaw);
        
        JPanel backgroundmain = new JPanel();
        backgroundmain.setBackground(Color.white);
        setPreferredSize (new Dimension(960, 540));
        getContentPane().add(backgroundmain);
        pack();
        setVisible(true);
        
        backgroundmain.add(background1);
        backgroundmain.add(background2);
        
        button1.addActionListener(this);
        button2.addActionListener(this);
    }
    
    @Override
        public void actionPerformed(ActionEvent click) 
        {   
        if (click.getSource()== button1)
        {
            String counter= essay.getText(); 
            String words[] = counter.split("\\s"); 
            int count = words.length; 
            JOptionPane.showMessageDialog(this,"The word count is " + count);
        }
        if (course1.isSelected()){JOptionPane.showMessageDialog(this,"Your course is BS in Information Technology" );}
        if (course2.isSelected()){JOptionPane.showMessageDialog(this,"Your course is BS in Computer Science" );}
        if (course3.isSelected()){JOptionPane.showMessageDialog(this,"Your course is BS in Computer Engineering");}
        if (course4.isSelected()){JOptionPane.showMessageDialog(this,"Your course is BS in Information Systems");}
        if (course5.isSelected()){JOptionPane.showMessageDialog(this,"Your course is BS in IInformation Technology Entrepreneurship");}
        }
}

public class Activity_9
{    
    public static void main(String[] args) 
    {
        new Main();
    }
}