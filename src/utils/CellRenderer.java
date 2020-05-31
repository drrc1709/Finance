/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author Daniel
 */
public class CellRenderer extends DefaultTableCellRenderer {

    private static final long serialVersionUID = 1L;

    private String type = "text";
    private JLabel label = new JLabel();
    //se definen por defecto los types de datos a usar
    private final Font normal = new Font("Verdana", Font.PLAIN, 12);
    private final Font bold = new Font("Verdana", Font.BOLD, 12);

    private ImageIcon icoDelete = new ImageIcon(getClass().getResource("/ico/edit_trash.gif"));

    public CellRenderer() {
    }

    public CellRenderer(String type) {
        this.type = type;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {

        try {

            Color colorFondo = new Color(44, 62, 80);//Color.white;
            Color colorFondoPorDefecto = new Color(192, 192, 192);
            Color colorFondoSeleccion = new Color(67, 201, 255);
            NumberFormat defaultFormat = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
            /*
         * Si la celda del evento es la seleccionada se asigna el fondo por defecto para la selecci�n
             */
            if (selected) {
//                this.setBackground(colorFondoPorDefecto);
                this.setFont(bold);
            } else {
//                //Para las que no est�n seleccionadas se pinta el fondo de las celdas de blanco
//                this.setBackground(colorFondo);
                this.setFont(normal);
            }
            this.setForeground(Color.BLACK);
            /*
         * Se definen los types de datos que contendr�n las celdas basado en la instancia que
         * se hace en la ventana de la tabla al momento de construirla
             */
            if (type.equals("texto")) {
                //si es type texto define el color de fondo del texto y de la celda as� como la alineaci�n
                if (focused) {
                    colorFondo = colorFondoSeleccion;
                } else {
                    colorFondo = colorFondoPorDefecto;
                }
                this.setHorizontalAlignment(JLabel.LEFT);
                this.setText(value.toString());
                //this.setForeground((selected) ? new Color(255, 255, 255) : Color.RED);//new Color(0, 0, 0));
                this.setForeground(Color.BLACK);
                //this.setForeground( (selected)? new Color(255,255,255) :new Color(32,117,32) );
                //table.setShowVerticalLines(false);
                table.setGridColor(Color.white);

                table.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
                if (row % 2 == 0) {
                    this.setBackground((selected) ? colorFondo : new Color(241, 241, 241));
                } else {
                    this.setBackground((selected) ? colorFondo : Color.white);
                    return this;
                }
            }

            if (type.equals("icono")) {
                label.setIcon(icoDelete);
                label.setHorizontalAlignment(JLabel.LEFT);
                label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                return label;
            }

            if (type.equals("currency")) {
                //si es type texto define el color de fondo del texto y de la celda as� como la alineaci�n
                if (focused) {
                    colorFondo = colorFondoSeleccion;
                } else {
                    colorFondo = colorFondoPorDefecto;
                }
                this.setHorizontalAlignment(JLabel.RIGHT);

                this.setText(defaultFormat.format(value).toString());
                //this.setForeground((selected) ? new Color(255, 255, 255) : Color.RED);//new Color(0, 0, 0));
                this.setForeground(new Color(32, 117, 32));
                this.setFont(bold);
                //this.setForeground( (selected)? new Color(255,255,255) :new Color(32,117,32) );
                //table.setShowVerticalLines(false);
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
                // System.out.println(value);
                this.setHorizontalAlignment(JLabel.RIGHT);
                this.setText(value.toString());
                this.setForeground((selected) ? Color.BLACK : new Color(32, 117, 32));
                //this.setBackground((selected) ? colorFondo : Color.WHITE);
                // this.setBackground( (selected)? colorFondo :Color.MAGENTA);
                if (row % 2 == 0) {
                    this.setBackground((selected) ? colorFondo : new Color(241, 241, 241));
                } else {
                    this.setBackground((selected) ? colorFondo : Color.white);
                    return this;
                }
                //this.setFont(normal);
                return this;
            }

            return this;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return this;
    }

}
