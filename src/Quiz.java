import javax.swing.*;
import java.awt.*;

public class Quiz extends JFrame {
    String[][] questions =new String[10][5];
    String[][] answers=new String[10][2];

    JLabel quesNo,question;
    JRadioButton opt1,opt2,opt3,opt4;

    public static int timer=20;
    Quiz(){

        //Frame background colour
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        //Image Icon place

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel loginImage=new JLabel(i1);
        add(loginImage);
        loginImage.setBounds(0,0,1200,350);

        //question making

        quesNo=new JLabel();
        quesNo.setBounds(100,375,50,50);
        quesNo.setFont(new Font("Serif",Font.PLAIN,20));
        add(quesNo);

        question=new JLabel();
        question.setBounds(120,375,750,50);
        question.setFont(new Font("Serif",Font.PLAIN,20));
        add(question);


        // All question placed here
        questions[0][0] = " Which is used to find and fix bugs in the Java programs?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = " What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = " Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = " An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = " In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = " Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = " Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = " In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = " Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = " Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

        //All answers are here
        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";

        //Options Button
        opt1=new JRadioButton();
        opt1.setBounds(130,425,700,30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Serif",Font.PLAIN,15));
        add(opt1);


        opt2=new JRadioButton();
        opt2.setBounds(130,450,700,30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Serif",Font.PLAIN,15));
        add(opt2);

        opt3=new JRadioButton();
        opt3.setBounds(130,475,700,30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Serif",Font.PLAIN,15));
        add(opt3);

        opt4=new JRadioButton();
        opt4.setBounds(130,500,700,30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Serif",Font.PLAIN,15));
        add(opt4);

        ButtonGroup groupOptions=new ButtonGroup();
        groupOptions.add(opt1);
        groupOptions.add(opt2);
        groupOptions.add(opt3);
        groupOptions.add(opt4);


        //Button

        JButton next=new JButton("Next");
        next.setBounds(750,550,80,30);
        next.setBackground(new Color(30,105,238));
        next.setForeground(Color.WHITE);
        add(next);

        JButton lifeLine=new JButton("50-50");
        lifeLine.setBounds(875,550,80,30);
        lifeLine.setBackground(new Color(30,105,238));
        lifeLine.setForeground(Color.WHITE);
        add(lifeLine);

        JButton submit=new JButton("Submit");
        submit.setBounds(1000,550,80,30);
        submit.setBackground(new Color(30,105,238));
        submit.setForeground(Color.WHITE);
        submit.setEnabled(false);
        add(submit);

        start(0);


        //frame Size
        setSize(1200,650);
        setLocation(10,10);
        setVisible(true);
    }

    public void paint(Graphics g){
        super.paint(g);

        String time="Time left " +timer+ " seconds."; //time =20
        g.setColor(new Color(0xEE0C35));
        g.setFont(new Font("Serif",Font.BOLD,21));

        if(timer>0){
            g.drawString(time,900,450);
        }else {
            g.drawString("Times up!!",900,450);
        }
        timer--;

        try{
            Thread.sleep(1000);
            repaint();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void  start (int count ){
        quesNo.setText(" " +(count+1) +". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt2.setText(questions[count][2]);
        opt3.setText(questions[count][3]);
        opt4.setText(questions[count][4]);
    }
    public static void main(String[] args) {
        new Quiz();
    }
}
