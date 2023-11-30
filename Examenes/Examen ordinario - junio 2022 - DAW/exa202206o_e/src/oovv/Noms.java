/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

/**
 *
 * @author Carlos Soriano
 */
public class Noms {

    private static String[] elsNoms = {
        "David", "María", "Carmen", "Josefa", "Isabel", "Manuel", "Francisco",
        "Ana", "Laura", "Felicia", "Cristina", "Marta", "Álvaro", "Diego",
        "Mercedes", "Raquel", "Juana", "Lorenzo", "Antonio", "José",
        "Teresa", "Beatriz", "Nuria", "Silvia", "Víctor", "Roberto", "Jaime",
        "Patricia", "Irene", "Andrea", "Rocío", "Mónica", "Alba", "Ángela",
        "Rosario", "Juan", "David", "Javier", "Jesús", "Julia", "Rosa",
        "Sonia", "Fernando", "Pablo", "Luis", "Sergio", "Jorge", "Alberto",
        "Adrián", "Raúl", "Enrique", "Ramón", "Vicente", "Iván", "Rubén",
        "Oscar", "Andrés", "Joaquín", "Santiago", "Eduardo"
    };

    private static String[] elsCognoms = {
        "Cuenca", "Rebollo", "Moñino", "Belinchón", "Vallejo", "Alamà",
        "Linde", "Martorell", "Rojo", "Aizpeolea", "Saiz", "Arroyo", "Mejía",
        "Mañana", "Sanguino", "Ávalos", "Cordero", "Mollà", "Sainz", "Arribas",
        "Beauregard", "Camacho", "Gracia", "Saiz", "Zafra", "Llaneras", "Galán",
        "Lahoz", "Doncel", "Peláez", "Ormazabal", "Rojas", "García", "González",
        "Fernández", "López", "Martínez", "Sánchez", "Pérez", "Gómez", "Martín",
        "Ruiz", "Hernández", "Díaz", "Moreno", "Álvarez", "Muñoz", "Romero"
    };

    public static Nombre getNomComplet() {
        String nombre = elsNoms[Tutil.getAleatorio(0, elsNoms.length - 1)];
        String primerApellido = elsCognoms[Tutil.getAleatorio(0, elsCognoms.length - 1)];
        String segundoApellido = "";
        do {
            segundoApellido = elsCognoms[Tutil.getAleatorio(0, elsCognoms.length - 1)];
        } while (segundoApellido.equalsIgnoreCase(primerApellido));
        return new Nombre(nombre, primerApellido, segundoApellido);
    }
}
