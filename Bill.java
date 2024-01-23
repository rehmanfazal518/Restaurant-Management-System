/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageme_system;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Fazal
 */
public class Bill extends JFrame {

    JLabel I = new JLabel();
    JLabel Q = new JLabel();
    JLabel T = new JLabel();
    JLabel Ta = new JLabel();
    JLabel[] Items = new JLabel[20];
    JLabel[] Quantity = new JLabel[20];
    JLabel[] Total = new JLabel[20];

    public void intializer() {
        int i;
        for (i = 0; i < Frame.Details.size(); i++) {

            Items[i] = new JLabel(Frame.Details.get(i));
            Items[i].setBounds(10, 32 + (i * 15), 180, 10);
            this.add(Items[i]);

            Quantity[i] = new JLabel(Frame.Quantity.get(i));
            Quantity[i].setBounds(200,32 + (i * 15), 50, 10);
            this.add(Quantity[i]);

            Total[i] = new JLabel(Frame.Tota.get(i));
            Total[i].setBounds(260, 32 + (i * 15), 70, 10);
            this.add(Total[i]);
        }

        Items[i] = new JLabel("TOTAL");
        Items[i].setBounds(10, 22 + ((i +1)* 15), 180, 10);
        this.add(Items[i]);

        Total[i] = new JLabel(Frame.Total.getText());
        Total[i].setBounds(260, 22 + ((i + 1) * 15), 50, 10);
        this.add(Total[i]);

        I.setText("Items");
        I.setBounds(10, 20, 180, 10);
        I.setOpaque(true);
        this.add(I);

        Q.setText("Quantity");
        Q.setBounds(200, 20, 50, 10);
        this.add(Q);

        T.setText("Total");
        T.setBounds(260, 20, 70, 10);
        this.add(T);

        Ta.setText(Frame.lTb.getText());
        Ta.setBounds(0, 10, 400, 10);
        Ta.setHorizontalAlignment(JLabel.CENTER);
        this.add(Ta);
    }
}
