/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import oovv.EsUnaCadenaEX;
import oovv.EstaBuitEX;
import oovv.NoEsUnaLLetraEX;

/**
 *
 * @author Carlos Soriano
 */
public class FPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MiVentana
     */
    public FPrincipal() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ePenjat = new javax.swing.JLabel();
        eIncognita = new javax.swing.JLabel();
        tfLletra = new javax.swing.JTextField();
        bAltraJugada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Entra la lletra");

        ePenjat.setBackground(new java.awt.Color(204, 51, 0));
        ePenjat.setFont(new java.awt.Font("Arial", 0, 72)); // NOI18N
        ePenjat.setForeground(new java.awt.Color(255, 255, 255));
        ePenjat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ePenjat.setOpaque(true);

        eIncognita.setBackground(new java.awt.Color(153, 204, 255));
        eIncognita.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        eIncognita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eIncognita.setText("¿?");
        eIncognita.setOpaque(true);

        tfLletra.setColumns(5);
        tfLletra.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tfLletra.setActionCommand("EntraLaLletra");
        tfLletra.setEnabled(false);

        bAltraJugada.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        bAltraJugada.setText("Altra Jugada");
        bAltraJugada.setActionCommand("AltraJugada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(eIncognita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(tfLletra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAltraJugada, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(ePenjat, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 65, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(eIncognita)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLletra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAltraJugada)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ePenjat, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAltraJugada;
    private javax.swing.JLabel eIncognita;
    private javax.swing.JLabel ePenjat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tfLletra;
    // End of variables declaration//GEN-END:variables

    public void setOidor(ActionListener oidor) {
        tfLletra.addActionListener(oidor);
        bAltraJugada.addActionListener(oidor);
    }

    public void activaJoc(boolean activa) {
        tfLletra.setEnabled(activa);
        bAltraJugada.setEnabled(!activa);
    }

    public void mostraPenjat(ImageIcon icon) {
        ePenjat.setIcon(icon);
    }

    public void mostraGuions(String guions) {
        eIncognita.setText(guions);
    }

    public String getLLetra() {
        String car = tfLletra.getText();
        if (car.isBlank() || car.isEmpty()) {
            throw new EstaBuitEX();
        }
        if (car.length()!=1) {
            throw new EsUnaCadenaEX();
        }
        if (!Character.isLetter(car.charAt(0))) {
            throw new NoEsUnaLLetraEX();
        }
        
        return car;
    }


}
