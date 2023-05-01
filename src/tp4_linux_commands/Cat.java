package tp4_linux_commands;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cat {
    public static void main(String[] args) {
        String filePath ;
        if(args.length == 0){
            Frame f = new Frame() ;
            FileDialog fd = new FileDialog(f,"Choose a file", FileDialog.LOAD);
            fd.setVisible(true);
            filePath= fd.getDirectory()+ fd.getFile() ;
        }else {
            filePath = args[0] ;
        }

        try{
            FileReader fr = new FileReader(filePath) ;
            BufferedReader br = new BufferedReader(fr) ;

            String line = br.readLine() ;
            while(line != null){
                System.out.println(line);
                line = br.readLine() ;
            }

            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            System.exit(0);
        }
    }
}
