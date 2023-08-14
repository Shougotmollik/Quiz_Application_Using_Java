import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    JLabel heading,scoreCard;
    JButton submit;

    Score(String name, int score) {
        setBounds(10, 10, 1200, 650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450, 90, 300, 250);
        add(image);

        heading = new JLabel("Thank you " + name + " for playing Simple Minds");
        heading.setBounds(400, 30, 700, 40);
        heading.setFont(new Font("Serif", Font.BOLD, 26));
        heading.setForeground(new Color(30,105,238));
        add(heading);

        scoreCard = new JLabel("Your score is " + score);
        scoreCard.setBounds(500, 375, 300, 40);
        scoreCard.setFont(new Font("Serif", Font.ITALIC, 26));
        scoreCard.setForeground(new Color(30,105,238));
        add(scoreCard);

        submit = new JButton("Play Again");
        submit.setBounds(535, 425, 120, 30);
        submit.setBackground(new Color(30,105,238));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}