/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

import java.util.Scanner;

/**
 *
 * @author Juan Xavier
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("LISTA DE NÚMEROS PRIMOS");
        System.out.println("Ingrese la cantidad de números primos:");
        int n = in.nextInt();
        System.out.println("Los números primos son:");
        Primos(n);
    }

    public static void Primos(int can) {
        int p = 0, num = 2, cont = 0;
        while (p < can) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                System.out.print(num + " ");
                p++;
            }
            cont = 0;
            num++;
        }
    }
}
