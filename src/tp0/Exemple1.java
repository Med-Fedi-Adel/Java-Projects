package tp0;

import java.awt.*;

public class Exemple1 {
    public static void main(String[] args) {
        Frame f = new Frame() ;
        Panel p = new Panel(new BorderLayout()) ;
        Button b1 = new Button("1") ;

        TextArea t = new TextArea(10,50) ;
        Choice ColorChooser = new Choice() ;

        ColorChooser.add("Green");
        ColorChooser.add("Red");
        ColorChooser.add("Blue");
        Scrollbar ranger = new Scrollbar(Scrollbar.HORIZONTAL,0,60,0,300) ;

        p.add(b1,BorderLayout.NORTH) ;

        p.add(ColorChooser,BorderLayout.WEST) ;
        p.add(new Checkbox("one",null,true),BorderLayout.EAST) ;

        p.add(ranger,BorderLayout.SOUTH) ;
        p.add(t,BorderLayout.CENTER) ;
        f.add(p) ;
        f.setSize(400,300);
        f.setVisible(true);
        f.addWindowListener(new MyWindowListener());


    }
}
