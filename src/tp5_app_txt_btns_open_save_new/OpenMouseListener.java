package tp5_app_txt_btns_open_save_new;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OpenMouseListener extends MouseAdapter {

    FileDialog fileDialog ;

    TextArea text  ;

    public OpenMouseListener(FileDialog fileDialog , TextArea text){
        this.fileDialog = fileDialog ;
        this.text = text ;
    }

    public void mouseClicked(MouseEvent e){
        fileDialog.setVisible(true);
        if(fileDialog.getFile() == null){
            return;
        }
        text.setText(FileManager.content(FileManager.getPath(fileDialog)));
    }
}
