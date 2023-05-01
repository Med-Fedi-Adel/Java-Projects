package employee_serialization_app;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class EmployeeTable extends JTable {

    DefaultTableModel model ;
    public EmployeeTable(ArrayList<Employee> employees){
         model = new DefaultTableModel() ;
        model.addColumn("Id");
        model.addColumn("Name");
        model.addColumn("Address");

        for(Employee employee : employees){
            model.addRow(new Object[]{employee.getId(),employee.getName(),employee.getAddress()});
        }
        setModel(model) ;
        getColumnModel().getColumn(0).setPreferredWidth(50);
        getColumnModel().getColumn(1).setPreferredWidth(150);
        getColumnModel().getColumn(2).setPreferredWidth(250);
    }

    public void refreshTable(ArrayList<Employee> employees){
        model.setRowCount(0);
        for (Employee employee : employees){
            model.addRow(new Object[]{employee.getId(),employee.getName(),employee.getAddress()});
        }
    }
}
