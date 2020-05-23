/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Dimension;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JPanel;

/**
 * @web https://www.jc-mouse.net/
 * @author Mouse
 */
public class explode {

    private ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
    private Dimension d;
    private int count = 0;
    //
    private final JPanel container;
    private final JPanel content;
    //coordenadas del JPanel contenido
    private int px = 0;
    private int py = 0;
    //
    private final int ancho_min = 10;
    private final int alto_min = 10;
    private final int velocidad = 20;//en milisegundos

    /**
     * Constructor de clase
     * @param container
     * @param content
     */
    public explode(JPanel container, JPanel content) {
        this.container = container;
        this.content = content;
        this.container.removeAll();

        d = new Dimension(10, 10);
        this.content.setSize(d);//tamaño inicial

        //coordenadas iniciales
        px = this.container.getSize().width / 2 - this.ancho_min / 2;
        py = this.container.getSize().height / 2 - this.alto_min / 2;
        content.setLocation(px, py);
        content.setVisible(true);

        //se agrega al contenedor el JPanel contenido
        this.container.add(content);
        count = 10;
    }

    /**
     * Metodo para ejecutar el efecto EXPLODE
     */
    public void play() {
        scheduler = Executors.newSingleThreadScheduledExecutor();
        scheduler.scheduleAtFixedRate(() -> {
            //nuevo tamaño
            d = new Dimension(container.getSize().width * count / 100, container.getSize().height * count / 100);
            count = count + 10;
            //se recalcula la posicion mientras el jpanel crece
            px = container.getSize().width / 2 - d.width / 2;
            py = container.getSize().height / 2 - d.height / 2;
            content.setLocation(px, py);
            
            if (count > 100) {
                close();
            }
            content.setSize(d);
            container.updateUI();
        }, 100, velocidad, TimeUnit.MILLISECONDS);

    }

    /**
     * Metodo para terminar el efecto explode
     */
    public void close() {
        scheduler.shutdownNow();
    }

}//--> fin clase

