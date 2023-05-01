package tp5_app_txt_btns_open_save_new;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NewMouseListener extends MouseAdapter {

    FileDialog fileDialog ;

    TextArea text ;

    public NewMouseListener(FileDialog fileDialog , TextArea text){
        this.fileDialog = fileDialog ;
        this.text  = text ;
    }

    public void mouseClicked(MouseEvent e){
        text.setText("");
        fileDialog.setDirectory(null);
        fileDialog.setFile(null);
    }
}
