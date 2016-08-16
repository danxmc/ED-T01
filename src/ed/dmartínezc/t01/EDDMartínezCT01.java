/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.dmartínezc.t01;

import java.util.Scanner;

/**
 *
 * @author Daniel Aelxandro Martínez Ch. A00513954
 * 3er Semestre
 */
public class EDDMartínezCT01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double x;
        int n;
        Scanner scan = new Scanner(System.in);
        
        /**
         * Pregunta el numero base que se va alevar al igual que el exponente,
         * asegurandose que sea mayor a 0.
         */
        System.out.println("Escribe la base: ");
        x = scan.nextDouble();
        do {
            System.out.println("Escribe el exponente (mayor a 0): ");
            n = scan.nextInt();
        } while (n < 0);
        
        System.out.println("El resultado es: " + NumeroElevado.Elevar(x, n));
    }
    
}
