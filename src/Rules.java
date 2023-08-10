import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

public class Rules extends JFrame implements ActionListener {

    String name;

    JButton back,start;
    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(1000,600);
        setLocation(200,100);
        setVisible(true);

        JLabel heading=new JLabel("Welcome "+ name +" to simple minds");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Serif",Font.BOLD,20));
        heading.setForeground(new Color(30, 105, 238));
        add(heading);

        JLabel rules=new JLabel();
        rules.setBounds(50,90,700,25);
        rules.setFont(new Font("serif",Font.PLAIN,25));
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
        add(rules);

        back=new JButton("Back");
        back.setBounds(1035,300,80,30);
        back.setBackground(new Color(30,105,238));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        start=new JButton("Star");
        start.setBounds(810,300,80,30);
        start.setBackground(new Color(30, 105, 238));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);


    }

    public static void main(String[] args) {
        new Rules("User");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
