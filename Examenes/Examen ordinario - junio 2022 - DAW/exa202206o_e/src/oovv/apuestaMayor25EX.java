/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package oovv;

/**
 *
 * @author Carlos Soriano
 */
public class apuestaMayor25EX extends RuntimeException{

    /**
     * Creates a new instance of <code>apuestaMayor25</code> without detail
     * message.
     */
    public apuestaMayor25EX() {
        super("Las apuestas no pueden ser mayor a 25");
    }

    /**
     * Constructs an instance of <code>apuestaMayor25</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public apuestaMayor25EX(String msg) {
        super(msg);
    }
}
