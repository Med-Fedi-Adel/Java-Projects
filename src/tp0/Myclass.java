package tp0;

import javax.swing.*;
import java.awt.*;

public class Myclass {
    public static void main(String[] args) {
        JFrame f = new JFrame() ;
        f.setVisible(true);
        f.setBounds(20,30,400,320) ;
        f.setBackground(Color.GRAY);
        JButton b = new JButton("Hello") ;
        f.add(b) ;
        f.setLayout(new GridLayout(3,2));
        f.add(new Checkbox("one",null,true)) ;
        f.add(new Checkbox("two")) ;
        f.add(new Checkbox("three")) ;
        Choice ColorChooser = new Choice() ;
        ColorChooser.add("Green") ;
        ColorChooser.add("Red");
        ColorChooser.add("Blue");

        f.add(ColorChooser) ;
        Scrollbar ranger = new Scrollbar(Scrollbar.HORIZONTAL,0,60,0,300) ;
        f.add(ranger) ;
    }
}
