/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author free
 */
public class PersonaService {
    
    Scanner leer = new Scanner(System.in);
    Persona persona = new Persona();
    boolean valor = true;
    
    public Persona crearPersona(){
        System.out.println("Ingrese su nombre:");
        persona.setNombre(leer.next());
        System.out.println("Ingrese su edad:");
        persona.setEdad(leer.nextInt());
        do {
            System.out.println("Ingrese su sexo: H -> Hombre, M -> Mujer, O -> Otro");
            persona.setSexo(leer.next());
            if (("H").equalsIgnoreCase(persona.getSexo()) || ("M").equalsIgnoreCase(persona.getSexo()) || ("O").equalsIgnoreCase(persona.getSexo())) {              
                System.out.println("Ingrese su peso (en kilogramos):");
                persona.setPeso(leer.nextDouble());
                System.out.println("Ingrese su altura (en metros):");
                persona.setAltura(leer.nextDouble());
                valor = false;
            } else {
                System.out.println("Error: La opción ingresada es incorrecta.");
                valor = true;
            }
        } while (valor);     
        return persona;
    }
    
    public int calcularIMC(Persona persona) {
        double IMC = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        int num;
        if (IMC < 20){
            num = -1;
        } else if (IMC >= 20 && IMC <= 25) {
            num = 0;
        } else {
            num = 1;
        }     
        return num;
    }
    
    public boolean esMayorDeEdad(Persona persona) {
        if (persona.getEdad() < 18) {            
            valor = false;
        } else if (persona.getEdad() >= 18) {           
            valor = true;
        }       
        return valor;
    }
}
