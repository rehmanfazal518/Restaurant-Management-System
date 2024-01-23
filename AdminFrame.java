/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageme_system;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author Fazal
 */
public class AdminFrame extends JFrame implements ActionListener {

    public JButton Reset = new JButton();
    public JButton Save = new JButton();
    public JButton Exit = new JButton();
    public JButton Main = new JButton();
    public JTextField[] cb = new JTextField[19];
    public JTextField[] tf = new JTextField[19];
    public Border b = BorderFactory.createLineBorder(Color.WHITE, 4);
    public Color o = new Color(255, 140, 0);

    public void intializer() {
        for (int i = 0; i < cb.length; i++) {
            cb[i] = new JTextField(Frame.ItemName[i]);
            cb[i].setBackground(Color.black);
            cb[i].setForeground(Color.white);
            cb[i].setFont(Frame.fil);
            this.add(cb[i]);

            tf[i] = new JTextField();
            tf[i].setText(String.valueOf(Frame.price[i]));
            tf[i].setBackground(Color.LIGHT_GRAY);
            tf[i].setHorizontalAlignment(JTextField.CENTER);
            this.add(tf[i]);
        }

        cb[0].setBounds(30, 100, 250, 30);
        tf[0].setBounds(300, 100, 200, 30);

        cb[1].setBounds(30, 150, 250, 30);
        tf[1].setBounds(300, 150, 200, 30);

        cb[2].setBounds(30, 200, 250, 30);
        tf[2].setBounds(300, 200, 200, 30);

        cb[3].setBounds(30, 250, 250, 30);
        tf[3].setBounds(300, 250, 200, 30);

        cb[4].setBounds(30, 300, 250, 30);
        tf[4].setBounds(300, 300, 200, 30);

        cb[5].setBounds(30, 480, 250, 30);
        tf[5].setBounds(300, 480, 200, 30);

        cb[6].setBounds(30, 530, 250, 30);
        tf[6].setBounds(300, 530, 200, 30);

        cb[7].setBounds(30, 580, 250, 30);
        tf[7].setBounds(300, 580, 200, 30);

        cb[8].setBounds(30, 630, 250, 30);
        tf[8].setBounds(300, 630, 200, 30);

        cb[9].setBounds(550, 150, 250, 30);
        tf[9].setBounds(820, 150, 150, 30);

        cb[10].setBounds(550, 200, 250, 30);
        tf[10].setBounds(820, 200, 150, 30);

        cb[11].setBounds(550, 250, 250, 30);
        tf[11].setBounds(820, 250, 150, 30);

        cb[12].setBounds(550, 300, 250, 30);
        tf[12].setBounds(820, 300, 150, 30);

        cb[13].setBounds(1010, 100, 190, 30);
        tf[13].setBounds(1200, 100, 120, 30);

        cb[14].setBounds(1010, 150, 190, 30);
        tf[14].setBounds(1200, 150, 120, 30);

        cb[15].setBounds(1010, 200, 190, 30);
        tf[15].setBounds(1200, 200, 120, 30);

        cb[16].setBounds(1010, 250, 190, 30);
        tf[16].setBounds(1200, 250, 120, 30);

        cb[17].setBounds(1010, 430, 190, 30);
        tf[17].setBounds(1200, 430, 120, 30);

        cb[18].setBounds(1010, 550, 190, 30);
        tf[18].setBounds(1200, 550, 120, 30);

        Frame.l1.setBounds(20, 20, 500, 350);
        Frame.l1.setBorder(b);
        this.add(Frame.l1);

        Frame.lb.setText("Burgers");
        Frame.lb.setBounds(20, 30, 500, 50);
        Frame.lb.setHorizontalAlignment(JLabel.CENTER);
        Frame.lb.setBackground(Color.DARK_GRAY);
        Frame.lb.setFont(Frame.fi);
        Frame.lb.setOpaque(true);
        Frame.lb.setForeground(o);
        this.add(Frame.lb);

        Frame.l2.setBounds(20, 400, 500, 290);
        Frame.l2.setBorder(b);
        this.add(Frame.l2);

        Frame.ls.setText("SANDWUCH");
        Frame.ls.setBounds(20, 410, 500, 50);
        Frame.ls.setHorizontalAlignment(JLabel.CENTER);
        Frame.ls.setOpaque(true);
        Frame.ls.setBackground(Color.darkGray);
        Frame.ls.setFont(Frame.fi);
        Frame.ls.setForeground(o);
        this.add(Frame.ls);

        Frame.l3.setText("Fast Food");
        Frame.l3.setForeground(o);
        Frame.l3.setHorizontalAlignment(JLabel.CENTER);
        Frame.l3.setBackground(Color.darkGray);
        Frame.l3.setOpaque(true);
        Frame.l3.setFont(Frame.ft);
        Frame.l3.setBounds(540, 20, 440, 50);
        this.add(Frame.l3);

        Frame.l4.setBounds(540, 80, 440, 290);
        Frame.l4.setBorder(b);
        this.add(Frame.l4);

        Frame.lr.setText("ROLLS");
        Frame.lr.setBounds(540, 90, 440, 50);
        Frame.lr.setHorizontalAlignment(JLabel.CENTER);
        Frame.lr.setFont(Frame.fi);
        Frame.lr.setBackground(Color.darkGray);
        Frame.lr.setOpaque(true);
        Frame.lr.setForeground(o);
        this.add(Frame.lr);

        Frame.l5.setBounds(540, 400, 440, 290);
        Frame.l5.setBorder(b);
        this.add(Frame.l5);

        Frame.l6.setBounds(1000, 20, 340, 280);
        Frame.l6.setBorder(b);
        this.add(Frame.l6);

        Frame.ld.setText("FUNCTIONALITY");
        Frame.ld.setBounds(540, 410, 440, 50);
        Frame.ld.setHorizontalAlignment(JLabel.CENTER);
        Frame.ld.setFont(Frame.fi);
        Frame.ld.setOpaque(true);
        Frame.ld.setBackground(Color.darkGray);
        Frame.ld.setForeground(o);
        this.add(Frame.ld);

        Frame.Total.setText("Total");
        Frame.Total.setBounds(715, 500, 100, 50);
        Frame.Total.setHorizontalAlignment(JLabel.CENTER);
        Frame.Total.setOpaque(true);
        Frame.Total.setBackground(Color.darkGray);
        Frame.Total.setForeground(o);
        this.add(Frame.Total);

        Reset.setText("RESET");
        Reset.setBounds(550, 600, 100, 50);
        Reset.setBackground(Color.lightGray);
        Reset.setForeground(Color.BLACK);
        Reset.addActionListener(this);
        Reset.setFont(Frame.fil);
        this.add(Reset);

        Main.setText("Main");
        Main.setBounds(715, 600, 100, 50);
        Main.setBackground(Color.lightGray);
        Main.setForeground(Color.BLACK);
        Main.addActionListener(this);
        Main.setFont(Frame.fil);
        this.add(Main);

        Save.setText("Save");
        Save.setBounds(550, 500, 100, 50);
        Save.setBackground(Color.lightGray);
        Save.setForeground(Color.BLACK);
        Save.addActionListener(this);
        Save.setFont(Frame.fil);
        this.add(Save);

        Exit.setText("Exit");
        Exit.setBounds(880, 600, 100, 50);
        Exit.setBackground(Color.lightGray);
        Exit.setForeground(Color.BLACK);
        Exit.addActionListener(this);
        Exit.setFont(Frame.fil);
        this.add(Exit);

        Frame.lsh.setText("SHAWARMA");
        Frame.lsh.setBounds(1000, 30, 340, 50);
        Frame.lsh.setHorizontalAlignment(JLabel.CENTER);
        Frame.lsh.setFont(Frame.fi);
        Frame.lsh.setBackground(Color.DARK_GRAY);
        Frame.lsh.setOpaque(true);
        Frame.lsh.setForeground(o);
        this.add(Frame.lsh);

        Frame.l7.setBounds(1000, 350, 340, 335);
        Frame.l7.setBorder(b);
        this.add(Frame.l7);

        Frame.lcd.setText("DEALS");
        Frame.lcd.setBounds(1000, 360, 340, 50);
        Frame.lcd.setHorizontalAlignment(JLabel.CENTER);
        Frame.lcd.setFont(Frame.fi);
        Frame.lcd.setBackground(Color.darkGray);
        Frame.lcd.setOpaque(true);
        Frame.lcd.setForeground(o);
        this.add(Frame.lcd);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Reset) {
            for (int i = 0; i < cb.length; i++) {
                cb[i].setText(Frame.ItemName[i]);
                tf[i].setText(String.valueOf(Frame.price[i]));
            }
        } else if (e.getSource() == Exit) {
            System.exit(0);
        } else if (e.getSource() == Save) {
            try {
                FileWriter file = new FileWriter("Record.txt", false);
                for (int i = 0; i < cb.length; i++) {
                    file.write(cb[i].getText() + "," + tf[i].getText() + "\n");
                }
                file.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Successfully Saved", "Information", JOptionPane.INFORMATION_MESSAGE);
            Frame.Total.setText("Save Ho Gaya");
        } else if (e.getSource() == Main) {
            MainFrame MF = new MainFrame();
            MF.setTitle("THE BURGER LAB");
            MF.setSize(400, 500);
            MF.intializer();
            MF.setLocationRelativeTo(null);
            MF.getContentPane().setBackground(Color.BLACK);
            MF.setLayout(null);
            this.dispose();
            MF.setVisible(true);
            MF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

}
