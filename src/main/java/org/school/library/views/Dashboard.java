package org.school.library.views;

import javax.swing.*;
import java.awt.*;

public class Dashboard {
    private JFrame mainFrame;

    public Dashboard(){
        mainFrame = new JFrame("DASHBOARD");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        mainFrame.setSize(screenSize.width,screenSize.height);
        mainFrame.setMinimumSize(new Dimension(1800,1800));

        renderUI();
    }

    public void renderUI(){
        JMenu menu = new JMenu();
        JMenuBar menuBar = new JMenuBar();
        JMenuItem clients = new JMenuItem("CLIENTS");
        JMenuItem books = new JMenuItem("BOOKS");
        JMenuItem operations = new JMenuItem("OPERATIONS");

        menuBar.add(clients);
        menuBar.add(books);
        menuBar.add(operations);

        menu.add(menuBar);

        JPanel navPanel = new JPanel();
//        navPanel.setBounds(10, 10, 300, 50);
        navPanel.add(menu);
        mainFrame.add(navPanel);
        mainFrame.setVisible(true);
    }
}
