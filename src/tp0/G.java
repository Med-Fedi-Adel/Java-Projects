package tp0;

import javax.swing.*;
import java.awt.*;

public class G {

    public static void main(String[] args) {
        JFrame frameObj = new JFrame() ;
        JButton b1 = new JButton("one") ;
        JButton b2 = new JButton("two") ;
        JButton b3 = new JButton("three") ;
        JButton b4 = new JButton("four") ;
        JButton b5 = new JButton("five") ;
        Button b6 = new Button("six") ;

        b1.setPreferredSize(new Dimension(100,50));
        b2.setPreferredSize(new Dimension(100,100));
        b3.setPreferredSize(new Dimension(100,45));
        b4.setPreferredSize(new Dimension(150,40));
        b5.setPreferredSize(new Dimension(60,60));
        b6.setPreferredSize(new Dimension(60,60));

        // adding the buttons to frame
        frameObj.add(b1) ;
        frameObj.add(b2) ;
        frameObj.add(b3) ;
        frameObj.add(b4) ;
        frameObj.add(b5) ;
        frameObj.add(b6);

        frameObj.setLayout(new GridLayout(2,3));
        frameObj.setSize(300,300);
        frameObj.setVisible(true);
    }
}
