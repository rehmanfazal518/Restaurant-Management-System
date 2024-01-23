/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageme_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author Fazal
 */
class MainFrame extends JFrame implements ActionListener {

    public static int flag = 0;
    JButton Admin = new JButton();
    JButton Waiter = new JButton();
    Icon i = new ImageIcon(this.getClass().getResource("LOGO.png"));
    public JLabel icon = new JLabel(i);
    public  Border b = BorderFactory.createLineBorder(Color.DARK_GRAY, 7);
    public void intializer() {
        Admin.setText("Admin");
        Admin.setBounds(20, 360, 150, 70);
        Admin.addActionListener(this);
        Admin.setBackground(Color.LIGHT_GRAY);
        Admin.setBackground(Color.WHITE);
        Admin.setBorder(b);
        Admin.setFont(new Font("Time New Roman", Font.PLAIN + Font.BOLD, 25));
        this.add(Admin);

        Waiter.setText("Waiter");
        Waiter.setBounds(210, 360, 150, 70);
        Waiter.addActionListener(this);
        Waiter.setBackground(Color.LIGHT_GRAY);
        Waiter.setBackground(Color.WHITE);
        Waiter.setBorder(b);
        Waiter.setFont(new Font("Time New Roman", Font.PLAIN + Font.BOLD, 25));
        this.add(Waiter);

        icon.setBounds(0, 0, 400, 400);
        this.add(icon);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Login l = new Login();
        if (e.getSource() == Waiter) {
            flag = 1;
            l.setTitle("LOGIN PAGE");
            l.setSize(400, 300);
            l.intializer();
            l.setLocationRelativeTo(null);
            l.getContentPane().setBackground(Color.darkGray);
            l.setLayout(null);
            l.setVisible(true);
            this.dispose();
            l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else if (e.getSource() == Admin) {
            flag = 2;
            l.setTitle("LOGIN PAGE");
            l.setSize(400, 300);
            l.intializer();
            l.setLocationRelativeTo(null);
            l.getContentPane().setBackground(Color.DARK_GRAY);
            l.setLayout(null);
            l.setVisible(true);
            this.dispose();
            l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}
