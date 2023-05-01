package tp4_linux_commands;

import java.io.File;

public class Ls {
    public static void main(String[] args) {
        File f = new File("./") ;
        String[] l = f.list() ;
        for(String s : l){
            System.out.println(s);
        }
    }
}
