package tp4_linux_commands;

import java.io.File;

public class Touch {
    public static void main(String[] args) {
        File f = new File(args[0]) ;
        try{
            f.createNewFile() ;
        }catch(Exception e){
            System.out.println("Couldn't create file "+ f.getPath());
        }
    }
}
