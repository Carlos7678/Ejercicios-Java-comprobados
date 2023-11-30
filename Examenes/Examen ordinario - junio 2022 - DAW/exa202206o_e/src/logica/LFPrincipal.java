/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import oovv.Juego;
import vista.DJugada;
import vista.FPrincipal;

/**
 *
 * @author Carlos Soriano
 */
public class LFPrincipal implements ActionListener {

    private FPrincipal ventana;
    private Juego modelo;

    public LFPrincipal(FPrincipal ventana) {
        this.ventana = ventana;
        modelo = new Juego();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.empezarJuego();
        ventana.mostra("");
        modelo.cambiarBancaPos();
        ventana.activaNouJoc(false);
        modelo.sacarCarta(modelo.getJugadores()[modelo.getNumJugadores() - 1]);
        ventana.mostraCarta1Banca(modelo.getJugadores()[modelo.getNumJugadores() - 1].getBaraja().get(0).getIcona());
        ventana.mostraNomBanca(modelo.getJugadores()[modelo.getNumJugadores() - 1].getNombreCompleto().nombreApellido());
        DJugada dj = new DJugada(ventana, true);
        LDjugada ld = new LDjugada(dj, modelo);
        dj.setOidor(ld);
        dj.setVisible(true);
        ventana.afegeix(modelo.listadoCompletoJugadas());
        ventana.afegeix(modelo.listadoCompletoResultadoJugadas());
        ventana.activaNouJoc(true);
    }

}
