package tp4_linux_commands;

import java.io.File;
import java.util.Date;

public class Stat {
    public static void main(String[] args) {
        File f = new File(args[0]) ;
        System.out.println(new Date(f.lastModified()));
    }
}
