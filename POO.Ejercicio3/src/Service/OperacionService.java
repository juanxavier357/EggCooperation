/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author free
 */
public class OperacionService {
    
    Scanner leer = new Scanner(System.in);
    Operacion operacion = new Operacion();
    
    public Operacion crearOperacion(){
        System.out.println("CALCULADORA DE NUMEROS");
        System.out.println("Ingrese el primer número:");
        operacion.setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo número:");
        operacion.setNumero2(leer.nextInt());
        return operacion;
    }
    
    public int Sumar(Operacion operacion) {
        return operacion.getNumero1() + operacion.getNumero2();
    }
    
    public int Restar(Operacion operacion) {
        return operacion.getNumero1() - operacion.getNumero2();
    }
    
    public int Multiplicar(Operacion operacion) {
        if(operacion.getNumero1() == 0 || operacion.getNumero2() == 0){
            System.out.println("Error: Ninguno de los números debe ser cero");
            return 0;
        } else {
            return operacion.getNumero1() * operacion.getNumero2();
        }      
    }
    
    public double Dividir(Operacion operacion) {
        if(operacion.getNumero2() == 0){
            System.out.println("Error: No se puede dividir entre cero");
            return 0;
        } else {
            return (double) operacion.getNumero1() / operacion.getNumero2();
        }      
    }
    
}
