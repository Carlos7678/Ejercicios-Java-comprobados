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
public class Elecciones {

    private int escaños;
    private int totalVotos;
    private int votosEnBlanco;
    private List<Partido> partidos;
    private final List<Partido> partidosConMasDel3PorCiento;

    public Elecciones() {
        partidos = new ArrayList<>();
        partidosConMasDel3PorCiento = new ArrayList<>();
        escaños = 0;
        votosEnBlanco = -1;
        totalVotos = 0;

    }

    public List<Partido> getPartidosConMasDel3PorCiento() {
        return partidosConMasDel3PorCiento;
    }

    public void setEscaños(int escaños) throws MaEX {
        if (escaños < 1) {
            throw new MaEX("El numero de escaño es mayor o igual a 1");
        }
        this.escaños = escaños;
    }

    public void setTotalVotos(int totalVotos) {
        this.totalVotos = totalVotos;
    }

    public void setVotosEnBlanco(int votosEnBlanco) throws MaEX {
        if (votosEnBlanco < 0) {
            throw new MaEX("El numero de votos en blanco es mayor o igual a 0");
        }
        this.votosEnBlanco = votosEnBlanco;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }

    public boolean escañosMayorA0() {
        return escaños > 0;
    }

    public int getEscaños() {
        return escaños;
    }

    public int getTotalVotos() {
        return totalVotos;
    }

    public int getVotosEnBlanco() {
        return votosEnBlanco;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void sacarVotosTotales() {
        totalVotos = votosEnBlanco;
        if (!partidos.isEmpty()) {
            for (Partido partido : partidos) {
                totalVotos += partido.getVotos();
            }
        }
    }

    public void darPorcentajeVotosPartido() {
        if (!partidos.isEmpty()) {
            for (Partido partido : partidos) {
                partido.setPorcentajeVotos(partido.getVotos() * 100 / totalVotos);
            }
        }
    }

    public String listadoPartidos() {
        String listado = "";
        if (partidos.isEmpty()) {
            return "No hay ningun partido para mostrar";
        }
        listado += "Listado de los partidos \n--------------------------------\n";
        for (Partido partido : partidos) {
            listado += partido + "\n";
        }
        return listado;
    }

    public boolean hayVotosEnBlanco() {
        return votosEnBlanco >= 0;
    }

    public boolean hayEscaños() {
        return escaños >= 1;
    }

    public void calcularPartidosConMasDel3PorCiento() {
        if (!partidos.isEmpty()) {
            for (Partido partido : partidos) {
                if (partido.getPorcentajeVotos() >= 3) {
                    if (!partidosConMasDel3PorCiento.contains(partido)) {
                        partidosConMasDel3PorCiento.add(partido);
                    }
                }
            }
        }
    }

    public void calcularCocientes() {
        if (!partidosConMasDel3PorCiento.isEmpty() || !hayEscaños()) {
            for (Partido partido : partidosConMasDel3PorCiento) {
                for (int i = 1; i <= escaños; i++) {
                    if (!partido.estaElCocienteEnLaLista(partido.getVotos() / i)) {
                        partido.getCocientes().add(partido.getVotos() / i);
                    }
                }
            }
        }
    }

    public String listadoCocientes() {
        String listado = "Quocients del partits\n-------------------\n";
        for (Partido partido : partidosConMasDel3PorCiento) {
            listado += partido.getNombre();
            listado += " " + partido.getCocientes().get(0);
            if (escaños > 1) {
                for (int i = 1; i < partido.getCocientes().size(); i++) {
                    listado += "/" + partido.getCocientes().get(i);
                }
            }
            listado += "\n";
        }
        return listado;
    }
}
