/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pistacarrera;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Joseline
 */
public class Cronometro extends Thread {

    JLabel tiempo;
    static boolean iterar;
    static boolean corre;
    int x = 0;

    public Cronometro(JLabel tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public void run() {

        while (iterar) {
            try {
                Thread.sleep(100);
                ejecutar(x);

                x++;

            } catch (InterruptedException ex) {
                Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void ejecutar(int x) {

        Pista.segundos++;

        if (Pista.segundos > 59) {
            Pista.segundos = 0;
            Pista.minutos++;
        }

        String seg;
        String min;

        if (Pista.segundos < 10) {
            seg = "0" + Pista.segundos;
        } else {
            seg = "" + Pista.segundos;
        }

        if (Pista.minutos < 10) {
            min = "0" + Pista.minutos;
        } else {
            min = "" + Pista.minutos;
        }
        String crono = min + ": " + seg;

        tiempo.setText(crono);

    }

    public void iniciar() {
        iterar = true;
        new Thread(this).start();
    }

    public void parar() {
        iterar = false;

    }

    public void reiniciar() {
        x = 0;
        Pista.segundos = 0;
        Pista.minutos = 0;
    }
}
