package tp0;

import java.awt.*;

public class Exemple {
    public static void main(String[] args) {
        Frame frameObj = new Frame() ;

        Button b1 = new Button("one") ;
        Button b2 = new Button("two") ;
        Button b3 = new Button("three") ;
        Button b4 = new Button("four") ;
        Button b5 = new Button("five") ;

        TextArea t = new TextArea(10,50) ;
        Choice ColorChooser = new Choice() ;

        ColorChooser.add("Green") ;
        ColorChooser.add("Red") ;
        ColorChooser.add("Blue") ;

        Scrollbar ranger = new Scrollbar(Scrollbar.HORIZONTAL,0,60,0,300) ;



        frameObj.add(b1) ;
        frameObj.add(b2) ;
        frameObj.add(b3) ;
        frameObj.add(b4) ;
        frameObj.add(b5) ;
        frameObj.add(ColorChooser) ;
        frameObj.add(new Checkbox("one",null,true)) ;
        frameObj.add(new Checkbox("two")) ;
        frameObj.add(ranger) ;
        frameObj.add(t) ;
        frameObj.setLayout(new GridLayout(2,6));
        frameObj.setSize(400,300);
        frameObj.setVisible(true);
    }
}
