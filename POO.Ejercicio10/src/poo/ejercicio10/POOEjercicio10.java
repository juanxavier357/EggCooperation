/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio10;

import Entidad.Arreglo;
import java.util.Arrays;

/**
 * 10. Realizar un programa en Java donde se creen dos arreglos: el primero será
 * un arreglo A de 50 números reales, y el segundo B, un arreglo de 20 números,
 * también reales. El programa deberá inicializar el arreglo A con números
 * aleatorios y mostrarlo por pantalla. Luego, el arreglo A se debe ordenar de
 * menor a mayor y copiar los primeros 10 números ordenados al arreglo B de 20
 * elementos, y rellenar los 10 últimos elementos con el valor 0.5. Mostrar los
 * dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.
 *
 *
 * @author Juan Xavier
 */
public class POOEjercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arreglo arreglo = new Arreglo();
        iniciar(arreglo);
        System.out.println("Arreglo de 50 números reales aleatorios:");
        System.out.println(Arrays.toString(arreglo.getArreglo1()));
        ordenar(arreglo);
        System.out.println("Arreglo de los 50 números ordenados de menor a mayor:");
        System.out.println(Arrays.toString(arreglo.getArreglo1()));
        rellenar(arreglo);
        System.out.println("Arreglo de 20 números reales:");
        System.out.println(Arrays.toString(arreglo.getArreglo2()));
    }

    public static Arreglo iniciar(Arreglo arreglo) {
        double[] array = new double[50];
        double azar, redon;
        for (int i = 0; i < 50; i++) {
            azar = Math.random() * 100;
            redon = Math.round(azar);
            array[i] = redon / 10;
        }
        arreglo.setArreglo1(array);
        return arreglo;
    }

    public static Arreglo ordenar(Arreglo arreglo) {
        double[] array = arreglo.getArreglo1();
        double aux;
        for (int i = 0; i < 50; i++) {
            for (int j = i+1; j < 50; j++) {
                if (i < 49) {
                    if (array[i] > array[j]) {
                        aux = array[i];
                        array[i] = array[j];
                        array[j] = aux;
                    }
                }
            }
        }
        arreglo.setArreglo1(array);
        return arreglo;
    }
    
    public static Arreglo rellenar(Arreglo arreglo) {
        double[] array = new double[20];
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                array[i] = arreglo.getArreglo1()[i];
            } else {
                array[i] = 0.5;
            }  
        }
        arreglo.setArreglo2(array);
        return arreglo;
    }
}
