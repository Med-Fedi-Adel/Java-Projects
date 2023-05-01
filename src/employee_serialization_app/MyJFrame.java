package employee_serialization_app;

import employee_serialization_app.AddActionListener;
import employee_serialization_app.ClearActionListener;
import employee_serialization_app.EmployeeTable;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class MyJFrame extends JFrame {

    JPanel configPanel = new JPanel();

    JPanel tablePanel = new JPanel();

    JButton addButton = new JButton("Add");

    JButton clearButton = new JButton("Clear");

    JTextField idField = new JTextField(10);

    JTextField nameField = new JTextField(10);

    JTextField addressField = new JTextField(10);
    EmployeeTable table = new EmployeeTable(readEmployees());

    public MyJFrame() {
        super("Employees");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setVisible(true);
        setLayout(new BorderLayout());

        add(configPanel, BorderLayout.NORTH);

        configPanel.add(new JLabel("ID :"));
        configPanel.add(idField);

        configPanel.add(new JLabel("Name :"));
        configPanel.add(nameField);

        configPanel.add(new JLabel("Address :"));
        configPanel.add(addressField);

        // ACTION LISTERNERS DONT FORGET IT
        addButton.addActionListener(new AddActionListener(this));
        configPanel.add(addButton);

        clearButton.addActionListener(new ClearActionListener(table.model));
        configPanel.add(clearButton);

        add(tablePanel, BorderLayout.CENTER);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(700, 600));
        tablePanel.add(scrollPane);
        tablePanel.setBackground(Color.GRAY);
    }


    public static ArrayList<Employee> readEmployees() {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        try {
            File f = new File("employee_serialization_app/employees.ser");
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

        } catch (Exception e) {
            e.printStackTrace();
        }
        return employees;
    }

    public static void writeEmployees(ArrayList<Employee> employees){
        try{
            File f = new File("employee_serialization_app/employees.ser") ;
            try{
                FileOutputStream os = new FileOutputStream(f) ;
                ObjectOutputStream objos = new ObjectOutputStream(os) ;
                objos.writeObject(employees);
                objos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
