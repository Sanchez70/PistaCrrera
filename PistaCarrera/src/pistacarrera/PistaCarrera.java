/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pistacarrera;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author KEVIN SANCHEZ
 */
public class PistaCarrera extends Thread {

    static ArrayList<Auto> ordenLlegada;
    private String nombre;
    private JLabel etiqueta;
    private Pista auto;
    private boolean iterar;
    private boolean iterar1;
    Cronometro n = new Cronometro(Pista.lbTiempo);
    Auto a1 = new Auto();

    public PistaCarrera(JLabel etiqueta, Pista auto, ArrayList ordenLlegada, String nombre) {
        this.etiqueta = etiqueta;
        this.auto = auto;
        this.ordenLlegada = ordenLlegada;
        this.nombre = nombre;

    }

    public boolean isIterar() {
        return iterar;
    }

    public void setIterar(boolean iterar) {
        this.iterar = iterar;
    }

    public PistaCarrera() {
    }

    public static ArrayList<Auto> getOrdenLlegada() {
        return ordenLlegada;
    }

    public static void setOrdenLlegada(ArrayList<Auto> ordenLlegada) {
        PistaCarrera.ordenLlegada = ordenLlegada;
    }

    @Override
    public void run() {

        int auto1 = 0;
        int auto2 = 0;
        int auto3 = 0;
        int auto4 = 0;
        double posX = etiqueta.getLocation().getX();
        double posY = etiqueta.getLocation().getY();
        while (iterar && posX < 820) {

            try {
                sleep((int) (Math.random() * 40));
                auto1 = auto.getCarrro1().getLocation().x;
                auto2 = auto.getCarrr2().getLocation().x;
                auto3 = auto.getCarrr3().getLocation().x;
                auto4 = auto.getCarrr4().getLocation().x;

                double velocidad = 0.5 + (3.5 - 0.5) * Math.random();
                posX = posX + velocidad;
                etiqueta.setLocation((int) (posX), (int) (posY));
                etiqueta.repaint();
            } catch (InterruptedException ex) {
                Logger.getLogger(PistaCarrera.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (iterar1 == true) {

            synchronized (ordenLlegada) {
                a1.setNombre(nombre);
                a1.setTiempo(Pista.lbTiempo.getText());
                ordenLlegada.add(a1);
            }

            if (ordenLlegada.size() == 4) {
                n.parar();
                Podio nc = new Podio();

                nc.setVisible(true);
                auto.getCarrro1().setLocation(50, 60);
                auto.getCarrr2().setLocation(55, 170);
                auto.getCarrr3().setLocation(55, 270);
                auto.getCarrr4().setLocation(55, 380);
                star2();
                auto.setVisible(false);
                n.reiniciar();
                Pista.iniciar = false;

            }

        }

    }

    public void star1() {
        iterar = true;
        iterar1 = true;
        new Thread(this).start();

    }

    public void star2() {
        iterar = false;
        iterar1 = false;
        Pista.iniciar = true;
        Pista.iniciar1 = false;
    }

    public void renaudar() {
        iterar = true;
        iterar1 = true;
        new Thread(this).start();

    }
}
