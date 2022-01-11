package org.school.library.ui.components;


//from w  w w. j  ava 2  s  .  c o  m
import org.school.library.ui.components.tables.BooksTable;
import org.school.library.ui.components.tables.ClientsTable;
import org.school.library.ui.components.tables.TransactionsTable;
import org.school.library.views.Dashboard;

import javax.swing.*;

public class Menu {
    JMenuBar mb;

    JMenu fm, cm, bm, om, hm; // File, Options, Help

    JMenu opSubm, cCatSubm, bSubm; // Options Sub-Menu

    JMenuItem mi, cmi, bmi, bCatmi, newTransactionMi, transactionsListMi, staffMi, stdsMi;

    public JMenuBar renderMenu(JFrame closableFrame) {
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        Container cp = getContentPane();
//        cp.setLayout(new FlowLayout());
//
        mb = new JMenuBar();

//        setJMenuBar(mb);

        om = new JMenu("Operations");
        cm = new JMenu("Client");
        bm = new JMenu("Books");

        opSubm = new JMenu("SubOptions");
        opSubm.add(mi = new JMenuItem("Transactions"));
        opSubm.add(mi = new JMenuItem("Gamma"));
        opSubm.add(mi = new JMenuItem("Delta"));

        cmi = new JMenuItem("Client");
        cCatSubm = new JMenu("Client Categories");

        staffMi = new JMenuItem("STAFF");
        stdsMi = new JMenuItem("STUDENTS");

        cCatSubm.add(staffMi);
        cCatSubm.add(stdsMi);

        bmi= new JMenuItem("Book");
        bCatmi = new JMenuItem("Book Categories");

        newTransactionMi = new JMenuItem("New Transaction");
        transactionsListMi = new JMenuItem("Transactions");

        /*Handling actions*/
        staffMi.addActionListener(e->{
            closableFrame.dispose();
            try {
              new Dashboard(new ClientsTable().renderStaffTable());
            } catch (Exception ioException) {
                ioException.printStackTrace();
            }
        });

        stdsMi.addActionListener(e->{
            closableFrame.dispose();
            try {
                new Dashboard(new ClientsTable().renderStudentsTable());
            } catch (Exception ioException) {
                ioException.printStackTrace();
            }
        });

        bCatmi.addActionListener(e->{
            closableFrame.dispose();
            try {
                new Dashboard(new BooksTable().renderTable());
            } catch (Exception ioException) {
                ioException.printStackTrace();
            }
        });

        transactionsListMi.addActionListener(e->{
            closableFrame.dispose();
            try {
                new Dashboard(new TransactionsTable().renderTransactions());
            } catch (Exception ioException) {
                ioException.printStackTrace();
            }
        });

        om.add(newTransactionMi);
        om.add(transactionsListMi);
        cm.add(cmi);
        cm.add(cCatSubm);
        bm.add(bmi);
        bm.add(bCatmi);

        mb.add(cm);
        mb.add(bm);
        mb.add(om);
//        pack();

        return mb;
    }

}