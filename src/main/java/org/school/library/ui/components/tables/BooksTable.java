package org.school.library.ui.components.tables;

import javax.swing.*;
public class BooksTable {
    //    JFrame f;
    public BooksTable(){

    }
    public JScrollPane renderTable(){
        return getjScrollPane();
    }


    private JScrollPane getjScrollPane() {
        String data[][]={
                {"001","Long walk to freedom","Mandela","Long Horne PB","11-10-2005","200","YES"},
                {"002","Current","Newton","MIT PB", "09-03-1985","2000","NO"},
                {"103","OOP","Stiven Goah","Havard University PB","03-08-1998","1200","YES"},
        };
        String column[]={"ID","TITLE","AUTHOR NAME", "PB HOUSE", "PB DATE", "PAGES", "AVAILABLE"};
        JTable jt=new JTable(data,column);
        jt.setBounds(10,40,1000,300);
        JScrollPane sp=new JScrollPane(jt);
        return sp;
    }
}