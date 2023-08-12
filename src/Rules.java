import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {

    JButton start,back;

    String name;
    //constructor
    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        JLabel heading=new JLabel("Welcome " +name+" to simple minds ");
        heading.setBounds(50,30,600,30);
        heading.setFont(new Font("Serif",Font.BOLD,28));
        heading.setForeground(new Color(30, 105, 238));
        add(heading);

        JLabel rules=new JLabel();
        rules.setBounds(50,40,800,400);
        rules.setFont(new Font("Serif",Font.ITALIC,18));
        rules.setText(
                        "<html>"+
                        "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                        "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                        "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                        "4. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                        "5. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                        "6. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                        "<html>"

        );
        rules.setForeground(new Color(30, 105, 238));
        add(rules);


        back=new JButton("Back");
        back.setBounds(550,450,80,30);
        back.setBackground(new Color(30,105,238));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        start=new JButton("Start");
        start.setBounds(750,450,80,30);
        start.setBackground(new Color(30,105,238));
        start.setForeground(Color.white);
        start.addActionListener(this);
        add(start);


        setSize(1200,650);
        setLocation(10,10);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Rules("User");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() ==start){

        }else {
            setVisible(false);
            new Login();
        }
    }
}