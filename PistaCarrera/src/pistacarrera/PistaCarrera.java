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

    static ArrayList<String> ordenLlegada;
    private String nombre;
    private JLabel etiqueta;
    private Pista auto;
    private boolean iterar;
    private boolean iterar1;
    Cronometro n = new Cronometro(Pista.lbTiempo);

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

    public static ArrayList<String> getOrdenLlegada() {
        return ordenLlegada;
    }

    public static void setOrdenLlegada(ArrayList<String> ordenLlegada) {
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
        while (iterar && posX < 800) {

            try {
                sleep(10);
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

        if (iterar == true) {

            System.out.println("HOLA");
            synchronized (ordenLlegada) {

                ordenLlegada.add(nombre);
            }
            StringBuilder mensaje = new StringBuilder();
            String posicion = "";
            for (int i = 0; i < ordenLlegada.size(); i++) {

                switch (i + 1) {
                    case 1:
                        posicion = "1st";
                        break;
                    case 2:
                        posicion = "2nd";
                        break;
                    case 3:
                        posicion = "3rd";
                        break;
                    default:
                        posicion = (i + 1) + "th";

                        break;
                }
                mensaje.append(posicion).append(". ").append(ordenLlegada.get(0)).append("\n");
            }

            System.out.println("FIN");

            System.out.println(ordenLlegada);

            System.out.println("pasando false");

            n.parar();

            star2();
            auto.getCarrro1().setLocation(50, 60);
            auto.getCarrr2().setLocation(55, 170);
            auto.getCarrr3().setLocation(55, 270);
            auto.getCarrr4().setLocation(55, 380);
            if (ordenLlegada.size() == 3) {
                Podio nc = new Podio();
                nc.setVisible(true);
            }

        }
        Pista.iniciar = false;
        n.reiniciar();

    }

    public void star1() {
        iterar = true;
        new Thread(this).start();

    }

    public void star2() {
        iterar = false;

    }

    public void renaudar() {

        iterar = true;
        new Thread(this).start();

    }
}
