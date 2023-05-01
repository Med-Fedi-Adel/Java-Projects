package tp4_linux_commands;

import java.io.File;

public class Rm {
    public static void main(String[] args) {
        File f = new File(args[0]) ;
        f.delete()  ;
    }
}
