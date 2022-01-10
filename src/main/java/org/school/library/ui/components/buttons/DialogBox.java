package org.school.library.ui.components.buttons;
import javax.swing.*;

public class DialogBox {
    public void dialog(String title,String message,String status){
        if(status.equals("SUCCESS")){
            JOptionPane.showMessageDialog(new JFrame(), message, title,JOptionPane.WARNING_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(new JFrame(), message, title,JOptionPane.ERROR_MESSAGE);
        }
    }
}
