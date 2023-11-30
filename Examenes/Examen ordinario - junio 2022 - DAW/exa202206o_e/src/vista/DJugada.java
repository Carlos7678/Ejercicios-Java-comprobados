/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vista;

import baralla.Carta;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import oovv.Jugador;

/**
 *
 * @author Carlos Soriano
 */
public class DJugada extends javax.swing.JDialog {

    /**
     * Creates new form DJugada
     */
    public DJugada(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocation(parent.getLocationOnScreen().x, parent.getLocationOnScreen().y + 200);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eNomJugador = new javax.swing.JLabel();
        pCartesJugador = new javax.swing.JPanel();
        eDiners = new javax.swing.JLabel();
        bVolCarta = new javax.swing.JButton();
        bPassa = new javax.swing.JButton();
        bPujaAposta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        eAposta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        eNomJugador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eNomJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eNomJugador.setText("nom");

        pCartesJugador.setBackground(new java.awt.Color(67, 170, 61));

        eDiners.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eDiners.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eDiners.setText("5");

        bVolCarta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bVolCarta.setText("Vol Carta");
        bVolCarta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        bVolCarta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bVolCarta.setFocusPainted(false);

        bPassa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bPassa.setText("Passa");
        bPassa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        bPassa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bPassa.setFocusPainted(false);

        bPujaAposta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bPujaAposta.setText("Puja l'aposta");
        bPujaAposta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        bPujaAposta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bPujaAposta.setFocusPainted(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Té");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Aposta");

        eAposta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eAposta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eAposta.setText("5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eDiners, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eAposta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(bPujaAposta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(bVolCarta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bPassa))
                    .addComponent(eNomJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pCartesJugador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eNomJugador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pCartesJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eDiners)
                    .addComponent(bVolCarta)
                    .addComponent(bPassa)
                    .addComponent(bPujaAposta)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(eAposta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DJugada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DJugada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DJugada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DJugada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DJugada dialog = new DJugada(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bPassa;
    private javax.swing.JButton bPujaAposta;
    private javax.swing.JButton bVolCarta;
    private javax.swing.JLabel eAposta;
    private javax.swing.JLabel eDiners;
    private javax.swing.JLabel eNomJugador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pCartesJugador;
    // End of variables declaration//GEN-END:variables

    /**
     * associa l'oïdor als botons.
     *
     * @param oidor gestor de l'esdeveniment d'acció
     */
    public void setOidor(ActionListener oidor) {
        bPassa.addActionListener(oidor);
        bPujaAposta.addActionListener(oidor);
        bVolCarta.addActionListener(oidor);
    }

    /**
     * mostra el nom i els diners del jugador.
     *
     * @param nom del jugador
     * @param diners del jugador
     */
    public void mostraInfoJugador(String nom, String diners) {
        eDiners.setText(diners);
        eNomJugador.setText(nom);
    }

    /**
     * canvia l'estat del botó Passa.
     *
     * @param actiu <code>true</code> activa el botó <br><code>false</code>
     * desactiva el botó
     */
    public void activaPassa(boolean actiu) {
        bPassa.setEnabled(actiu);
    }
 public void activaApuesta(boolean actiu) {
        bPujaAposta.setEnabled(actiu);
    }
    /**
     * mostra l'aposta del jugador.
     *
     * @param aposta quantitat a mostrar
     */
    public void mostraAposta(String aposta) {
        eAposta.setText(aposta);
    }

    /**
     * afegeix una carta al panell de cartes.
     *
     * @param carta a afegir
     */
    public void afegeixCarta(Carta carta) {
        afegeixCarta(carta.getIcona());
    }

    /**
     * afegeix una carta al panell de cartes. crea una etiqueta amb la imatge
     *
     * @param imgCarta imatge de la carta a afegir
     */
    public void afegeixCarta(ImageIcon imgCarta) {
        pCartesJugador.add(new JLabel(imgCarta));
        pCartesJugador.updateUI();
    }

    /**
     * mostra les dades de la banca. mostra els diners, el nom del jugador que
     * és la banca, la paraula "Banca" en aposta i amaga el botó PujaAposta
     * (la banca no aposta) i mostra la primera carta de la banca
     *
     * @param banca 
     */
    public void mostraInfoBanca(Jugador banca) {
        eDiners.setText(banca.getDinero()+"");
        eNomJugador.setText(banca.getNombreCompleto().nombreApellido());
        eAposta.setText("banca");
        bPujaAposta.setVisible(false);
    afegeixCarta(banca.getCarta());
    }
    public void limpiarPanel(){
        pCartesJugador.removeAll();
    }
}
