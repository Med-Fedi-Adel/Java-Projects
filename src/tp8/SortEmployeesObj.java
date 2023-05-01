package tp8;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class SortEmployeesObj {
    public static void main(String[] args) {
        try {
            ArrayList<Employee> employees = new ArrayList<Employee>();
            File f = new File(args[0]);
            try {
                FileInputStream is = new FileInputStream(f);
                ObjectInputStream objis = new ObjectInputStream(is);
                employees = (ArrayList<Employee>) objis.readObject();
                objis.close();
            } catch (EOFException | FileNotFoundException e) {
                e.printStackTrace();
            }
            Collections.sort(employees);
            FileOutputStream os = new FileOutputStream(f);
            ObjectOutputStream objos = new ObjectOutputStream(os);
            objos.writeObject(employees);
            objos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
