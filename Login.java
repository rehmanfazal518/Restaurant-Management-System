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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;
/**
 *
 * @author Fazal
 */
public class Login extends JFrame implements ActionListener {
    Frame WF = new Frame();
    AdminFrame AF = new AdminFrame();
    JLabel li = new JLabel();
    JLabel lun = new JLabel();
    JLabel lup = new JLabel();
    JLabel linv = new JLabel();
    JTextField tun = new JTextField();
    JPasswordField tup = new JPasswordField();
    JButton B = new JButton();
    JButton R = new JButton();
    public  Border b = BorderFactory.createLineBorder(Color.BLACK, 5);

    public void intializer() {
        li.setText("LOGIN");
        li.setBounds(0, 15, 400, 50);
        li.setForeground(Color.WHITE);
        li.setFont(new Font("Time New Roman", Font.PLAIN + Font.BOLD, 50));
        li.setHorizontalAlignment(JLabel.CENTER);
        this.add(li);

        linv.setText("");
        linv.setBounds(0, 70, 400, 15);
        linv.setFont(new Font("Time New Roman", Font.PLAIN, 15));
        linv.setHorizontalAlignment(JLabel.CENTER);
        linv.setForeground(Color.red);
        this.add(linv);

        lun.setText("User Name");
        lun.setBounds(20, 80, 150, 40);
        lun.setForeground(Color.WHITE);
        lun.setFont(new Font("Time New Roman", Font.PLAIN + Font.BOLD, 25));
        this.add(lun);

        tun.setText("");
        tun.setBounds(200, 90, 160, 25);
        tun.setFont(new Font("Time New Roman", Font.PLAIN, 18));
        tun.setBackground(Color.lightGray);
        this.add(tun);

        lup.setText("Password");
        lup.setBounds(20, 130, 150, 40);
        lup.setFont(new Font("Time New Roman", Font.PLAIN + Font.BOLD, 25));
        lup.setForeground(Color.WHITE);
        this.add(lup);

        tup.setText("");
        tup.setBounds(200, 140, 160, 25);
        tup.setFont(new Font("Time New Roman", Font.PLAIN, 18));
        tup.setBackground(Color.lightGray);
        this.add(tup);

        B.setText("Submit");
        B.setBounds(20, 180, 150, 40);
        B.addActionListener(this);
        B.setBackground(Color.LIGHT_GRAY);
        B.setForeground(Color.BLACK);
        B.setBorder(b);
        B.setFont(new Font("Time New Roman", Font.PLAIN + Font.BOLD, 25));
        this.add(B);

        R.setText("Reset");
        R.setBounds(210, 180, 150, 40);
        R.addActionListener(this);
        R.setBackground(Color.LIGHT_GRAY);
        R.setForeground(Color.BLACK);
        R.setBorder(b);
        R.setFont(new Font("Time New Roman", Font.PLAIN + Font.BOLD, 25));
        this.add(R);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == B) {
            if ("fazal".equals(tun.getText()) && "123".equals(tup.getText()) && MainFrame.flag==1) {
                WF.setExtendedState(JFrame.MAXIMIZED_BOTH);
                WF.setTitle("THE BURGER LAB");
                WF.storing();
                WF.intializer();
                WF.getContentPane().setBackground(Color.BLACK);
                WF.setLayout(null);
                WF.setVisible(true);
                this.dispose();
                WF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            else if ("Admin".equals(tun.getText()) && "123".equals(tup.getText()) && MainFrame.flag==2) {
                    AF.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    AF.setTitle("THE BURGER LAB");
                    WF.storing();
                    AF.intializer();
                    AF.getContentPane().setBackground(Color.BLACK);
                    AF.setLayout(null);
                    AF.setVisible(true);
                    this.dispose();
                    AF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            else {
                linv.setText("Invalid UserName Or Password");
        }
        }
        
        else if (e.getSource() == R) {
            tun.setText("");
            tup.setText("");
            linv.setText("");
        }
    }
}
