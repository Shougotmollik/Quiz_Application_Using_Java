import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    Login(){
        //setting background colour
        getContentPane().setBackground(Color.white);
        setLayout(null);

        //setting log in image icon
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel loginImage=new JLabel(i1);
        add(loginImage);
        loginImage.setBounds(0,0,600,500);

        //Headline
        JLabel heading=new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Serif",Font.BOLD,40));
        heading.setForeground(new Color(30, 105, 238));
        add(heading);

        //Button
        JLabel name=new JLabel("Enter your name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian bait",Font.BOLD,20));
        add(name);


        //screen frame config
        setSize(1000,500);
        setLocation(150,150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Login();
    }
}
