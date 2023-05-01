package tp4_linux_commands;

import java.io.File;

public class Mv {
    public static void main(String[] args) {
        File f1 = new File(args[0]) ;
//        System.out.println(f1.getAbsolutePath()) ;
        File f2 = new File(args[1]) ;
        f1.renameTo(f2);
    }

}
