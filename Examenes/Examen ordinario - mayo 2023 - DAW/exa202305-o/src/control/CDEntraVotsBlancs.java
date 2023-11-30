/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oovv.Elecciones;
import oovv.MaEX;
import vista.DEntraVotsBlanc;

/**
 *
 * @author Carlos Soriano
 */
public class CDEntraVotsBlancs implements ActionListener {

    private DEntraVotsBlanc finestra;
    private Elecciones elecciones;

    public CDEntraVotsBlancs(DEntraVotsBlanc finestra, Elecciones elecciones) {
        this.finestra = finestra;
        this.elecciones = elecciones;
    }

    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "valida" -> {
                try {
                    elecciones.setVotosEnBlanco(finestra.getVotsEnBlanc());
                    finestra.dispose();
                } catch (MaEX ex) {
                    JOptionPane.showMessageDialog(finestra, ex.getMessage());
                }
            }
            case "cancela" ->
                finestra.dispose();
        }

    }

}
