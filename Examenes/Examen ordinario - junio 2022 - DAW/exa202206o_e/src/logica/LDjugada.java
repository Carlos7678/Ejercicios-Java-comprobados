/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import oovv.Juego;
import oovv.Jugador;
import oovv.apuestaMayor25EX;
import vista.DJugada;

/**
 *
 * @author Carlos Soriano
 */
public class LDjugada implements ActionListener {

    private DJugada ventana;
    private Juego modelo;
    private Jugador jugadorActivo;
    private int indiceJugActivo;

    public LDjugada(DJugada ventana, Juego modelo) {
        this.ventana = ventana;
        indiceJugActivo = 0;
        jugadorActivo = modelo.getJugadores()[indiceJugActivo];
        this.modelo = modelo;
        empezarJugada();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Puja l'aposta" ->
                subirApuesta();
            case "Vol Carta" ->
                quiereCarta();
            case "Passa" ->
                pasarJugada();
        }
    }

    private void empezarJugada() {
        ventana.mostraAposta(jugadorActivo.getApuesta() + "");
        ventana.mostraInfoJugador(jugadorActivo.getNombreCompleto().nombreApellido(), jugadorActivo.getDinero() + "");
        modelo.sacarCarta(jugadorActivo);
        ventana.afegeixCarta(jugadorActivo.getBaraja().get(jugadorActivo.getBaraja().size() - 1));
    }

    private void subirApuesta() {
        try {
            jugadorActivo.setApuesta(jugadorActivo.getApuesta() + 5);
            ventana.mostraAposta(jugadorActivo.getApuesta() + "");
            ventana.activaPassa(false);
        } catch (apuestaMayor25EX ex) {
            ventana.activaApuesta(false);
            JOptionPane.showMessageDialog(ventana, ex.getMessage());
        }
    }

    private void pasarJugada() {
        ventana.limpiarPanel();
        if (indiceJugActivo == modelo.getNumJugadores() - 1) {
            terminarJugada();
        } else {
            indiceJugActivo++;
            jugadorActivo = modelo.getJugadores()[indiceJugActivo];
            jugadorActivo.setApuesta(5);
            if (indiceJugActivo != modelo.getNumJugadores() - 1) {
                ventana.mostraAposta(jugadorActivo.getApuesta() + "");
                ventana.mostraInfoJugador(jugadorActivo.getNombreCompleto().nombreApellido(), jugadorActivo.getDinero() + "");
                ventana.activaPassa(true);
                ventana.activaApuesta(true);
                jugadorActivo.setApuesta(5);
                modelo.sacarCarta(jugadorActivo);
                ventana.afegeixCarta(jugadorActivo.getBaraja().get(jugadorActivo.getBaraja().size() - 1));
            } else {
                ventana.mostraInfoBanca(jugadorActivo);
            }
        }
    }

    private void quiereCarta() {
        modelo.sacarCarta(jugadorActivo);
        ventana.afegeixCarta(jugadorActivo.getBaraja().get(jugadorActivo.getBaraja().size() - 1));
        ventana.activaPassa(true);
        if (modelo.seHaPasado(jugadorActivo)) {
            JOptionPane.showMessageDialog(ventana, "¡Te has pasado!");
            pasarJugada();
        }
    }

    private void terminarJugada() {
        ventana.dispose();
    }
}
