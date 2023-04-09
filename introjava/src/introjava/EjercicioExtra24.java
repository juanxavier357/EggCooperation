/*
Realizar un programa que complete un vector con los N primeros números de la sucesión 
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes 
números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula: 
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba 
como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author free
 */
public class EjercicioExtra24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la Dimensión del Vector de Fibonacci:");
        int n = leer.nextInt();
        int[] V = new int[n];
        Fibonacci(n,V);
    }

    public static void Fibonacci(int n, int[] V) {
        int f;
        int a = 1;
        int b = 1;
        for (int i = 0; i < n; i++){
            if (i < 2) {
                V[0] = 1;
                V[1] = 1;
            } else {
                f = a + b;
                b = a;
                a = f;
                V[i] = f;
            }
        }
        System.out.println("Vector de Fibonacci de Dimensión " + n + ":");
        System.out.print("V = {");
        for (int i = 0; i < n; i++) {
            System.out.print(V[i] + " ");        
        }
        System.out.print("}");
    }
}
