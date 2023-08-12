import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{

    // Globally define button
    JButton rules,back;
    JTextField tbname;

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
        heading.setBounds(810,30,300,45);
        heading.setFont(new Font("Serif",Font.BOLD,40));
        heading.setForeground(new Color(30, 105, 238));
        add(heading);

        //Button
        JLabel name=new JLabel("Enter your name");
        name.setBounds(810,100,300,30);
        name.setFont(new Font("serif",Font.BOLD,18));
        name.setForeground(new Color(30, 105, 238));
        add(name);

        tbname=new JTextField();
        tbname.setBounds(811,140,300,25);
        tbname.setFont(new Font("serif", Font.BOLD,15));
        add(tbname);

        JLabel email=new JLabel("Enter your email address ");
        email.setFont(new Font("serif",Font.BOLD,18));
        email.setBounds(810,160,300,30);
        email.setForeground(new Color(30, 105, 238));
        add(email);

        JTextField tbemail=new JTextField();
        tbemail.setBounds(811,200,300,25);
        tbemail.setFont(new Font("serif", Font.BOLD,15));
        add(tbemail);

        rules=new JButton("Rules");
        rules.setBounds(810,300,80,30);
        rules.setBackground(new Color(30, 105, 238));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        back=new JButton("Back");
        back.setBounds(1035,300,80,30);
        back.setBackground(new Color(30,105,238));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);


        //screen frame config
        setSize(1200,650);
        setLocation(10,10);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Login();
    }


    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==rules){
            String name=tbname.getText();
            setVisible(false);
            new Rules(name);
        }else if (e.getSource()==back){
            setVisible(false);
        }

    }
}
