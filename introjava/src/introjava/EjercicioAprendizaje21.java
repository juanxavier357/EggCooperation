/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/**
 *
 * @author free
 */
public class EjercicioAprendizaje21 {

    /**
     * 00 01 02 03 10 11 12 13 20 21 22 23 30 31 32 33 Dadas dos matrices
     * cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 3x3,
     * se solicita escribir un programa en el cual se compruebe si la matriz P
     * está contenida dentro de la matriz M. Para ello se debe verificar si
     * entre todas las submatrices de 3x3 que se pueden formar en la matriz M,
     * desplazándose por filas o columnas, existe al menos una que coincida con
     * la matriz P. En ese caso, el programa debe indicar la fila y la columna
     * de la matriz M en la cual empieza el primer elemento de la submatriz P.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] P = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] M = {
            {5, 7, 6, 1, 4, 9, 2, 0, 1, 5},
            {2, 1, 9, 8, 7, 6, 5, 4, 3, 7},
            {8, 3, 0, 3, 4, 5, 6, 7, 8, 8},
            {3, 7, 9, 2, 1, 6, 3, 4, 9, 4},
            {4, 1, 3, 4, 4, 5, 6, 7, 8, 0},
            {5, 2, 7, 6, 7, 8, 9, 10, 7, 2},
            {9, 1, 2, 3, 3, 2, 5, 4, 6, 3},
            {8, 4, 5, 6, 3, 1, 1, 2, 3, 9},
            {4, 7, 8, 9, 9, 10, 4, 5, 6, 7},
            {0, 5, 0, 6, 1, 2, 7, 8, 9, 1}};

        int a = 0, b = 0, c = 0, d = 0, e = 0;
        for (int i = 0; i < M.length; i++) {
            if (i < M.length - 1) {
                a = i + 1;
            }
            if (i < M.length - 2) {
                b = i + 2;
            }
            for (int j = 0; j < M.length; j++) {
                if (j < M.length - 1) {
                    c = j + 1;
                }
                if (j < M.length - 2) {
                    d = j + 2;
                }
                if (P[0][0] == M[i][j]
                        && P[0][1] == M[i][c]
                        && P[0][2] == M[i][d]
                        && P[1][0] == M[a][j]
                        && P[1][1] == M[a][c]
                        && P[1][2] == M[a][d]
                        && P[2][0] == M[b][j]
                        && P[2][1] == M[b][c]
                        && P[2][2] == M[b][d]) {
                    e++;
                    System.out.println("Matriz " + e + "° de 3x3 que coincide dentro de la matriz de " + M.length + "x" + M.length);
                    System.out.println("fila inicio: " + i);
                    System.out.println("columna inicio: " + j);
                    System.out.println("fila final: " + b);
                    System.out.println("columna final: " + d);
                    System.out.println("[" + i + " " + j + "] " + "[" + i + " " + (j + 1) + "] " + "[" + i + " " + (j + 2) + "]");
                    System.out.println("[" + (i + 1) + " " + j + "] " + "[" + (i + 1) + " " + (j + 1) + "] " + "[" + (i + 1) + " " + (j + 2) + "]");
                    System.out.println("[" + (i + 2) + " " + j + "] " + "[" + (i + 2) + " " + (j + 1) + "] " + "[" + (i + 2) + " " + (j + 2) + "]");
                    System.out.println("");
                }
            }

        }
        if (e > 0) {
            if (e == 1) {
                System.out.println("Existe 1 matriz de 3x3 que coincide dentro de la matriz de " + M.length + "x" + M.length);
            } else {
                System.out.println("Existen " + e + " matrices de 3x3 que coinciden dentro de la matriz de " + M.length + "x" + M.length);
            }
        } else {
            System.out.println("No hay una matriz de 3x3 que coincida dentro de la matriz de " + M.length + "x" + M.length);
        }
    }

}
