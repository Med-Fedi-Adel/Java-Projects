package tp4_linux_commands;

import java.io.File;

public class Mkdir {
    public static void main(String[] args) {
        File f = new File(args[0]) ;
        f.mkdir() ;
    }
}
