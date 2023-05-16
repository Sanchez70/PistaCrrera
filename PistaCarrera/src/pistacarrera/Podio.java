/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pistacarrera;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author KEVIN SANCHEZ
 */
public class Podio extends javax.swing.JFrame {

    /**
     * Creates new form Podio
     */
    public Podio() {
        initComponents();

        setLocationRelativeTo(null);
        ImageIcon ama = new ImageIcon(getClass().getResource("/imagenes/amarillo.png"));
        ImageIcon az = new ImageIcon(getClass().getResource("/imagenes/azul.png"));
        ImageIcon ver = new ImageIcon(getClass().getResource("/imagenes/verde.png"));
        ImageIcon ro = new ImageIcon(getClass().getResource("/imagenes/rojo.png"));
        Icon Amarillo = new ImageIcon(ama.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
        Icon Azul = new ImageIcon(az.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
        Icon verde = new ImageIcon(ver.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
        Icon rojo = new ImageIcon(ro.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
        if (PistaCarrera.ordenLlegada.size() == 4) {
            for (int i = 0; i < PistaCarrera.ordenLlegada.size(); i++) {
                System.out.println("Podio" + PistaCarrera.ordenLlegada.get(i));
                if (i == 0) {
                    if (PistaCarrera.ordenLlegada.get(i).getNombre().equalsIgnoreCase("Amarillo")) {
                        jLabel1.setIcon(Amarillo);
                        this.repaint();
                    } else if (PistaCarrera.ordenLlegada.get(i).getNombre().equalsIgnoreCase("Azul")) {
                        jLabel1.setIcon(Azul);
                        this.repaint();
                    } else if (PistaCarrera.ordenLlegada.get(i).getNombre().equalsIgnoreCase("Verde")) {
                        jLabel1.setIcon(verde);
                        this.repaint();
                    } else if (PistaCarrera.ordenLlegada.get(i).getNombre().equalsIgnoreCase("Rojo")) {
                        jLabel1.setIcon(rojo);
                        this.repaint();
                    }

                    lbTiempo1.setText(PistaCarrera.ordenLlegada.get(i).getNombre());
                    lbTiempo7.setText(PistaCarrera.ordenLlegada.get(i).getTiempo());
                } else if (i == 1) {
                    if (PistaCarrera.ordenLlegada.get(i).getNombre().equalsIgnoreCase("Amarillo")) {
                        jLabel2.setIcon(Amarillo);
                        this.repaint();
                    } else if (PistaCarrera.ordenLlegada.get(i).getNombre().equalsIgnoreCase("Azul")) {
                        jLabel2.setIcon(Azul);
                        this.repaint();
                    } else if (PistaCarrera.ordenLlegada.get(i).getNombre().equalsIgnoreCase("Verde")) {
                        jLabel2.setIcon(verde);
                        this.repaint();
                    } else if (PistaCarrera.ordenLlegada.get(i).getNombre().equalsIgnoreCase("Rojo")) {
                        jLabel2.setIcon(rojo);
                        this.repaint();
                    }

                    lbTiempo2.setText(PistaCarrera.ordenLlegada.get(i).getNombre());
                    lbTiempo8.setText(PistaCarrera.ordenLlegada.get(i).getTiempo());
                } else if (i == 2) {
                    if (PistaCarrera.ordenLlegada.get(i).getNombre().equalsIgnoreCase("Amarillo")) {
                        jLabel3.setIcon(Amarillo);
                        this.repaint();
                    } else if (PistaCarrera.ordenLlegada.get(i).getNombre().equalsIgnoreCase("Azul")) {
                        jLabel3.setIcon(Azul);
                        this.repaint();
                    } else if (PistaCarrera.ordenLlegada.get(i).getNombre().equalsIgnoreCase("Verde")) {
                        jLabel3.setIcon(verde);
                        this.repaint();
                    } else if (PistaCarrera.ordenLlegada.get(i).getNombre().equalsIgnoreCase("Rojo")) {
                        jLabel3.setIcon(rojo);
                        this.repaint();
                    }

                    lbTiempo3.setText(PistaCarrera.ordenLlegada.get(i).getNombre());
                    lbTiempo9.setText(PistaCarrera.ordenLlegada.get(i).getTiempo());
                } else if (i == 3) {

                    //System.out.println(PistaCarrera.ordenLlegada.get(i).getNombre());
                    lbTiempo4.setText(PistaCarrera.ordenLlegada.get(3).getNombre());
                    lbTiempo10.setText( PistaCarrera.ordenLlegada.get(3).getTiempo());

                }

            }

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        jLabel7 = new javax.swing.JLabel();
        rSLabelImage2 = new necesario.RSLabelImage();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        buttonRound2 = new org.edisoncor.gui.button.ButtonRound();
        panelShadow1 = new org.edisoncor.gui.panel.PanelShadow();
        jLabel12 = new javax.swing.JLabel();
        lbTiempo4 = new javax.swing.JLabel();
        lbTiempo3 = new javax.swing.JLabel();
        lbTiempo1 = new javax.swing.JLabel();
        lbTiempo2 = new javax.swing.JLabel();
        lbTiempo5 = new javax.swing.JLabel();
        lbTiempo6 = new javax.swing.JLabel();
        lbTiempo7 = new javax.swing.JLabel();
        lbTiempo8 = new javax.swing.JLabel();
        lbTiempo9 = new javax.swing.JLabel();
        lbTiempo10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setColorPrimario(new java.awt.Color(102, 0, 204));
        panel1.setColorSecundario(new java.awt.Color(102, 0, 102));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/win-removebg-preview.png"))); // NOI18N
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 340, 50));

        rSLabelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png-transparent-gold-trophy-and-checkered-flag-trophy-adobe-illustrator-black-and-white-trophy-trophy-game-flag-racing-PhotoRoom.png-PhotoRoom.png"))); // NOI18N
        panel1.add(rSLabelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 180, 90));

        jLabel1.setText("jLabel2");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 100, 60));

        jLabel2.setText("jLabel2");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 100, 50));

        jLabel3.setText("jLabel4");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 90, 60));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PODIO (1)-PhotoRoom.png-PhotoRoom.png"))); // NOI18N
        panel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        buttonRound2.setBackground(new java.awt.Color(204, 0, 0));
        buttonRound2.setText("REGRESAR");
        buttonRound2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound2ActionPerformed(evt);
            }
        });
        panel1.add(buttonRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 100, -1));

        panelShadow1.setBorder(new javax.swing.border.MatteBorder(null));
        panelShadow1.setForeground(new java.awt.Color(204, 204, 204));
        panelShadow1.setDoubleBuffered(false);

        jLabel12.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("ESTADÍSTICAS");

        lbTiempo4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbTiempo4.setForeground(new java.awt.Color(255, 255, 255));
        lbTiempo4.setText("jLabel6");

        lbTiempo3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbTiempo3.setForeground(new java.awt.Color(255, 255, 255));
        lbTiempo3.setText("jLabel3");
        lbTiempo3.setDoubleBuffered(true);

        lbTiempo1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbTiempo1.setForeground(new java.awt.Color(255, 255, 255));
        lbTiempo1.setText("jLabel1");

        lbTiempo2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbTiempo2.setForeground(new java.awt.Color(255, 255, 255));
        lbTiempo2.setText("jLabel2");

        lbTiempo5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbTiempo5.setForeground(new java.awt.Color(255, 255, 255));
        lbTiempo5.setText("NOMBRE:");

        lbTiempo6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTiempo6.setForeground(new java.awt.Color(255, 255, 255));
        lbTiempo6.setText("TIEMPO:");

        lbTiempo7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbTiempo7.setForeground(new java.awt.Color(255, 255, 255));
        lbTiempo7.setText("jLabel1");

        lbTiempo8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbTiempo8.setForeground(new java.awt.Color(255, 255, 255));
        lbTiempo8.setText("jLabel2");

        lbTiempo9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbTiempo9.setForeground(new java.awt.Color(255, 255, 255));
        lbTiempo9.setText("jLabel3");

        lbTiempo10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbTiempo10.setForeground(new java.awt.Color(255, 255, 255));
        lbTiempo10.setText("jLabel6");

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTiempo5)
                            .addComponent(lbTiempo3)
                            .addComponent(lbTiempo2)
                            .addComponent(lbTiempo4)
                            .addComponent(lbTiempo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTiempo9)
                            .addComponent(lbTiempo8)
                            .addComponent(lbTiempo10)
                            .addComponent(lbTiempo7)
                            .addComponent(lbTiempo6)))
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel12)))
                .addGap(45, 45, 45))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTiempo6)
                    .addComponent(lbTiempo5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addComponent(lbTiempo1)
                        .addGap(18, 18, 18)
                        .addComponent(lbTiempo2)
                        .addGap(18, 18, 18)
                        .addComponent(lbTiempo3)
                        .addGap(18, 18, 18)
                        .addComponent(lbTiempo4))
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addComponent(lbTiempo7)
                        .addGap(18, 18, 18)
                        .addComponent(lbTiempo8)
                        .addGap(18, 18, 18)
                        .addComponent(lbTiempo9)
                        .addGap(18, 18, 18)
                        .addComponent(lbTiempo10)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        panel1.add(panelShadow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 300, 230));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRound2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound2ActionPerformed
        Menu n=new Menu();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonRound2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Podio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Podio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Podio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Podio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Podio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonRound buttonRound2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbTiempo1;
    private javax.swing.JLabel lbTiempo10;
    private javax.swing.JLabel lbTiempo2;
    private javax.swing.JLabel lbTiempo3;
    private javax.swing.JLabel lbTiempo4;
    private javax.swing.JLabel lbTiempo5;
    private javax.swing.JLabel lbTiempo6;
    private javax.swing.JLabel lbTiempo7;
    private javax.swing.JLabel lbTiempo8;
    private javax.swing.JLabel lbTiempo9;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelShadow panelShadow1;
    private necesario.RSLabelImage rSLabelImage2;
    // End of variables declaration//GEN-END:variables
}
