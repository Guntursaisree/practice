// package bank.management.system;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class Login extends JFrame implements ActionListener {
//     JButton signin, signup, clear;
//     JTextField cardnofield;
//     JPasswordField pinfield;

//     Login() {
//         setTitle("Automated Teller Machine");
//         setLayout(null);
//         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/yt.png"));
//         Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
//         ImageIcon i3 = new ImageIcon(i2);
//         JLabel label = new JLabel(i3);
//         label.setBounds(50, 15, 70, 70);
//         add(label);
//         JLabel text = new JLabel("Login Page");
//         text.setBounds(250, 25, 250, 60);
//         text.setFont(new Font("Osward", Font.BOLD, 38));
//         add(text);

//         JLabel cardno = new JLabel("Card no.");
//         cardno.setBounds(130, 150, 200, 40);
//         cardno.setFont(new Font("Raleway", Font.BOLD, 24));
//         add(cardno);

//         cardnofield = new JTextField();
//         cardnofield.setBounds(350, 150, 200, 40);
//         cardnofield.setFont(new Font("Arial", Font.BOLD, 14));
//         add(cardnofield);

//         JLabel pin = new JLabel("Pin");
//         pin.setBounds(130, 210, 300, 40);
//         pin.setFont(new Font("Raleway", Font.BOLD, 24));
//         add(pin);

//         pinfield = new JPasswordField();
//         pinfield.setBounds(350, 210, 200, 40);
//         pinfield.setFont(new Font("Arial", Font.BOLD, 14));
//         add(pinfield);

//         JButton signin = new JButton("SIGN IN");
//         signin.setBounds(360, 270, 80, 30);
//         signin.setBackground(Color.BLACK);
//         signin.setForeground(Color.WHITE);
//         signin.addActionListener(this);
//         add(signin);

//         JButton clear = new JButton("CLEAR");
//         clear.setBounds(460, 270, 80, 30);
//         clear.setBackground(Color.BLACK);
//         clear.setForeground(Color.WHITE);
//         clear.addActionListener(this);
//         add(clear);

//         JButton signup = new JButton("SIGN UP");
//         signup.setBounds(400, 310, 100, 30);
//         signup.setBackground(Color.BLACK);
//         signup.setForeground(Color.WHITE);
//         signup.addActionListener(this);
//         add(signup);

//         getContentPane().setBackground(Color.WHITE);
//         setSize(800, 450);
//         setVisible(true);
//         setLocation(300, 200);
//     }

//     public void actionPerformed(ActionEvent ae) {

//         if (ae.getSource() == clear) {
//             cardnofield.setText(" ");
//             pinfield.setText(" ");
//         } else if (ae.getSource() == signin) {

//         } else if (ae.getSource() == signup) {

//         }

//     }

//     public static void main(String[] args) {
//         new Login().setVisible(true);
//         ;
//     }

// }

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JLabel text, cardno, pin;
    JTextField tf1;
    JPasswordField pf2;
    JButton signin, clear, signup;

    Login() {
        setTitle("AUTOMATED TELLER MACHINE");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/yt.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(70, 10, 100, 100);
        add(l11);

        text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 450, 40);
        add(text);

        cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(125, 150, 375, 30);
        add(cardno);

        tf1 = new JTextField(15);
        tf1.setBounds(300, 150, 230, 30);
        tf1.setFont(new Font("Arial", Font.BOLD, 14));
        add(tf1);

        pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(125, 220, 375, 30);
        add(pin);

        pf2 = new JPasswordField(15);
        pf2.setFont(new Font("Arial", Font.BOLD, 14));
        pf2.setBounds(300, 220, 230, 30);
        add(pf2);

        signin = new JButton("SIGN IN");
        signin.setBackground(Color.BLACK);
        signin.setForeground(Color.WHITE);

        clear = new JButton("CLEAR");
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);

        signup = new JButton("SIGN UP");
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);

        setLayout(null);

        signin.setFont(new Font("Arial", Font.BOLD, 14));
        signin.setBounds(300, 300, 100, 30);
        add(signin);

        clear.setFont(new Font("Arial", Font.BOLD, 14));
        clear.setBounds(430, 300, 100, 30);
        add(clear);

        signup.setFont(new Font("Arial", Font.BOLD, 14));
        signup.setBounds(300, 350, 230, 30);
        add(signup);

        signin.addActionListener(this);
        clear.addActionListener(this);
        signup.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 480);
        setLocation(550, 200);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == signin) {
                // Conn c1 = new Conn();
                // String cardno = tf1.getText();
                // String pin = pf2.getText();
                // String q = "select * from login where cardno = '" + cardno + "' and pin ='" +
                // pin + "'";

                // // ResultSet rs = c1.s.executeQuery(q);
                // if (rs.next()) {
                // setVisible(false);
                // new Transactions(pin).setVisible(true);
                // } else {
                // JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                // }
            } else if (ae.getSource() == clear) {
                tf1.setText("");
                pf2.setText("");
            } else if (ae.getSource() == signup) {
                // setVisible(false);
                // new Signup().setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login().setVisible(true);
    }

}
