/*
llegir quants jugadors van jugar (de 3 a 6) i els seus noms, no pot haver-hi noms buits ni repetits
un jugador entra un text de 30 caràcters com a màxim si es passa no puntua
el text es separa en paraules, el separador és l'espai en blanc
es sumen els valors de les lletres de les paraules no repetides
si la suma 
és multiple de 3 o 5 guanya 2 punt
és multiple de 7 guanya 3 punt
és multiple de 13 guanya 4 punt
en els altres casos guanya 1 punt
en pantalla es presenta les paraules que s'han comptat, la suma, els punts obtesos
quant han jugat tots els jugadors, es modtra totes les paraules escrites fins al moment
guanya el primer jugador que arriba a 25 punts
se mostra els noms dels jugadors i els seus punts
 */
package exapuntuatext;

import control.CDJugadors;
import control.CFPrincipal;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import vista.DJugadors;
import vista.FPrincipal;

/**
 *
 * @author Carlos Soriano
 */
public class Inici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try { // posa el LAF del sistema
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FPrincipal f = new FPrincipal();
                CFPrincipal c = new CFPrincipal(f);
                f.setOidor(c);
                f.setVisible(true);
                DJugadors e = new DJugadors(f ,true);
                CDJugadors ce = new CDJugadors(e);
                e.setOidor(ce);
                e.setVisible(true);
            }
        });
    }

}
