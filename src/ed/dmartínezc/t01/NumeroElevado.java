/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.dmartínezc.t01;
/**
 *
 * @author Daniel Alexadro Martínez Ch. A00513954
 * 3er Semestre
 */
public class NumeroElevado {
    /**
     * Constructor
     */
    public NumeroElevado() {
        
    }
    
    /**
     * 
     * @param base, la base que va a ser elevado
     * @param exp, el numero de veces que se elevara la base
     * @return base (se va multiplicando por si misma en cada ciclo recursivo)
     */
    public static Double Elevar(Double base, int exp) {
        /**
         * Caso Base: Cuando el exponente llegue a uno regresara la base
         */
        if (exp == 1) {
            return base;
        } else {
            /**
             * Dominio: la base se va multiplicando por si misma, restandole 1
             * al exponente cada vez que un ciclo recursivo pasa.
             */
            return base * Elevar(base, (exp - 1));
        }
    }
}
