package Threads;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ThreadTimerExample {

    public static void main(String[] args) {
        int[] seconds = {Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])};

        JFrame frame = new JFrame();
        JTable table = new JTable(new DefaultTableModel(new Object[]{"Nins", "Prénom", "Nom", "DN"}, 3)) ;
//
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);

        for (int i = 0; i < seconds.length; i++) {
            int finalI = i;
            Thread thread = new Thread(() -> {
                int remainingSeconds = seconds[finalI];
                while (remainingSeconds >= 0) {
                    table.getModel().setValueAt(remainingSeconds, 0, finalI);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    remainingSeconds--;
                }
            });
            thread.start();
        }
    }

}