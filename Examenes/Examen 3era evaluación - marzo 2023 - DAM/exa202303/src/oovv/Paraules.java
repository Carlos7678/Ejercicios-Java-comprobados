/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

/**
 *
 * @author Carlos Soriano
 */
public class Paraules {

    private String[] lesParaules;

    /**
     * Constructor de Paraules.
     */
    public Paraules() {
        lesParaules = new String[1000];
    }

    /**
     * afegeix una paraula a la matriu de paraules.
     *
     * @param paraula a afegir
     * @return <code>true</code> si s'afegeix la paraula a la
     * matriu<br><code>false</code> si no s'afegeix la paraula a la matriu
     */
    public boolean afegeix(String paraula) {
        if (lesParaules.length != 1000) {
            for (int i = 0; i < lesParaules.length; i++) {
                /* si la palabra esta en la matriz retorna falso*/
                if (lesParaules[i].equals(paraula)) {
                    return false;
                } else {
                    /* si se ha llegado aqui la palabra no esta en la matriz por lo que se busca un espacio nulo 
                    para añadir la palabra*/
                    if (lesParaules[i] == null) {
                        lesParaules[i] = paraula;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
