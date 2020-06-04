/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Daniel
 */
public class HeaderRenderer implements TableCellRenderer {
    private JComponent jcomponent;
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        if (value instanceof String) {
            jcomponent = new JLabel((String) value);
            ((JLabel) jcomponent).setHorizontalAlignment(SwingConstants.CENTER);
            jcomponent.setSize(30, jcomponent.getWidth());
            jcomponent.setPreferredSize(new Dimension(6, jcomponent.getWidth()));
        }

        jcomponent.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(255, 255, 255)));
        jcomponent.setOpaque(true);
        jcomponent.setBackground(new Color(65, 65, 65));
        jcomponent.setForeground(Color.white);
        jcomponent.setFont(new Font("Verdana", Font.BOLD, 12));

        return jcomponent;
    }
}

