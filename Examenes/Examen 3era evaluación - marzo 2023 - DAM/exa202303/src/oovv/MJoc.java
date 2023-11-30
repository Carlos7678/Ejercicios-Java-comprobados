/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import vista.FPrincipal;

/**
 *
 * @author Carlos Soriano
 */
public class MJoc {

    public static void empezarJuego() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
private FPrincipal ventana;
private Jugadors jugadores;
private int turno=1;



    public MJoc(FPrincipal ventana, Jugadors jugadores) {
        this.ventana = ventana;
        this.jugadores = jugadores;
    }
    
  public void afegeix() {

    } 
  public  void siguienteTurno() {
        turno++;    
    }
  
  public boolean HaGanado(Jugador jugador){
      if (jugador.getPunts()>13) {
          return true;
      }
    return false;    
  }
  
}
