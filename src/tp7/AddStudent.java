package tp7;

import java.io.*;
import java.util.ArrayList;

public class AddStudent {
    public static void main(String[] args) {
        try {
            ArrayList<Student> students  = new ArrayList<Student>();
            File f = new File("tp7/students.ser");
            try {
                FileInputStream is = new FileInputStream(f);
                ObjectInputStream objis = new ObjectInputStream(is);
                students = (ArrayList<Student>) objis.readObject() ;
                objis.close();
            } catch (EOFException | FileNotFoundException e) {
                e.printStackTrace();
            }
            Student s = new Student(
                    Integer.parseInt(args[0]),
                    args[1],
                    args[2],
                    Double.parseDouble(args[3])
            );
            students.add(s);
            FileOutputStream os = new FileOutputStream(f);
            ObjectOutputStream objos = new ObjectOutputStream(os);
            objos.writeObject(students);
            objos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}