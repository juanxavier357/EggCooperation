/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author free
 */
public class RectanguloService {
    
    Scanner leer = new Scanner(System.in);
    Rectangulo rectangulo = new Rectangulo();
    
    public Rectangulo crearRectangulo(){
        System.out.println("OBJETO RECTANGULO");
        System.out.println("Ingrese la base del rectángulo:");
        rectangulo.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectángulo:");
        rectangulo.setAltura(leer.nextInt());
        return rectangulo;
    }
    
    public int Superficie(Rectangulo rectangulo){
        return rectangulo.getBase()*rectangulo.getAltura();
    }   
    
    public int Perimetro(Rectangulo rectangulo){
        return 2*(rectangulo.getBase()+rectangulo.getAltura());
    }
    
    public String Dibujar(Rectangulo rectangulo){
        for (int i = 0; i < rectangulo.getAltura(); i++) {
            for (int j = 0; j < rectangulo.getBase(); j++) {
                if (i == 0 || i == rectangulo.getAltura()-1 || j == 0 || j == rectangulo.getBase()-1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
        return "";
    }
}
