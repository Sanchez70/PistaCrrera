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

    public PistaCarrera(JLabel etiqueta, Pista auto) {
        this.etiqueta = etiqueta;
        this.auto = auto;
    }

    @Override
    public void run() {
        int auto1 = 0;
        int auto2 = 0;
        int auto3 = 0;
        int auto4 = 0;
        while (true) {
            try {
                sleep((int) (Math.random() * (1000)));
                auto1 = auto.getCarrro1().getLocation().x;
                auto2 = auto.getCarrr2().getLocation().x;
                auto3 = auto.getCarrr3().getLocation().x;
                auto4 = auto.getCarrr4().getLocation().x;

                if (auto1 < auto.getBarrera().getLocation().x - 150 && auto2 < auto.getBarrera().getLocation().x - 150 && auto3 < auto.getBarrera().getLocation().x - 150 && auto4 < auto.getBarrera().getLocation().x - 150) {
                    etiqueta.setLocation(etiqueta.getLocation().x + 10, etiqueta.getLocation().y);
                    auto.repaint();
                } else {
                    break;
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(PistaCarrera.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (etiqueta.getLocation().x >= auto.getBarrera().getLocation().x - 150) {

                if (auto1 > auto2) {
                    JOptionPane.showMessageDialog(null, "EL GANADOR ES EL CARRO UNO");
                } else if (auto2 > auto1) {
                    JOptionPane.showMessageDialog(null, "EL GANADOR ES EL CARRO DOS");
                } else if (auto2 > auto3) {
                    JOptionPane.showMessageDialog(null, "EL GANADOR ES EL CARRO DOS");
                } else if (auto3 > auto2) {
                    JOptionPane.showMessageDialog(null, "EL GANADOR ES EL CARRO TRES");
                } else if (auto3 > auto4) {
                    JOptionPane.showMessageDialog(null, "EL GANADOR ES EL CARRO TRES");
                }else if (auto4 > auto3) {
                    JOptionPane.showMessageDialog(null, "EL GANADOR ES EL CARRO CUATRO");
                }else{
                     JOptionPane.showMessageDialog(null, "ES UN EMPATE");
                     
                }
            }
        }

    }
}
