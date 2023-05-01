package tp1;

import javax.swing.*;
import java.awt.*;
import java.util.* ;
import java.util.Timer;

public class Homework {
    public static void main(String[] args) {
        JFrame f = new JFrame("HowmeWork") ;
        f.setBounds(50,50,915,412);
        f.setVisible(true);
        f.setLayout(new GridLayout(6,1,5,5));
        f.addWindowListener(new MyWindowListener());

        Panel p1 = new Panel(new GridLayout()) ;
        Panel p2 = new Panel(new GridLayout()) ;
        Panel p3 = new Panel(new GridLayout()) ;
        Panel p4 = new Panel(new GridLayout()) ;
        Panel p5 = new Panel(new GridLayout()) ;
        Panel p6 = new Panel(new GridLayout()) ;
        p1.setBackground(Color.GRAY);
        p2.setBackground(Color.LIGHT_GRAY);
        p3.setBackground(Color.GRAY);
        p4.setBackground(Color.LIGHT_GRAY);
        p5.setBackground(Color.GRAY);
        p6.setBackground(Color.LIGHT_GRAY);

        Label l1 = new Label(new Date().toString(),Label.CENTER) ;
        Label l2 = new Label("Java version: "+System.getProperty("java.version"),Label.CENTER) ;
        Label l3 = new Label("Java home: "+System.getProperty("java.home"),Label.CENTER) ;
        Label l4 = new Label("OS arch: "+System.getProperty("os.arch"),Label.CENTER) ;
        Label l5 = new Label("Username: "+System.getProperty("user.name"),Label.CENTER) ;
        Label l6 = new Label("CWD: "+System.getProperty("user.dir"),Label.CENTER) ;

        p1.add(l1) ;
        p2.add(l2) ;
       p3.add(l3) ;
       p4.add(l4) ;
       p5.add(l5) ;
       p6.add(l6) ;

       f.add(p1) ;
       f.add(p2) ;
       f.add(p3) ;
       f.add(p4) ;
       f.add(p5) ;
       f.add(p6) ;

       Timer timer =new Timer() ;
       timer.scheduleAtFixedRate(new UpdateTime(l1),0,100);
    }
}
