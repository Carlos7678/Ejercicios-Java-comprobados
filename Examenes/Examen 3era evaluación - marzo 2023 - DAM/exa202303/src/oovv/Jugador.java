/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import java.util.Objects;

/**
 *
 * @author Carlos Soriano
 */
public class Jugador {

    private String nom;
    private int punts;

    /**
     * constructor de Jugador.
     *
     * @param nom del jugador
     * @throws Maex si el nom està buit
     */
    public Jugador(String nom) throws Maex {
         if (nom == null || nom.isBlank()) {
            throw new Maex("“El nom del jugador no pot estar en blanc");
        }
        this.nom = nom;
        punts = 0;
    }

    /**
     * @return el nom del jugador.
     */
    public String getNom() {
        return nom;//
    }

    /**
     * @return els punts del jugador.
     */
    public int getPunts() {
        return punts;//
    }

    @Override
    public String toString() {
        return "[" + nom + "_punts=" + punts + "]";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nom);
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
        return Objects.equals(this.nom, other.nom);
    }

}
