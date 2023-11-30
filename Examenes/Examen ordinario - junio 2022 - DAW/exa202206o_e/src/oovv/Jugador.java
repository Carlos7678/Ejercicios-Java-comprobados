/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import baralla.Carta;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Carlos Soriano
 */
public class Jugador {

    private Nombre nombreCompleto;
    private int dinero;
    private List<Carta> baraja;
    private int apuesta;

    public int getApuesta() {
        return apuesta;
    }

    public void setApuesta(int apuesta) {
        if (apuesta>25) {
            throw new apuestaMayor25EX();
        }
        this.apuesta = apuesta;
    }

    public Nombre getNombreCompleto() {
        return nombreCompleto;
    }

    public int getDinero() {
        return dinero;
    }

    public Jugador() {
        nombreCompleto = Noms.getNomComplet();
        dinero = 50;
        baraja = new ArrayList<>();
        apuesta = 5;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nombreCompleto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        return Objects.equals(this.nombreCompleto, other.nombreCompleto);
    }

    @Override
    public String toString() {
        return "Nombre= " + nombreCompleto + ", Dinero= " + dinero + ", Apuesta= " + apuesta;
    }

    public List<Carta> getBaraja() {
        return baraja;
    }

    public Carta getCarta() {
        return baraja.get(0);
    }
    
}
