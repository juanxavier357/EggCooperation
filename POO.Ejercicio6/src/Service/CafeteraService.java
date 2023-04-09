/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author free
 */
public class CafeteraService {
    
    Scanner leer = new Scanner(System.in);
    Cafetera cafetera = new Cafetera();
    
    public Cafetera llenarCafetera(){
        System.out.println("PROGRAMA NESPRESSO");
        System.out.println("Ingrese la capacidad máxima de la cafetera:");
        cafetera.setCapacidadMaxima(leer.nextInt());
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("Se ha llenado la cafetera con " + cafetera.getCantidadActual() + "mL de café");
        return cafetera;
    }
    
    public Cafetera servirTaza(){
        System.out.println("Ingrese el tamaño de la taza vacía:");
        int tamaño = leer.nextInt();
        if (tamaño > cafetera.getCantidadActual()) {
            cafetera.setCantidadActual(0);
            System.out.println("La taza no se llenó con " + tamaño + "mL de café");
            System.out.println("La cafetera se quedó vacía:");
        } else {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamaño);
            System.out.println("La taza se llenó con " + tamaño + "mL de café");
            System.out.println("La cafetera se quedó con " + cafetera.getCantidadActual() + "mL de café");
        }
        return cafetera;
    }
    
    public Cafetera vaciarCafetera(){
        cafetera.setCantidadActual(0);
        System.out.println("Se ha vaciado la cafetera:");
        System.out.println("La cafetera se quedó con " + cafetera.getCantidadActual() + "mL de café");
        return cafetera;
    }
    
    public Cafetera agregarCafe(){
        System.out.println("Agrega una cantidad de café para añadir a la cafetera:");
        int añadir = leer.nextInt();
        cafetera.setCantidadActual(cafetera.getCantidadActual() + añadir);
        System.out.println("Se ha agregado a la cafetera " + cafetera.getCantidadActual() + "mL de café");
        return cafetera;
    }
    
}
