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
    
    public static Double Elevar(Double base, int exp) {
        if (exp == 1) {
            return base;
        } else {
            return base * Elevar(base, (exp - 1));
        }
    }
}
