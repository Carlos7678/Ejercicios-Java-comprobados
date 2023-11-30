/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leydhondt;

import control.CFPrincipal;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import vista.FPrincipal;

/**
 *
 * @author Carlos Soriano
 */
public class Inici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            FPrincipal f = new FPrincipal();
            CFPrincipal cp = new CFPrincipal(f);
            f.setOidor(cp);
            f.setVisible(true);
        });

    }

}
