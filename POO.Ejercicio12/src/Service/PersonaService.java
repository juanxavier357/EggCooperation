/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author free
 */
public class PersonaService {
    
    Persona persona = new Persona();
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        System.out.println("COMPLETA TUS DATOS");
        System.out.println("Ingrese su nombre:");
        persona.setNombre(leer.next());
        System.out.println("Ingrese su año de nacimiento:");
        int anio = leer.nextInt();
        System.out.println("Ingres su mes de nacimiento:");
        int mes = leer.nextInt();
        System.out.println("Ingrese su día de nacimiento:");
        int dia = leer.nextInt();
        Date fecha = new Date (anio - 1900, mes - 1, dia);
        persona.setFechaNacio(fecha);
        return persona;
    }
    
    public int calcularEdad(){
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - persona.getFechaNacio().getYear();
        System.out.println("Tu edad es: " + edad);
        return edad;
    }
    
    public boolean menorEdad(){
        boolean valor = false;
        System.out.println("Ingrese la edad de otra persona:");
        int edad = leer.nextInt();
        if (calcularEdad() > edad) {
            valor = true;
        }
        System.out.println("¿Tú eres mayor que la otra persona?");
        System.out.println(valor);
        return valor;
    }
    
    public void mostrarPersona(){
        System.out.println("DATOS DE LA PERSONA");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacio());
    }
}
