/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
 * a medida que el usuario las va ingresando, construya una “sopa de letras para
 * niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en
 * orden horizontal en una fila que será seleccionada de manera aleatoria. Una
 * vez concluida la ubicación de las palabras, rellene los espacios no
 * utilizados con un número aleatorio del 0 al 9. Finalmente imprima por
 * pantalla la sopa de letras creada. Nota: Para resolver el ejercicio deberá
 * investigar cómo se utilizan las siguientes funciones de Java substring(),
 * Length() y Math.random().
 */
public class EjercicioExtra23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String[][] M = new String[20][20];
        int fila = 20, f;
        int columna;
        int lon, cont = 0, aux = -1;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j] = "*";
            }
        }
        System.out.println("Ingrese 5 palabras de mínimo 3 y hasta 5 caracteres:");
        do {
            String palabra = leer.nextLine();
            lon = palabra.length();
            if (lon > 2 && lon < 6) {
                cont++;
                do {
                    f = (int) (Math.random() * 20);
                } while (fila == f);
                fila = f;
                columna = (int) (Math.random() * 16);
                for (int j = columna; j < columna + lon; j++) {
                    aux++;
                    M[fila][j] = palabra.substring(aux, aux + 1);
                }
                aux = -1;
            } else {
                System.out.println("Ingrese una palabra de mínimo 3 y hasta 5 caracteres:");
            }
        } while (cont < 5);

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if ("*".equals(M[i][j])) {
                    M[i][j] = String.valueOf((int) (Math.random() * 10));
                }
            }
        }

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                System.out.print("[" + M[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
