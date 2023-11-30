/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

/**
 *
 * @author Carlos Soriano
 */
public class Muutil {

    /**
     * deixa les lletres i els blancs en un text.
     *
     * @param txt del qual eliminar els caràcters que no sòn lletres o espai en
     * blanc
     * @return una cadena de text amb els caràcters de txt sense els caràcters
     * que no són lletres ni l'espai en blanc
     */
    public static String deixaBlancsiLletres(String txt) {
        if (txt.isEmpty()) {
            return "";
        } else {
            String nuevotxt = "";
            for (int i = 0; i < txt.length(); i++) {
                if (Character.isLetter(txt.charAt(i)) || Character.isWhitespace(txt.charAt(i))) {
                    nuevotxt += txt.charAt(i);
                }
            }
            return nuevotxt;
        }
    }

    /**
     * suma els caràcters d'un text. suma els codis dels caràcters.
     *
     * @param txt amb els caràcters
     * @return la suma els codis dels caràcters de txt.
     */
    public static int sumaCaracters(String txt) {
        int codigoCar = 0;
        for (int i = 0; i < txt.length(); i++) {
            codigoCar += Character.getNumericValue(txt.charAt(i));
        }
        return codigoCar;
    }
}
