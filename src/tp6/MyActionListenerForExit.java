package tp6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListenerForExit implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
