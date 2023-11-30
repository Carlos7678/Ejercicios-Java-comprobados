/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import oovv.MJoc;
import vista.FPrincipal;

/**
 *
 * @author Carlos Soriano
 */
public class CFPrincipal implements ActionListener{
 private FPrincipal ventana;

    public CFPrincipal(FPrincipal ventana) {
        this.ventana = ventana;
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        MJoc.empezarJuego();
    }

   


}
