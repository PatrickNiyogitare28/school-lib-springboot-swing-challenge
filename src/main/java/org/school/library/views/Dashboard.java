package org.school.library.views;

import org.school.library.ui.components.Menu;
import org.school.library.ui.components.tables.ClientsTable;

import javax.swing.*;
import java.awt.*;

public class Dashboard {
    private JFrame mainFrame;
    JMenuBar mb;

    public Dashboard(JScrollPane pane){
        mainFrame = new JFrame("DASHBOARD");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        mainFrame.setSize(screenSize.width,screenSize.height);
        mainFrame.setMinimumSize(new Dimension(1800,1800));

        renderUI(pane);
    }

    public void renderUI(JScrollPane pane){
        Container cp = mainFrame.getContentPane();
        cp.setLayout(new FlowLayout());
        mb= new JMenuBar();
        mainFrame.setJMenuBar(new Menu().renderMenu(mainFrame));
        mainFrame.add(pane);
        mainFrame.setVisible(true);
    }
}
