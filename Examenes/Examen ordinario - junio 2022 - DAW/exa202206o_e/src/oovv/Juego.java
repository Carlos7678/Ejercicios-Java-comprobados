/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import baralla.Baralla;
import baralla.Carta;
import exa202206o.Principal;

/**
 *
 * @author Carlos Soriano
 */
public class Juego {

    public void empezarJuego() {
        jugActivo = 0;
        baraja = new Baralla("8", "9");
    }

    private Jugador[] jugadores;
    private int numJugadores;
    private int jugActivo;
    private Baralla baraja;
    int bancaInicial;

    public Juego() {
        numJugadores = Principal.getNumJugadores();
        jugadores = new Jugador[numJugadores];
        baraja = new Baralla("8", "9");
        crearJugadores();
        bancaInicial = jugadores[numJugadores - 1].getDinero();
    }

    private void crearJugadores() {
        for (int i = 0; i < numJugadores; i++) {
            Jugador jugador = new Jugador();
            if (jugadorEstaEnMatriz(jugador)) {
                i--;
            } else {
                jugadores[i] = jugador;
            }
        }
    }

    private boolean jugadorEstaEnMatriz(Jugador nuevoJugador) {
        for (Jugador jugador : jugadores) {
            if (jugador != null && jugador.equals(nuevoJugador)) {
                return true;
            }
        }
        return false;
    }

    public String jugadoresTxt() {
        String listado = "";
        for (Jugador jugador : jugadores) {
            listado += jugador + "\n";
        }
        return listado;
    }

    public void cambiarBancaPos() {
        int indiceBanca = Tutil.getAleatorio(0, jugadores.length - 1);
        if (indiceBanca != jugadores.length - 1) {
            Jugador jugadorTemp = jugadores[indiceBanca];
            jugadores[indiceBanca] = jugadores[jugadores.length - 1];
            jugadores[jugadores.length - 1] = jugadorTemp;
        }
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public void sacarCarta(Jugador jugador) {
        jugador.getBaraja().add(baraja.trauCarta());
    }

    public String listadoJugadas(Jugador jugador) {
        String listado = "";
        if (jugador != jugadores[numJugadores - 1]) {
            listado += jugador.getNombreCompleto().nombreApellido() + " apuesta " + jugador.getApuesta() + " con " + getValorTotalBaraja(jugador) + " puntos \n";
            listado += getNombreCartas(jugador);
        } else {
            listado += jugador.getNombreCompleto().nombreApellido() + "____La BANCA";
            if (seHaPasado(jugador)) {
                listado += " se ha pasado\n";
            }
            listado += "\n" + getNombreCartas(jugador);
        }

        return listado;
    }

    private int getValorTotalBaraja(Jugador jugador) {
        int sumaValorCartas = 0;
        for (Carta carta : jugador.getBaraja()) {
            sumaValorCartas += carta.getPunts();
        }
        return sumaValorCartas;
    }

    private String getNombreCartas(Jugador jugador) {
        String listado = "";
        listado += jugador.getBaraja().get(0).getValor() + " de " + jugador.getBaraja().get(0).getPal();
        if (jugador.getBaraja().size() > 1) {
            for (int i = 1; i < jugador.getBaraja().size(); i++) {
                listado += " + " + jugador.getBaraja().get(i).getValor() + " de " + jugador.getBaraja().get(i).getPal();
            }

        }
        return listado;
    }

    public String listadoCompletoJugadas() {
        String listado = "Listado de las jugadas -----------------------------\n";
        for (int i = 0; i < jugadores.length; i++) {
            listado += listadoJugadas(jugadores[i]);
            if (seHaPasado(jugadores[i]) && jugadores[i] != jugadores[jugadores.length - 1]) {
                listado += " y se ha pasado";
            }
            listado += "\n\n";
        }
        return listado;
    }

    public boolean seHaPasado(Jugador jugador) {
        return getValorTotalBaraja(jugador) > 7.5;
    }

    public String listadoResultadoJugadas(Jugador jugador) {
        String listado = "";
        if (jugador != jugadores[numJugadores - 1]) {
            listado += jugador.getNombreCompleto().nombreApellido() + " con " + jugador.getDinero() + " € ";
            if (seHaPasado(jugador)) {
                listado += " pierde " + jugador.getApuesta();
                jugador.setDinero(jugador.getDinero() - jugador.getApuesta());
                listado += " >> " + jugador.getDinero() + " €";
            } else if (seHaPasado(jugadores[jugadores.length - 1])) {
                listado += bancaPaga(jugador);
            } else if (getValorTotalBaraja(jugador) > getValorTotalBaraja(jugadores[jugadores.length - 1])) {
                listado += bancaPaga(jugador);
            } else {
                listado += jugadorPagaBanca(jugador);
            }
        } else {
            listado += recuentoBanca(jugador);
        }
        return listado;
    }

    public String listadoCompletoResultadoJugadas() {
        String listado = "El resultado de las jugadas -----------------------------\n";
        for (int i = 0; i < jugadores.length; i++) {
            listado += listadoResultadoJugadas(jugadores[i]) + "\n";
        }
        return listado;
    }

    public String bancaPaga(Jugador jugador) {
        String listado = "";
        listado += " gana " + jugador.getApuesta();
        jugador.setDinero(jugador.getDinero() + jugador.getApuesta());
        listado += " >> " + jugador.getDinero() + " €";
        jugadores[jugadores.length - 1].setDinero(jugadores[jugadores.length - 1].getDinero() - jugador.getApuesta());
        return listado;
    }

    public String jugadorPagaBanca(Jugador jugador) {
        String listado = "";
        listado += " pierde " + jugador.getApuesta();
        jugador.setDinero(jugador.getDinero() - jugador.getApuesta());
        listado += " >> " + jugador.getDinero() + " €";
        jugadores[jugadores.length - 1].setDinero(jugadores[jugadores.length - 1].getDinero() + jugador.getApuesta());
        return listado;
    }

    public String recuentoBanca(Jugador jugador) {
        String listado = "";
        listado += "la banca con " + bancaInicial;
        if (bancaInicial > jugador.getDinero()) {
            listado += " pierde ";
        } else {
            listado += " gana ";
        }
        listado += Math.abs(bancaInicial - jugador.getDinero()) + " € >> " + jugador.getDinero() + " € ";
        return listado;
    }
}
