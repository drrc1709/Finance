/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Daniel
 */
public class CellRenderer extends DefaultTableCellRenderer {

    private String type = "text";

    //se definen por defecto los types de datos a usar
    private Font normal = new Font("Verdana", Font.PLAIN, 12);
    private Font bold = new Font("Verdana", Font.BOLD, 12);

    public CellRenderer() {
    }

    public CellRenderer(String type) {
        this.type = type;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
        try {

            Color colorFondo = Color.white;
            Color colorFondoPorDefecto = new Color(192, 192, 192);
            Color colorFondoSeleccion = new Color(67, 201, 255);

            /*
         * Si la celda del evento es la seleccionada se asigna el fondo por defecto para la selecci�n
             */
            if (selected) {
                this.setBackground(colorFondoPorDefecto);
                this.setFont(bold);
            } else {
                //Para las que no est�n seleccionadas se pinta el fondo de las celdas de blanco
                this.setBackground(Color.white);
                this.setFont(normal);
            }

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
                this.setForeground((selected) ? new Color(255, 255, 255) : new Color(0, 0, 0));
                //this.setForeground( (selected)? new Color(255,255,255) :new Color(32,117,32) );
                this.setBackground((selected) ? colorFondo : Color.WHITE);
                this.setFont(normal);
                //this.setFont(bold);
                return this;
            }
            
            if( type.equals("numerico")) {           
        	if (focused) {
     			colorFondo=colorFondoSeleccion;
     		}else{
     			colorFondo=colorFondoPorDefecto;
     		}
        	// System.out.println(value);
            this.setHorizontalAlignment( JLabel.LEFT );
            this.setText( value.toString() );            
            this.setForeground( (selected)? new Color(255,255,255) :new Color(32,117,32) );    
            this.setBackground( (selected)? colorFondo :Color.WHITE);
           // this.setBackground( (selected)? colorFondo :Color.MAGENTA);
            this.setFont(normal);            
            return this;   
        }

            return this;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return this;
    }

}
