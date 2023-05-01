package tp7;

import java.io.*;
import java.util.ArrayList;

public class CatStudent {
    public static void main(String[] args) {
        try {
            ArrayList<Student> als = new ArrayList<Student>();
            try {
                File f = new File(args[0]);
                FileInputStream is = new FileInputStream(f);
                ObjectInputStream objis = new ObjectInputStream(is);
                ArrayList<?> al = (ArrayList<?>) objis.readObject();
                for (Object object : al) {
                    als.add((Student) object);
                }
                objis.close();
            } catch (EOFException e) {
            } catch (FileNotFoundException e) {
            }
            for (Student student : als) {
                System.out.println(student);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
