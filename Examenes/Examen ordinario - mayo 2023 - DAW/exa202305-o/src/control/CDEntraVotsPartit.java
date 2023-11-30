/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Collator;
import java.util.List;
import javax.swing.JOptionPane;
import oovv.MaEX;
import oovv.Partido;
import vista.DEntraVotsPartit;

/**
 *
 * @author Carlos Soriano
 */
public class CDEntraVotsPartit implements ActionListener {

    private DEntraVotsPartit finestra;
    private Partido partido;
    private List<Partido> partidos;

    public CDEntraVotsPartit(DEntraVotsPartit finestra, List<Partido> partidos) {
        this.finestra = finestra;
        this.partidos = partidos;
    }

    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "valida" -> {
                try {
                    if (estaEnLaLista()) {
                        JOptionPane.showMessageDialog(finestra, "Ya existe un partido politico con el nombre " + finestra.getNombrePartido()
                                + "\n Introduce un nuevo nombre");
                    } else {
                        partido = new Partido(finestra.getNombrePartido(), finestra.getVotosPartidos());
                        partidos.add(partido);
                        finestra.dispose();
                    }
                } catch (MaEX ex) {
                    JOptionPane.showMessageDialog(finestra, ex.getMessage());
                }
            }
            case "cancela" -> {
                finestra.dispose();
            }
        }
    }

    private boolean estaEnLaLista() {
        Collator miCollator = Collator.getInstance();
        miCollator.setStrength(Collator.PRIMARY);
        for (Partido partidoPolitico : partidos) {
            if (miCollator.equals(partidoPolitico.getNombre(), finestra.getNombrePartido())) {
                return true;
            }
        }
        return false;
    }

}
