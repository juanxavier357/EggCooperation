/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;
import java.util.Scanner;
/**
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y 
muestre la suma de sus elementos.
 */
public class EjercicioExtra22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n, m, suma = 0;
        System.out.println("Matriz de tamaño NxM");
        System.out.println("Ingrese la cantidad de filas:");
        n = leer.nextInt();
        System.out.println("Ingrese la cantidad de columnas:");
        m = leer.nextInt();
        int[][] M = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                M[i][j] = (int) (Math.random()*10);
                suma += M[i][j];
                System.out.print("[" +M[i][j]+ "]");
            }
            System.out.println("");
        }
        System.out.println("La suma de los elementos de la matriz es:");
        System.out.println(suma);
    }    
}
