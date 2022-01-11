package org.school.library.ui.components.tables;

import javax.swing.*;
public class ClientsTable {
//    JFrame f;
public ClientsTable(){
//        f=new JFrame();

//        f.add(sp);
//        f.setSize(300,400);
//        f.setVisible(true);
    }
    public JScrollPane staffsTable(){
        return getjScrollPane();
    }
    public JScrollPane studentsTable(){
        return getjScrollPane();
    }

    private JScrollPane getjScrollPane() {
        String data[][]={ {"101","Amit","670000"},
                {"102","Jai","780000"},
                {"101","Sachin","700000"}};
        String column[]={"ID","NAME","SALARY"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        return sp;
    }
}