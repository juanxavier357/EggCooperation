/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio6;

import Entidad.Cafetera;
import Service.CafeteraService;

/**
6. Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la 
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes 
métodos: 
 Constructor predeterminado o vacío 
 Constructor con la capacidad máxima y la cantidad actual 
 Métodos getters y setters. 
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad 
máxima. 
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la 
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El 
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
cuanto quedó la taza. 
 Método vaciarCafetera(): pone la cantidad de café actual en cero. 
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
recibe y se añade a la cafetera la cantidad de café indicada. 
 * @author Juan Xavier
 */
public class POOEjercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CafeteraService cafeService = new CafeteraService();
        Cafetera cafetera = cafeService.llenarCafetera();
        
        System.out.println("");
        cafeService.servirTaza();
        System.out.println("");
        cafeService.vaciarCafetera();
        System.out.println("");
        cafeService.agregarCafe();   
    }
    
}
