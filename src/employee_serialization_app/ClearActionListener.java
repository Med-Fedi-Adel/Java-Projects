package employee_serialization_app;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearActionListener implements ActionListener {

    DefaultTableModel model ;
    public ClearActionListener(DefaultTableModel model){
        this.model = model ;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.setRowCount(0);
    }
}
