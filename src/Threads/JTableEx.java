package Threads;

import javax.swing.*;
import javax.swing.table.*;

class JTableEx extends JFrame
{
    public JTableEx(String[] args){
//        int[] seconds = {Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])};
//        final  Object[][]lignes = {
//              {seconds[0], " Ahmed", " SLIMANI", " 10-03-1983"},
//                {seconds[1], "Mohamed", "BEN SALAH", "12-10-1966"},
//                {seconds[2], "Sami", "Ben ALI", "15-03-1980"}
//        };
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JTable lignes = new JTable(new DefaultTableModel(new Object[]{"Nins", "Prénom", "Nom", "DN"}, args.length));

        for(int i =0 ; i<args.length;i++){
            int s = Integer.parseInt(args[i]) ;
            lignes.getModel().setValueAt(s, i, 0);
            lignes.getModel().setValueAt("Thread", i, 1);
            lignes.getModel().setValueAt("N°"+i, i, 2);
            lignes.getModel().setValueAt(" 24-4-2023", i, 3);
        }


        JScrollPane scrollPane = new JScrollPane(lignes);
        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);

//        final Object[] colonnesNom={"Nins", "Prénom", "Nom", "DN"};
//        TableModel dataModel = new AbstractTableModel(){
//            public int getColumnCount(){return colonnesNom.length;}
//            public int getRowCount(){return lignes.getRowCount();}
//            public Object getValueAt(int l, int c)
//            {return lignes.getModel().getValueAt(l,c);}
//            public String getColumnName(int col)
//            {return (String)colonnesNom[col];}
//            public Class getColumnClass(int cl)
//            {return getValueAt(0,cl).getClass();}
//        };
//        // fin de définition de AbstractTableModel
//        JTable table = new JTable(dataModel);
//        JScrollPane scrollpane = new JScrollPane(table);
//        scrollpane.setPreferredSize(new Dimension(500, 300));
//        this.getContentPane().add(scrollpane);
//        this.pack();
//        this.setVisible(true);

        for (int i = 0; i < args.length; i++) {
            int finalI = i;
            Thread thread = new Thread(() -> {
                int remainingSeconds =Integer.parseInt(args[finalI]) ;
                while (remainingSeconds >= 0) {
                    lignes.getModel().setValueAt(remainingSeconds, finalI, 0);
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
    public static void main(String[] args) {
        new JTableEx(args);

    }
}

/*
 **/