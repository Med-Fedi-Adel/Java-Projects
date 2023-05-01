package tp5_app_txt_btns_open_save_new;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class RenameMouseListener extends MouseAdapter {

    FileDialog fileDialog ;

    public RenameMouseListener(FileDialog fileDialog){
        this.fileDialog = fileDialog ;
    }

    public void mouseClicked(MouseEvent e){
        FileDialog saveFileDialog = new FileDialog((Frame) fileDialog.getParent(),"Save file" , FileDialog.SAVE) ;
        saveFileDialog.setVisible(true);
        if(saveFileDialog.getFile()==null){
            return ;
        }
        File oldFile = new File(FileManager.getPath(fileDialog)) ;
        File newFile = new File(FileManager.getPath(saveFileDialog));
        oldFile.renameTo(newFile) ;
        fileDialog.setDirectory(saveFileDialog.getDirectory());
        fileDialog.setFile(saveFileDialog.getFile());
    }
}
