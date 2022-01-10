package org.school.library.ui.components;


//from w  w w. j  ava 2  s  .  c o  m
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu {
    JMenuBar mb;

    JMenu fm, cm, bm, om, hm; // File, Options, Help

    JMenu opSubm, cCatSubm, bSubm; // Options Sub-Menu

    JMenuItem mi, cmi, bmi, bCatmi, newTransactionMi, transactionsListMi;

    public JMenuBar renderMenu() {
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
        cCatSubm.add(mi = new JMenuItem("STAFF"));
        cCatSubm.add(mi = new JMenuItem("STUDENTS"));

        bmi= new JMenuItem("Book");
        bCatmi = new JMenuItem("Book Categories");

        newTransactionMi = new JMenuItem("New Transaction");
        transactionsListMi = new JMenuItem("Transactions");

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