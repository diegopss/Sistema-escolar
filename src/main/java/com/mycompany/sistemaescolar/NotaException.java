
package com.mycompany.sistemaescolar;

/**
 *
 * @author die-g
 */
public class NotaException extends Exception {
    public NotaException (String nota){
        super("A Nota " + nota + " Não é um numero");
    }
    
}
