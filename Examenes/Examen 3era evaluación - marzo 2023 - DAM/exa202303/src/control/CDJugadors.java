/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oovv.EstaPlenaEX;
import oovv.Jugador;
import oovv.Jugadors;
import oovv.Maex;
import vista.DJugadors;

/**
 *
 * @author Carlos Soriano
 */
public class CDJugadors implements ActionListener {

    private DJugadors ventana;
    private Jugador jugador;
   private Jugadors jugadores;
    public CDJugadors(DJugadors ventana) {
        this.ventana = ventana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "Afegeix jugador":
            {
                try {
                    jugadores.afegeix(jugador=new Jugador(ventana.getName()));
                    ventana.afegeixJugador();
                } catch (Maex | EstaPlenaEX ex) {
                    JOptionPane.showMessageDialog(ventana, ex.getMessage());
                }
            }

                
                break;

            case "Tanca":
                ventana.dispose();
                break;

        }
    }
}
