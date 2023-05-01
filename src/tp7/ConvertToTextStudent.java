package tp7;

import java.io.*;
import java.util.ArrayList;

public class ConvertToTextStudent {
    public static void main(String[] args) {
        try{
            ArrayList<Student> als = new ArrayList<Student>() ;
            try {
                File fi = new File(args[0]);
                FileInputStream fis = new FileInputStream(fi);
                ObjectInputStream objis = new ObjectInputStream(fis);
                ArrayList<?> al = (ArrayList<?>) objis.readObject();
                objis.close();
                for (Object object : al) {
                    als.add((Student) object);
                }
            }catch(EOFException e){
                    System.out.println("Input file is empty");
                    System.exit(0);
                }
            catch (FileNotFoundException e){
                System.out.println("File not found");
                System.exit(0);
            }
            File fo = new File(args[1]) ;
            FileWriter fw = new FileWriter(fo) ;
            BufferedWriter bw = new BufferedWriter(fw) ;
            for (Student student : als){
                bw.write(student.toString());
            }
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
