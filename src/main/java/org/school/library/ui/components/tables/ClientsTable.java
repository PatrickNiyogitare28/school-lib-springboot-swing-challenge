package org.school.library.ui.components.tables;

import javax.swing.*;
public class ClientsTable {
//    JFrame f;
public ClientsTable(){
 }

    public JScrollPane renderStaffTable() {
        String data[][]={
                {"001","Eric","Mucyo"},
                {"002","John","Doe"},
                {"103","Mutoni","Diane"},
        };
        String column[]={"ID","FIRST STAFF NAME","LAST STAFF NAME"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        return sp;
    }

    public JScrollPane renderStudentsTable() {
        String data[][]={
                {"001","Noel","Aline Mulenzi"},
                {"002","Deric","Mutabazi"},
                {"103","Ngabo","David"},
        };
        String column[]={"ID","FIRST STUDENT NAME","LAST STUDENT NAME"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        return sp;
    }
}