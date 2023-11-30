/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Soriano
 */
public class Partido {

    private String nombre;
    private int votos;
    private double porcentajeVotos;
    private List<Integer> Cocientes;

    public Partido(String nombre, int votos) throws MaEX {
        if (nombre == null || nombre.isBlank()) {
            throw new MaEX("El nombre del partido no puede estar en blanco");
        }
        if (votos < 0) {
            throw new MaEX("El numero de votos tiene que ser mayor o igual a 0");
        }
        this.nombre = nombre;
        this.votos = votos;
        Cocientes = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("%s     %d vots %.6f%% dels vots", nombre, votos, porcentajeVotos);
    }

    public int getVotos() {
        return votos;
    }

    public double getPorcentajeVotos() {
        return porcentajeVotos;
    }

    public void setPorcentajeVotos(double porcentajeVotos) {
        this.porcentajeVotos = porcentajeVotos;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Integer> getCocientes() {
        return Cocientes;
    }

    public boolean estaElCocienteEnLaLista(int Nuevocociente) {
        for (Integer cociente : Cocientes) {
            if (cociente == Nuevocociente) {
                return true;
            }
        }
        return false;
    }
}
