package tp4_linux_commands;

import java.io.File;

public class Wc {
    public static void main(String[] args) {
        File f = new File(args[0]) ;
        System.out.println(f.length());
    }
}
