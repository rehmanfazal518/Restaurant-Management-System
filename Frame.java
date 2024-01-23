/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageme_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author Fazal
 */
public class Frame extends JFrame implements ItemListener, ActionListener {

    public static JLabel l1 = new JLabel(); // label 1
    public static JLabel l2 = new JLabel();
    public static JLabel l3 = new JLabel();
    public static JLabel l4 = new JLabel();
    public static JLabel l5 = new JLabel();
    public static JLabel l6 = new JLabel();
    public static JLabel l7 = new JLabel();
    public static JLabel lb = new JLabel();
    public static JLabel ls = new JLabel();
    public static JLabel lr = new JLabel();
    public static JLabel Total = new JLabel();
    public static JLabel ld = new JLabel();
    public static JLabel lsh = new JLabel();
    public static JLabel lcd = new JLabel();
    public static JLabel deal1 = new JLabel();
    public static JLabel deal2 = new JLabel();
    public static JButton Reset = new JButton();
    public static JButton Save = new JButton();
    public static JButton Exit = new JButton();
    public static JButton Main = new JButton();
    public static JLabel lTb = new JLabel();
    public static JCheckBox[] cb = new JCheckBox[19];
    public JTextField tfTb = new JTextField();
    public static JTextField[] tf = new JTextField[19];
    public static String[] ItemName = new String[19];
    public static String[] price = new String[20];
    public static int TotalSale = 0;
    public static ArrayList<String> Details = new ArrayList<>();
    public static ArrayList<String> Quantity = new ArrayList<>();
    public static ArrayList<String> Tota = new ArrayList<>();
    public String Date;
    public static Font ft = new Font("Time New Roman", Font.BOLD, 50);
    public static Font fi = new Font("Time New Roman", Font.BOLD, 40);
    public static Font fil = new Font("Time New Roman", Font.BOLD, 15);
    public static Border b = BorderFactory.createLineBorder(Color.WHITE, 4);
    public static Color o = new Color(255, 140, 0);

    public void storing() {
        try {
            File f = new File("Record.txt");
            Scanner input = new Scanner(f);
            int i = 0;
            while (input.hasNext()) {
                String ln = input.nextLine();
                String[] arr = ln.split(",");
                ItemName[i] = arr[0];
                price[i] = arr[1];
                i++;
            }
            input.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void intializer() {
        DateTimeFormatter date = DateTimeFormatter.ofPattern("DD/MM/YYYY");
        LocalDateTime now = LocalDateTime.now();
        Date = date.format(now);

        for (int i = 0; i < cb.length; i++) {
            cb[i] = new JCheckBox(ItemName[i], false);
            cb[i].setBackground(Color.black);
            cb[i].setForeground(Color.white);
            cb[i].addItemListener(this);
            cb[i].setFont(fil);
            this.add(cb[i]);

            tf[i] = new JTextField();
            tf[i].setText("");
            tf[i].setBackground(Color.LIGHT_GRAY);
            tf[i].setHorizontalAlignment(JTextField.CENTER);
            this.add(tf[i]);
        }

        Disable();

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

        deal1.setText("<html>2 ZINGER BURGER<br>1 BBQ SANDWICH<br>1 BBQ ROLL<br>1 ZINGER SHAWARMA");
        deal1.setBounds(1030, 455, 180, 100);
        deal1.setFont(new Font("Time New Roman", Font.BOLD, 15));
        deal1.setForeground(Color.darkGray);
        this.add(deal1);

        deal2.setText("<html>4 ZINGER BURGER<br>2 BBQ SANDWICH<br>2 BBQ ROLL<br>2 ZINGER SHAWARMA");
        deal2.setBounds(1030, 575, 180, 100);
        deal2.setFont(new Font("Time New Roman", Font.BOLD, 15));
        deal2.setForeground(Color.darkGray);
        this.add(deal2);

        l1.setBounds(20, 20, 500, 350);
        l1.setBorder(b);
        this.add(l1);

        lb.setText("BURGERS");
        lb.setBounds(20, 30, 500, 50);
        lb.setHorizontalAlignment(JLabel.CENTER);
        lb.setBackground(Color.DARK_GRAY);
        lb.setFont(fi);
        lb.setOpaque(true);
        lb.setForeground(o);
        this.add(lb);

        l2.setBounds(20, 400, 500, 290);
        l2.setBorder(b);
        this.add(l2);

        ls.setText("SANDWUCH");
        ls.setBounds(20, 410, 500, 50);
        ls.setHorizontalAlignment(JLabel.CENTER);
        ls.setOpaque(true);
        ls.setBackground(Color.darkGray);
        ls.setFont(fi);
        ls.setForeground(o);
        this.add(ls);

        l3.setText("THE BURGER LAB");
        l3.setForeground(Color.WHITE);
        l3.setHorizontalAlignment(JLabel.CENTER);
        l3.setBackground(Color.darkGray);
        l3.setOpaque(true);
        l3.setFont(new Font("Time New Roman", Font.BOLD, 40));
        l3.setBounds(540, 20, 440, 50);
        this.add(l3);

        l4.setBounds(540, 80, 440, 290);
        l4.setBorder(b);
        this.add(l4);

        lr.setText("ROLLS");
        lr.setBounds(540, 90, 440, 50);
        lr.setHorizontalAlignment(JLabel.CENTER);
        lr.setFont(fi);
        lr.setBackground(Color.darkGray);
        lr.setOpaque(true);
        lr.setForeground(o);
        this.add(lr);

        l5.setBounds(540, 400, 440, 290);
        l5.setBorder(b);
        this.add(l5);

        l6.setBounds(1000, 20, 340, 280);
        l6.setBorder(b);
        this.add(l6);

        ld.setText("FUNCTIONALITY");
        ld.setBounds(540, 410, 440, 50);
        ld.setHorizontalAlignment(JLabel.CENTER);
        ld.setFont(fi);
        ld.setOpaque(true);
        ld.setBackground(Color.darkGray);
        ld.setForeground(o);
        this.add(ld);

        Total.setText("");
        Total.setBounds(715, 500, 100, 50);
        Total.setHorizontalAlignment(JLabel.CENTER);
        Total.setOpaque(true);
        Total.setBackground(Color.darkGray);
        Total.setForeground(o);
        this.add(Total);

        lTb.setText("Table No");
        lTb.setBounds(870, 485, 100, 40);
        lTb.setBackground(Color.black);
        lTb.setForeground(Color.white);
        lTb.setFont(fil);
        this.add(lTb);

        tfTb.setText("");
        tfTb.setBounds(870, 520, 100, 30);
        tfTb.setHorizontalAlignment(JTextField.CENTER);
        this.add(tfTb);

        Reset.setText("RESET");
        Reset.setBounds(550, 600, 100, 50);
        Reset.setBackground(Color.lightGray);
        Reset.setForeground(Color.BLACK);
        Reset.addActionListener(this);
        Reset.setFont(fil);
        this.add(Reset);

        Main.setText("Main");
        Main.setBounds(715, 600, 100, 50);
        Main.setBackground(Color.lightGray);
        Main.setForeground(Color.BLACK);
        Main.addActionListener(this);
        Main.setFont(fil);
        this.add(Main);

        Save.setText("Save");
        Save.setBounds(550, 500, 100, 50);
        Save.setBackground(Color.lightGray);
        Save.setForeground(Color.BLACK);
        Save.addActionListener(this);
        Save.setFont(fil);
        this.add(Save);

        Exit.setText("Exit");
        Exit.setBounds(870, 600, 100, 50);
        Exit.setBackground(Color.lightGray);
        Exit.setForeground(Color.BLACK);
        Exit.addActionListener(this);
        Exit.setFont(fil);
        this.add(Exit);

        lsh.setText("SHAWARMA");
        lsh.setBounds(1000, 30, 340, 50);
        lsh.setHorizontalAlignment(JLabel.CENTER);
        lsh.setFont(fi);
        lsh.setBackground(Color.DARK_GRAY);
        lsh.setOpaque(true);
        lsh.setForeground(o);
        this.add(lsh);

        l7.setBounds(1000, 350, 340, 340);
        l7.setBorder(b);
        this.add(l7);

        lcd.setText("Deals");
        lcd.setBounds(1000, 360, 340, 50);
        lcd.setHorizontalAlignment(JLabel.CENTER);
        lcd.setFont(fi);
        lcd.setBackground(Color.darkGray);
        lcd.setOpaque(true);
        lcd.setForeground(o);
        this.add(lcd);
    }

    public void Disable() {
        for (int i = 0; i < tf.length; i++) {
            tf[i].setText("");
            tf[i].disable();

        }
    }

    public void unselect() {
        for (int i = 0; i < tf.length; i++) {
            cb[i].setSelected(false);
        }
        Total.setText("");
    }

//Event Handling 
    @Override
    public void itemStateChanged(ItemEvent e) {
        for (int i = 0; i < Frame.cb.length; i++) {
            if (Frame.cb[i].isSelected()) {
                Frame.tf[i].enable();
            } else {
                Frame.tf[i].setText("");
                Frame.tf[i].disable();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int sum = 0, val;
        if (e.getSource() == Reset) {
            Disable();
            unselect();
            tfTb.setText("");
            lTb.setText("Table No");
            lTb.setBounds(870, 485, 100, 40);
            Details.clear();
            Quantity.clear();
            Tota.clear();
        } else if (e.getSource() == Exit) {
            try {
                FileWriter file = new FileWriter("TotalSale.txt", true);
                file.write(Date + "," + TotalSale + "\n");
                file.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            System.exit(0);
        } else if (e.getSource() == Save) {
            Bill B = new Bill();
            for (int i = 0; i < cb.length; i++) {
                if (cb[i].isSelected()) {
                    val = Integer.parseInt(tf[i].getText());
                    Details.add(cb[i].getText());
                    Quantity.add(tf[i].getText());
                    Tota.add(String.valueOf(val * Integer.parseInt(price[i])));
                    sum = sum + (val * Integer.parseInt(price[i]));
                }
            }
            Total.setText(String.valueOf(sum + " Rs"));
            lTb.setText("Table No " + tfTb.getText());
            lTb.setBounds(725, 455, 100, 50);
            TotalSale = TotalSale + sum;
            B.setTitle("Main");
            B.setSize(400, 300);
            B.intializer();
            B.setLocationRelativeTo(null);
            B.setLayout(null);
            B.setVisible(true);
        } else if (e.getSource() == Main) {
            try {
                FileWriter file = new FileWriter("TotalSale.txt", true);
                file.write(Date + "," + TotalSale + "\n");
                file.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
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
