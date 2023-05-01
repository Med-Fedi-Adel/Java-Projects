package tp0;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class Temp {
    public static void main(String[] args) {
        JFrame f = new JFrame() ;
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.setVisible(true);
        f.setBounds(20,30,400,320);
        f.setBackground(Color.GRAY);


        Label l1 = new Label("one") ;
        l1.setSize(100,100);
        l1.setBackground(Color.WHITE);
        f.add(l1);

        Label l2 = new Label("two") ;
        l2.setSize(100,200);
        l2.setBackground(Color.WHITE);
        f.add(l2);

        Label l3 = new Label("three") ;
        l3.setSize(100,200);
        l3.setBackground(Color.WHITE);
        f.add(l3);

        Label l4 = new Label("four") ;
        l4.setSize(100,200);
        l4.setBackground(Color.WHITE);
        f.add(l4);

        Label l5 = new Label("five") ;
        l5.setSize(100,200);
        l5.setBackground(Color.WHITE);
        f.add(l5);
    }
}
