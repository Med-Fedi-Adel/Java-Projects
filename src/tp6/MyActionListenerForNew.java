package tp6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListenerForNew implements ActionListener {

    private FileDialog fileDialog ;

    private TextArea text ;

    public MyActionListenerForNew(FileDialog fileDialog , TextArea text){
        this.fileDialog = fileDialog ;
        this.text = text  ;
    }

    public void actionPerformed(ActionEvent e){
        text.setText("");
        fileDialog.setDirectory(null);
        fileDialog.setFile(null);
    }
}
