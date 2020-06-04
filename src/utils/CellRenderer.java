/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Daniel
 */
public class CellRenderer extends DefaultTableCellRenderer {

    private static final long serialVersionUID = 1L;

    private String type = "text";
    private final Font normal = new Font("Verdana", Font.PLAIN, 12);
    private final Font bold = new Font("Verdana", Font.BOLD, 12);

    public CellRenderer() {
    }

    public CellRenderer(String type) {
        this.type = type;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {

        try {

            Color colorFondo = new Color(44, 62, 80);
            Color colorFondoPorDefecto = new Color(192, 192, 192);
            Color colorFondoSeleccion = new Color(67, 201, 255);
            NumberFormat defaultFormat = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));

            if (selected) {
                this.setFont(bold);
            } else {
                this.setFont(normal);
            }
            this.setForeground(Color.BLACK);

            if (type.equals("texto")) {

                if (focused) {
                    colorFondo = colorFondoSeleccion;
                } else {
                    colorFondo = colorFondoPorDefecto;
                }
                this.setHorizontalAlignment(JLabel.LEFT);
                this.setText(value.toString());
                this.setForeground(Color.BLACK);
                table.setGridColor(Color.white);

                table.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
                if (row % 2 == 0) {
                    this.setBackground((selected) ? colorFondo : new Color(241, 241, 241));
                } else {
                    this.setBackground((selected) ? colorFondo : Color.white);
                    return this;
                }
            }

            if (type.equals("currency")) {
                if (focused) {
                    colorFondo = colorFondoSeleccion;
                } else {
                    colorFondo = colorFondoPorDefecto;
                }
                this.setHorizontalAlignment(JLabel.RIGHT);

                this.setText(defaultFormat.format(value).toString());
                this.setForeground(new Color(32, 117, 32));
                this.setFont(bold);
                table.setGridColor(Color.white);

                table.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
                if (row % 2 == 0) {
                    this.setBackground((selected) ? colorFondo : new Color(241, 241, 241));
                } else {
                    this.setBackground((selected) ? colorFondo : Color.white);
                    return this;
                }
            }

            if (type.equals("numerico")) {
                if (focused) {
                    colorFondo = colorFondoSeleccion;
                } else {
                    colorFondo = colorFondoPorDefecto;
                }

                this.setHorizontalAlignment(JLabel.CENTER);
                this.setText(value.toString());
                this.setForeground((selected) ? Color.BLACK : new Color(32, 117, 32));

                if (row % 2 == 0) {
                    this.setBackground((selected) ? colorFondo : new Color(241, 241, 241));
                } else {
                    this.setBackground((selected) ? colorFondo : Color.white);
                    return this;
                }

                return this;
            }

            return this;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return this;
    }

}
