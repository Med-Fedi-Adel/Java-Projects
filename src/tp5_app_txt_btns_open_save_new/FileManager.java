package tp5_app_txt_btns_open_save_new;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileManager {

    public static String content(String filePath){
        String output = "" ;
        try{
            FileReader fr = new FileReader(filePath) ;
            BufferedReader br = new BufferedReader(fr) ;

            int i = br.read() ;
            while(i != -1){
                output+= (char) i ;
                i = br.read() ;
            }

            br.close();
        }catch (IOException e){
            output="" ;
        }
        return output ;
    }

    public static  String getPath(FileDialog fileDialog){
        return fileDialog.getDirectory()+ fileDialog.getFile() ;
    }

    public static void main(String[] args) {
        Frame frame = new Frame("File Manager") ;
        frame.setBounds(50,50,540,400);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.addWindowListener(new MyWindowListener());

        FileDialog fileDialog = new FileDialog(frame , "choose a file ", FileDialog.LOAD) ;
        fileDialog.setVisible(true);

        TextArea text = new TextArea(content(getPath(fileDialog)),20,70) ;

        frame.add(text) ;

        Button newFile = new Button("New") ;
        newFile.addMouseListener(new NewMouseListener(fileDialog,text));
        frame.add(newFile) ;

        Button openFile = new Button("Open") ;
        openFile.addMouseListener(new OpenMouseListener(fileDialog, text));
        frame.add(openFile);

        Button renameFile = new Button("Rename") ;
        renameFile.addMouseListener(new RenameMouseListener(fileDialog));
        frame.add(renameFile) ;

        Button saveFile = new Button("Save") ;
        saveFile.addMouseListener(new SaveMouseListener(fileDialog,text));
        frame.add(saveFile) ;

        Button saveFileAs = new Button("Save As") ;
        saveFileAs.addMouseListener(new SaveAsMouseListener(fileDialog,text));
        frame.add(saveFileAs) ;
    }
}
