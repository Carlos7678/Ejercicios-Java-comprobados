/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

/**
 *
 * @author Carlos Soriano
 */
public class Tutil {

    public static int getAleatorio(int inf, int sup) {
        if (inf > sup) {
            return getAleatorio(sup, inf);
        }
        return inf + (int) (Math.random() * (sup - inf + 1));
    }
}
