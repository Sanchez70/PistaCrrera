/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pistacarrera;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author KEVIN SANCHEZ
 */
public class PistaCarrera extends Thread {

    
    private JLabel etiqueta;
    private Pista auto;
    private boolean iterar;
    Cronometro n = new Cronometro(Pista.lbTiempo);
    public PistaCarrera(JLabel etiqueta, Pista auto) {
        this.etiqueta = etiqueta;
        this.auto = auto;

    }

    public boolean isIterar() {
        return iterar;
    }

    public void setIterar(boolean iterar) {
        this.iterar = iterar;
    }

    public PistaCarrera() {
    }

    @Override
    public void run() {
        int auto1 = 0;
        int auto2 = 0;
        int auto3 = 0;
        int auto4 = 0;

        while (iterar) {
            try {
                sleep((int) (Math.random() * 100));
                auto1 = auto.getCarrro1().getLocation().x;
                auto2 = auto.getCarrr2().getLocation().x;
                auto3 = auto.getCarrr3().getLocation().x;
                auto4 = auto.getCarrr4().getLocation().x;

                if (auto1 < auto.getBarrera().getLocation().x - 90 && auto2 < auto.getBarrera().getLocation().x - 90 && auto3 < auto.getBarrera().getLocation().x - 90 && auto4 < auto.getBarrera().getLocation().x - 90) {
                    etiqueta.setLocation(etiqueta.getLocation().x + 10, etiqueta.getLocation().y);
                    auto.repaint();
                } else {

                    break;
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(PistaCarrera.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (etiqueta.getLocation().x >= auto.getBarrera().getLocation().x - 90) {
               
                if (auto1 > auto2 && auto1 > auto3 && auto1 > auto4) {
                   
                    JOptionPane.showMessageDialog(null, "EL GANADOR ES EL CARRO UNO");

                } else if (auto2 > auto1 && auto2 > auto3 && auto2 > auto4) {
                    
                    JOptionPane.showMessageDialog(null, "EL GANADOR ES EL CARRO DOS");

                } else if (auto3 > auto1 && auto3 > auto2 && auto3 > auto4) {
                 
                    JOptionPane.showMessageDialog(null, "EL GANADOR ES EL CARRO TRES");

                } else if (auto4 > auto3 && auto4 > auto2 && auto4 > auto1) {
                 
                    JOptionPane.showMessageDialog(null, "EL GANADOR ES EL CARRO CUATRO");

                } else {
                    JOptionPane.showMessageDialog(null, "ES UN EMPATE");
                    

                }
                auto.getCarrro1().setLocation(50, 60);
                auto.getCarrr2().setLocation(55, 170);
                auto.getCarrr3().setLocation(55, 270);
                auto.getCarrr4().setLocation(55, 380);
                
                n.parar();
                System.out.println("PASANDO FALSE");
                n.reiniciar();
                break;

            }
        }

    }

    public void star1() {
        iterar = true;
        new Thread(this).start();

    }

    public void star2() {

        iterar = false;

    }
}
