/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manageme_system;

import java.awt.Color;
import javax.swing.JFrame;
/**
 *
 * @author Fazal
 */
public class Manageme_System {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainFrame MF = new MainFrame();
        MF.setTitle("THE BURGER LAB");
        MF.setSize(400, 500);
        MF.intializer();
        MF.setLocationRelativeTo(null);
        MF.getContentPane().setBackground(Color.BLACK);
        MF.setLayout(null);
        MF.setVisible(true);
        MF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}