package org.school.library.views;

import org.school.library.LibraryApplication;
import org.school.library.ui.components.buttons.RoundJButton;
import org.school.library.ui.components.buttons.RoundJPasswordField;
import org.school.library.ui.components.buttons.RoundJTextField;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

@SpringBootApplication
public class Login {
  private JFrame mainFrame;

    public static void main(String[] args) {
        new Login();
    }
  public Login() {
       mainFrame = new JFrame("SIGN IN");
       mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
       mainFrame.setSize(screenSize.width,screenSize.height);
       mainFrame.setMinimumSize(new Dimension(1800,1800));
       layout();
  }

    public void layout(){
        JPanel panel = new JPanel();
        BorderLayout bdl = new BorderLayout();
        bdl.setHgap(0);
        bdl.setVgap(0);

        panel.setBackground(new Color(0X352058));

        panel.setBounds(0,0,500,1000);

        JPanel panel2 = new JPanel();
        panel2.setBounds(500,0,500,1000);
        panel2.setBackground(Color.WHITE);
        JPanel panelImage = new JPanel();
        panelImage.setBounds(100,200,200,200);
        panelImage.add(profileIcon());
        mainFrame.add(panelImage);
        mainFrame.add(title());
        form();
        mainFrame.add(panel);
        mainFrame.add(panel2);

        mainFrame.setVisible(true);
    }

    public JLabel title(){
        JLabel label = new JLabel();
        label.setText("SCHOOL LIBRARY MIS");
        label.setForeground(Color.white);
        label.setFont(new Font("SansSerif",Font.PLAIN,20));
        label.setBounds(100,350,300,200);
        return label;
    }



    public JLabel profileIcon(){
        ImageIcon image = new ImageIcon("src/main/java/org/school/library/assets/profileIcon.png");
        JLabel label = new JLabel();
        label.setIcon(image);
        return label;
    }


    public void form() {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300,400));
        JTextField textField = new RoundJTextField(15);
        JPasswordField jPasswordField = new RoundJPasswordField(15);
        JLabel label = new JLabel();
        JLabel label2 = new JLabel();
        label.setFont(new Font("SansSerif",Font.BOLD,20));
        label2.setFont(new Font("SansSerif",Font.BOLD,20));
        Font fieldFont = new Font("SansSerif", Font.PLAIN, 16);
        textField.setFont(fieldFont);
        jPasswordField.setFont(fieldFont);

        JLabel titleLabel = new JLabel("Sign in");
        titleLabel.setFont(new Font("SansSerif",Font.BOLD,25));

        titleLabel.setBounds(800, 90, 200, 50);

        label.setText("Email:");
        label2.setText("Password:");
        label.setBounds(600, 200, 200, 20);
        textField.setBounds(600, 250, 420, 40);

        label2.setBounds(600, 300,200, 20);
        jPasswordField.setBounds(600, 350, 420, 40);


        Font btnFont = new Font("SansSerif", Font.PLAIN, 16);

        JButton button = new RoundJButton("LOGIN");
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(0X352058));
        button.setFont(btnFont);
        Border line = new LineBorder(Color.BLACK);
        Border margin = new EmptyBorder(10, 30, 10, 30);
        Border compound = new CompoundBorder(line, margin);
        button.setBorder(compound);
        button.setBounds(700, 410, 200, 50);
        button.addActionListener(e -> {
            try {
//                handleLogin(textField,jPasswordField);
                /*Handle login*/
                new Dashboard();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        mainFrame.add(titleLabel);
        mainFrame.add(label);
        mainFrame.add(label2);
        mainFrame.add(button);
        mainFrame.add(textField);
        mainFrame.add(jPasswordField);
    }


}
