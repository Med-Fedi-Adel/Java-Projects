package tp1;

import java.awt.*;
import java.util.Date;
import java.util.TimerTask;

public class UpdateTime extends TimerTask {

    private final Label l ;

    public UpdateTime(Label l ){
        this.l = l ;
    }

    public void run(){
        l.setText(new Date().toString());
    }
}
