/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Daniel
 */
public class paneColor {

    private final Color cFondo = new Color(44, 62, 80);
    private final Color cLetra = Color.white;
    private final Color cboton = new Color(92, 149, 255);
    private final Font normal = new Font("Verdana", Font.BOLD, 12);

    public paneColor() {
    }

    public void getPanel(Component c, Object o, String s, int i) {

        UIManager.put("OptionPane.background", cFondo);
        UIManager.put("Panel.background", cFondo);
        UIManager.put("OptionPane.messageForeground", cLetra);
        UIManager.put("Button.background", cboton);
        UIManager.put("Button.foreground", cLetra);
        UIManager.put("Button.font", normal);

        JOptionPane.showMessageDialog(c, o, s, i);
    }
}