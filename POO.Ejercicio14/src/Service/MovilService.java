/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author free
 */
public class MovilService {
    Scanner leer = new Scanner(System.in);
    Movil movil = new Movil();
    /*
    marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será 
un arreglo numérico de dimensión 7 (siete
    */
    public Movil cargarCelular(){
        System.out.println("DATOS DEL MOVIL");
        System.out.println("Ingrese la marca del móvil:");
        movil.setMarca(leer.next());
        System.out.println("Ingrese el precio (S/.) del móvil:");
        movil.setPrecio(leer.nextInt());
        System.out.println("Ingrese el modelo del móvil:");
        leer.nextLine();
        movil.setModelo(leer.nextLine());
        System.out.println("Ingrese la capacidad de memoria RAM (Gb) del móvil:");
        movil.setMemoriaRam(leer.nextInt());
        System.out.println("Ingrese la capacidad de almacenamiento del móvil:");
        movil.setAlmacenamiento(leer.nextInt());
        System.out.println("Ingrese el código del móvil:");
        ingresarCodigo();
        return movil;
    }
    
    public Movil ingresarCodigo(){
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = leer.nextInt();
        }
        movil.setCodigo(array);
        return movil;
    }
}
