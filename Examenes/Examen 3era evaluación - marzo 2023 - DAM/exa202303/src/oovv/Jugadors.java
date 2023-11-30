/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

/**
 *
 * @author Carlos Soriano
 */
public class Jugadors {

    private Jugador[] elsJugadors;
    private int iJugador;
    private Jugador jugador;
    /**
     * constructor de Jugadors.
     *
     * @param nJugadors nombre màxim de jugadors per al joc
     * @throws Maex si el nombre de jugadors és inferior a 2
     */
    public Jugadors(int nJugadors) throws Maex {
        if (nJugadors < 2) {
            throw new Maex("El nombre mínim de jugadors és 2");
        }
        elsJugadors = new Jugador[nJugadors];
    }

    /**
     * afegeix un jugador al joc.
     *
     * @param jugador a afegir
     * @throws EstaPlenaEX si la matriu està plena<br>
     * @throws Maex si el jugador ja està en la matriu
     */
    public void afegeix(Jugador jugador) throws Maex, EstaPlenaEX {
        if (MatrizLlena()) {
            throw new EstaPlenaEX("La matriu està plena");
        }
        if (JugadorEstaEnMatriz(jugador)) {
            throw new Maex("El jugador ja està en la matriu");
        }
        elsJugadors[PrimerNulo()] = jugador;
    }

    /**
     * elimina els null de la matriu.
     */
    public void eliminaNulls() {
        elsJugadors = new Jugador[ContarJugadores()];
    }

    /**
     * @return un text amb la puntuació dels jugadors
     */
    public String getPuntuacio() {
String puntuacion="";
        for (Jugador JugadorMatriz : elsJugadors) {
            puntuacion += JugadorMatriz.toString() + "\n";
        }
        return puntuacion;

    }

    private int ContarJugadores() {
        int contadorJug = 0;
        for (Jugador JugadorMatriz : elsJugadors) {
            if (JugadorMatriz != null) {
                contadorJug++;
            }
        }
        return contadorJug;

    }

    private boolean JugadorEstaEnMatriz(Jugador jugador) {
        for (Jugador JugadorMatriz : elsJugadors) {
            if (JugadorMatriz == jugador) {
                return true;
            }
        }
        return false;
    }

    private boolean MatrizLlena() {
        for (Jugador JugadorMatriz : elsJugadors) {
            if (JugadorMatriz == null) {
                return false;
            }
        }
        return true;
    }

    private int PrimerNulo() {
        int primerNulo = 0;
        for (int i = 0; i < elsJugadors.length; i++) {
            if (elsJugadors[i] == null) {
                return primerNulo = i;
            }
        }
        return primerNulo;
    }
    
    
}
