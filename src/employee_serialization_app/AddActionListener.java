package employee_serialization_app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AddActionListener implements ActionListener {

    MyJFrame frame ;

    public AddActionListener(MyJFrame frame){
        this.frame = frame ;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<Employee> employees = MyJFrame.readEmployees() ;
        Employee employee = new Employee(Integer.parseInt(frame.idField.getText()),
                frame.nameField.getText(),
                frame.addressField.getText()
        );
        employees.add(employee);
        MyJFrame.writeEmployees(employees);
        frame.idField.setText("");
        frame.nameField.setText("");
        frame.addressField.setText("");

        frame.table.refreshTable(employees);
        System.out.println("employee_serialization_app.Employee Added");
    }
}
