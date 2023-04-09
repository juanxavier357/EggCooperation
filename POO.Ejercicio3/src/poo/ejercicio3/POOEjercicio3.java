/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio3;

import Entidad.Operacion;
import Service.OperacionService;
import java.util.Scanner;

/**
 * 3. Crear una clase llamada Operacion que tenga como atributos privados
 * numero1 y numero2. A continuación, se deben crear los siguientes métodos: a)
 * Método constructor con todos los atributos pasados por parámetro. b) Metodo
 * constructor sin los atributos pasados por parámetro. c) Métodos get y set. d)
 * Método para crearOperacion(): que le pide al usuario los dos números y los
 * guarda en los atributos del objeto. e) Método sumar(): calcular la suma de
 * los números y devolver el resultado al main. f) Método restar(): calcular la
 * resta de los números y devolver el resultado al main g) Método multiplicar():
 * primero valida que no se haga una multiplicación por cero, si fuera a
 * multiplicar por cero, el método devuelve 0 y se le informa al usuario el
 * error. Si no, se hace la multiplicación y se devuelve el resultado al main h)
 * Método dividir(): primero valida que no se haga una división por cero, si
 * fuera a pasar una división por cero, el método devuelve 0 y se le informa al
 * usuario el error se le informa al usuario. Si no, se hace la división y se
 * devuelve el resultado al main.
 *
 * @author Juan Xavier
 */
public class POOEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OperacionService opeService = new OperacionService();
        Operacion operacion = opeService.crearOperacion();
        Scanner leer = new Scanner(System.in);
        System.out.println("");
        System.out.println("Elegir un número de opción de la operación:");
        System.out.println("1. Sumar\n" + "2. Restar\n" + "3. Multiplicar\n" + "4. Dividir\n" + "5. Salir\n");
        int opcion = leer.nextInt();
        System.out.println("Eligió la opción: " + opcion);
        switch (opcion) {
            case 1:
                System.out.println("La suma de los números es: " + opeService.Sumar(operacion));
                break;
            case 2:
                System.out.println("La resta de los números es: " + opeService.Restar(operacion));
                break;
            case 3:
                System.out.println("La multiplicación de los números es: " + opeService.Multiplicar(operacion));
                break;
            case 4:
                System.out.println("La división de los números es: " + opeService.Dividir(operacion));
                break;
            case 5:
                System.out.println("La calculadora ha finalizado correctamente");
                break;
            default:
                System.out.println("Ingrese una opción correcta, vuelva a intentarlo");
                break;
        }

    }

}
