package tp8;

import java.io.*;
import java.util.ArrayList;

public class AddEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        try {
            File f = new File(args[0]);
            try {
                FileInputStream is = new FileInputStream(f);
                ObjectInputStream objis = new ObjectInputStream(is);
                employees = (ArrayList<Employee>) objis.readObject();
                objis.close();
            } catch (EOFException | FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            Employee e = new Employee(
                    args[1],
                    Integer.parseInt(args[2]),
                    Integer.parseInt(args[3])
            );
            employees.add(e);

            FileOutputStream os = new FileOutputStream(f);
            ObjectOutputStream objos = new ObjectOutputStream(os) ;
            objos.writeObject(employees);
            objos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
