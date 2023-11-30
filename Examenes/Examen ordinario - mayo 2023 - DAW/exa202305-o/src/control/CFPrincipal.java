/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import oovv.Elecciones;
import vista.DEntraNumEscons;
import vista.DEntraVotsBlanc;
import vista.DEntraVotsPartit;
import vista.FPrincipal;

/**
 *
 * @author Carlos Soriano
 */
public class CFPrincipal implements ActionListener {

    private FPrincipal finestra;
    private Elecciones elecciones;

    public CFPrincipal(FPrincipal finestra) {
        this.finestra = finestra;
        elecciones = new Elecciones();
    }

    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "entra nombre d'escons":
                introducirEscaños();
                cambiarEscañosVentana();
                break;
            case "entra vots en blanc":
                introducirVotosEnBlanco();
                break;
            case "entra vots d'un partit":
                introducirVotosPartido();
                break;
            case "veure dades partits":
                VerDatosPartidos();
                break;
            case "veure quocients":
                finestra.mostra(veureQuocients());
                break;
            case "eixir":
                System.exit(0);
                break;
        }

    }

    private void introducirVotosEnBlanco() {
        DEntraVotsBlanc de = new DEntraVotsBlanc(finestra, true);
        CDEntraVotsBlancs cde = new CDEntraVotsBlancs(de, elecciones);
        de.setOidor(cde);
        de.setVisible(true);
    }

    private void introducirEscaños() {
        DEntraNumEscons de = new DEntraNumEscons(finestra, true);
        CDEntraNumEscons cde = new CDEntraNumEscons(de, elecciones);
        de.setOidor(cde);
        de.setVisible(true);
    }

    private void cambiarEscañosVentana() {
        if (elecciones.escañosMayorA0()) {
            finestra.mostraEscons(elecciones.getEscaños());
        }
    }

    private void introducirVotosPartido() {
        DEntraVotsPartit de = new DEntraVotsPartit(finestra, true);
        CDEntraVotsPartit cde = new CDEntraVotsPartit(de, elecciones.getPartidos());
        de.setOidor(cde);
        de.setVisible(true);
    }

    private void VerDatosPartidos() {
        if (elecciones.hayVotosEnBlanco()) {
            elecciones.sacarVotosTotales();
            elecciones.darPorcentajeVotosPartido();
            finestra.mostra(elecciones.listadoPartidos());
        } else {
            finestra.mostra("Has d'introduir el nombre de vots en blanc");
        }
    }

    private String veureQuocients() {
        String listado = "";
        if (elecciones.getPartidos().isEmpty()) {
            listado += "No hay partidos\n";
        }
        if (!elecciones.hayVotosEnBlanco()) {
            listado += "No hay votos en blanco\n";
        }
        if (!elecciones.hayEscaños()) {
            listado += "No hay escaños";
        }
        if (!elecciones.getPartidos().isEmpty() && elecciones.hayVotosEnBlanco() && elecciones.hayEscaños()) {
            elecciones.calcularPartidosConMasDel3PorCiento();
            elecciones.calcularCocientes();
            listado += elecciones.listadoCocientes();
        }
        return listado;
    }
}
