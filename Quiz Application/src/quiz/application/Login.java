package quiz.application;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
   
    JButton rules,back;    //Globally Declare
     JTextField tfname;
    //Constructor
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i1);//whatever i want write i can write
        image.setBounds(0,0,600,500);//(left,top,length,Width)
        add(image);
        
        JLabel heading=new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viper Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(30,144,254));
        add(heading);
       
        JLabel name=new JLabel("Enter your name");
        name.setBounds(750,120,700,50);
        name.setFont(new Font("Viper Hand ITC",Font.BOLD,40));
        name.setForeground(new Color(40,144,254));
        add(name);
        
        tfname=new JTextField();
        tfname.setBounds(750,200,300,35);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);
        
        rules =new JButton("Rules");
        rules.setBounds(750,270,120,35);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
       
        back=new JButton("Back");
        back.setBounds(930,270,120,35);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
        
    }
    //whatever we create in my project and we want -
    //-to any action then we have to override the action so i create actionPerformed
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name=tfname.getText(); //whatever user fill in textfield getText stored in name
            setVisible(false);  // if i want to open rule class when i click on rule button
            new Rules(name);
        }else if(ae.getSource()==back){
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new Login();
    }
}
