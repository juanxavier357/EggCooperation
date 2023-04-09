/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo
 * y el promedio de n números (n>0). El valor de n se solicitará al principio
 * del programa y los números serán introducidos por el usuario. Realice dos
 * versiones del programa, una usando el bucle “while” y otra con el bucle “do -
 * while”
 */
public class EjercicioExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Calculadora del valor máximo, valor mínimo y el promedio de n números");
        System.out.println("Ingrese la cantidad de números:");
        int n = leer.nextInt();
        System.out.println("Ingrese los números:");
        int cont = 0, num = 0, max = 0, min = 0, suma = 0;
        double prom = 0;
        while (cont < n) {         
            num = leer.nextInt();
            suma += num;
            if (cont == 0){
                min = num;
            }
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
            cont++;
        }
        prom = suma / n;
        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);
        System.out.println("El promedio de los números es: " + prom);
    }
}
