/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author free
 */
public class CircunferenciaService {
    
    Scanner leer = new Scanner(System.in);
    Circunferencia circunferencia = new Circunferencia();
    
    public Circunferencia crearCircunferencia(){
        System.out.println("Ingrese el radio de la circunferencia:");
        circunferencia.setRadio(leer.nextDouble());
        return circunferencia;
    }
    
    public Double Area(Circunferencia circunferencia){
        return Math.PI*Math.pow(circunferencia.getRadio(), 2);
    }
    
    public Double Perimetro(Circunferencia circunferencia){
        return 2*Math.PI*circunferencia.getRadio();
    }
    
}
