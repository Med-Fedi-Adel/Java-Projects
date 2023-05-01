package tp7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CatText {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader(args[0]);
            BufferedReader br = new BufferedReader(fr) ;

            String line = br.readLine() ;
            while(line != null){
                System.out.println(line);
                line=br.readLine() ;
            }

            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
