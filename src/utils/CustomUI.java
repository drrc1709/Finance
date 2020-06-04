/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;

/**
 *
 * @author Daniel
 */
public class CustomUI extends BasicComboBoxUI{
     public static ComboBoxUI createUI(JComponent c) {
         return new CustomUI();
     }
 

   @Override
     protected JButton createArrowButton() {        
        BasicArrowButton basicArrowButton = new BasicArrowButton(BasicArrowButton.SOUTH,
                Color.WHITE,
                new Color(130, 7, 7),
                new Color(130, 7, 7),
                Color.WHITE
                );         
        
        basicArrowButton.setBorder(BorderFactory.createLineBorder(Color.white,2));
        basicArrowButton.setContentAreaFilled(false);        
        return basicArrowButton;
     }        
}
