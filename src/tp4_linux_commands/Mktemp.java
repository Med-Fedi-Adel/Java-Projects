package tp4_linux_commands;

import java.io.File;

public class Mktemp {
    public static void main(String[] args) {
        String[] config = args[0].split("[.M]",2);
        try{
            File.createTempFile(config[0], (config.length >1 ) ? config[1] : null) ;
        }catch (Exception e){
            System.out.println("Couldn't create temp "+ config[0] +"." + ((config.length >1 ) ? config[1] : "tmp"));
        }
    }
}
