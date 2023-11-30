/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import oovv.Elecciones;
import oovv.MaEX;
import vista.DEntraNumEscons;

/**
 *
 * @author Carlos Soriano
 */
public class CDEntraNumEscons implements ActionListener {

    private DEntraNumEscons finestra;
    private Elecciones elecciones;

    public CDEntraNumEscons(DEntraNumEscons finestra, Elecciones elecciones) {
        this.finestra = finestra;
        this.elecciones = elecciones;
    }

    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "valida" -> {
                try {
                    elecciones.setEscaños(finestra.getNumEscaños());
                    finestra.dispose();
                } catch (MaEX ex) {
                    JOptionPane.showMessageDialog(finestra, ex.getMessage());
                }
            }
            case "cancela" -> {
                finestra.dispose();
            }
        }

    }

}
