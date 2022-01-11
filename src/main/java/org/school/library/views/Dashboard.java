package org.school.library.views;

import org.school.library.ui.components.Menu;
import org.school.library.ui.components.tables.ClientsTable;

import javax.swing.*;
import java.awt.*;

public class Dashboard {
    private JFrame mainFrame;
    JMenuBar mb;

    public Dashboard(){
        mainFrame = new JFrame("DASHBOARD");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        mainFrame.setSize(screenSize.width,screenSize.height);
        mainFrame.setMinimumSize(new Dimension(1800,1800));

        renderUI();
    }

    public void renderUI(){
        Container cp = mainFrame.getContentPane();
        cp.setLayout(new FlowLayout());
        mb= new JMenuBar();
        mainFrame.setJMenuBar(new Menu().renderMenu());

        JScrollPane table =  new ClientsTable().studentsTable();
        mainFrame.add(table);

        mainFrame.setVisible(true);
    }
}
