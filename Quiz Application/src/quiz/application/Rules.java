package quiz.application;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton start,back;
    
    //Constructor and pass parameter
    Rules(String name){
        this.name=name; // Globally stored
        getContentPane().setBackground(Color.WHITE); // For Screen colour Change
        setLayout(null);
        
        JLabel heading=new JLabel("Welcome " + name +" To simple Minds");
        heading.setBounds(50,20,700,50);
        heading.setFont(new Font("Viper Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel rules=new JLabel();
        rules.setBounds(20,90,750,350);
        rules.setFont(new Font("Viper Hand ITC",Font.PLAIN,16));
        
        // if we want to set value then we write setText
        rules.setText( 
            "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>");
        rules.setForeground(new Color(30,144,254));
        add( rules);
        
      
        back=new JButton("Back");
        back.setBounds(250,500,120,35);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
      
         start =new JButton("Start");
         start.setBounds(450,500,120,35);
         start.setBackground(new Color(30,144,254));
         start.setForeground(Color.WHITE);
         start.addActionListener(this);
        add( start);
       
        
        setSize(800,650);
        setLocation(450,150);
        setVisible(true);
    }
    
    
   // method for override to action listener
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
           setVisible(false);
           new Quiz(name) ;
        }else{
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args){
        new Rules("User"); // object create
    }
    
}
