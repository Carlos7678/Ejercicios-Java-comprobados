/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exa202206o;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import logica.LFPrincipal;
import vista.FPrincipal;

/**
 *
 * @author Carlos Soriano
 */
public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }
        FPrincipal f = new FPrincipal();
        LFPrincipal lf = new LFPrincipal(f);
        f.setOidor(lf);
        f.setVisible(true);
    }

    public static int getNumJugadores() {
        FPrincipal f = new FPrincipal();
        int numJugadores = 0;
        do {
            try {
                numJugadores = Integer.parseInt(JOptionPane.showInputDialog(f, "Introduce el numero de jugadores (4 a 8)"));
                if (numJugadores < 4 || numJugadores > 8) {
                    JOptionPane.showMessageDialog(f, "El numero tiene que estar entre 4 y 8");
                }
            } catch (NumberFormatException numberFormatException) {
                JOptionPane.showMessageDialog(f, "Formato incorrecto (tiene que ser un numero entero)");
                numJugadores = 0;
            }
        } while (numJugadores < 4 || numJugadores > 8);
        return numJugadores;
    }

}
