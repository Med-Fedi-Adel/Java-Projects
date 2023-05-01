package tp8;

import java.io.*;
import java.util.ArrayList;

public class CatEmployeesObj {
    public static void main(String[] args) {
        try{
            ArrayList<Employee> employees = new ArrayList<Employee>() ;
            try{
                File f = new File(args[0]) ;
                FileInputStream is = new FileInputStream(f) ;
                ObjectInputStream objis = new ObjectInputStream(is) ;
                employees =(ArrayList<Employee>) objis.readObject() ;
                objis.close();
            }catch (EOFException | FileNotFoundException e){
                e.printStackTrace();
            }

            for(Employee employee : employees){
                System.out.println(employee);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
