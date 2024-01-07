/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miterapp;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author begoingtodev
 */
public class MiterApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
            UIManager.put("Button.arc", 8);
            UIManager.put("Component.arc", 8);
            UIManager.put("ProgressBar.arc", 8);
            UIManager.put("TextComponent.arc", 8);
        } catch (UnsupportedLookAndFeelException e) {
//            throw new IllegalAccessError(e.getMessage());
        }
//        MainDashboard d = new MainDashboard();
//        d.setVisible(true);
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
    }
    
}
