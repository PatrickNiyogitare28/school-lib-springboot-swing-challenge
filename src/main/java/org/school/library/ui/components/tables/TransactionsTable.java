package org.school.library.ui.components.tables;

import javax.swing.*;
public class TransactionsTable {
    //    JFrame f;
    public TransactionsTable(){

    }

    public JScrollPane renderTransactions() {
        String data[][]={
                {"001","Rise Up","Mucyo","BORROW","11-10-2021"},
                {"001","Shine","Aline","RETURN","10-01-2022"},
        };
        String column[]={"ID","BOOK","CLIENT", "TYPE", "DATE"};
        JTable jt=new JTable(data,column);
        jt.setBounds(10,40,1000,300);
        JScrollPane sp=new JScrollPane(jt);
        return sp;
    }
}