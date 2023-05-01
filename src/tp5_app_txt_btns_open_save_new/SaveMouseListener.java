package tp5_app_txt_btns_open_save_new;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;

public class SaveMouseListener extends MouseAdapter {

    FileDialog fileDialog ;
    TextArea text  ;

    public SaveMouseListener(FileDialog fileDialog , TextArea text){
        this.fileDialog = fileDialog ;
        this.text = text ;
    }

    public void mouseClicked(MouseEvent e){
        File  currentFile = new File(FileManager.getPath(fileDialog)) ;
        try{
            FileWriter fw = new FileWriter(currentFile.getPath()) ;
            BufferedWriter bw = new BufferedWriter(fw) ;

            String content = text.getText() ;

            bw.write(content);
            bw.close();
        }catch (IOException e1){
            System.out.println("Couldn't write to file "+currentFile.getPath());
        }
    }
}
