package tp5_app_txt_btns_open_save_new;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveAsMouseListener  extends MouseAdapter {

    FileDialog fileDialog ;

    TextArea text ;

    public SaveAsMouseListener(FileDialog fileDialog , TextArea text){
        this.fileDialog = fileDialog ;
        this.text  = text  ;
    }

    public void mouseClicked(MouseEvent e){
        FileDialog saveFileDialog = new FileDialog((Frame) fileDialog.getParent(), "Save file" ,FileDialog.SAVE) ;
        saveFileDialog.setVisible(true);

        if(saveFileDialog.getFile() == null){
            return ;
        }
        File newFile = new File(FileManager.getPath(saveFileDialog)) ;
        try{
            newFile.createNewFile() ;
        }catch (IOException e1){
            System.out.println("Couldn't create file :"+newFile.getPath());
            return;
        }
        try{
            FileWriter fw = new FileWriter(newFile.getPath()) ;
            BufferedWriter bw = new BufferedWriter(fw) ;

            String content = text.getText() ;
            bw.write(content);
            bw.close();
        }catch (IOException e1){
            System.out.println("Couldn't wrtite to file "+ newFile.getPath());
            return;
        }

        fileDialog.setDirectory(saveFileDialog.getDirectory());
        fileDialog.setFile(saveFileDialog.getFile());
    }
}
