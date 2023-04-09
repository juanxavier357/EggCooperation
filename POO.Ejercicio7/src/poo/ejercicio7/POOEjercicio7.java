/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio7;

import Service.PersonaService;
import Entidad.Persona;

/**
 * Realizar una clase llamada Persona que tenga los siguientes atributos:
 * nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el
 * alumno desea añadir algún otro atributo, puede hacerlo. Los métodos que se
 * implementarán son:  Un constructor por defecto.  Un constructor con todos
 * los atributos como parámetro.  Métodos getters y setters de cada atributo. 
 * Metodo crearPersona(): el método crear persona, le pide los valores de los
 * atributos al usuario y después se le asignan a sus respectivos atributos para
 * llenar el objeto Persona. Además, comprueba que el sexo introducido sea
 * correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
 *  Método calcularIMC(): calculara si la persona está en su peso ideal (peso
 * en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que
 * 20, significa que la persona está por debajo de su peso ideal y la función
 * devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
 * (incluidos), significa que la persona está en su peso ideal y la función
 * devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor
 * que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 *  Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
 * devuelve un booleano. A continuación, en la clase main hacer lo siguiente:
 * Crear 4 objetos de tipo Persona con distintos valores, a continuación,
 * llamaremos todos los métodos para cada objeto, deberá comprobar si la persona
 * está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e
 * indicar para cada objeto si la persona es mayor de edad. Por último,
 * guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
 * distintas variables, para después en el main, calcular un porcentaje de esas
 * 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y
 * cuantos, por encima, y también calcularemos un porcentaje de cuantos son
 * mayores de edad y cuantos menores
 *
 * @Juan xavier
 */
public class POOEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("INGRESE LOS ATRIBUTOS DE LOS USUARIOS");
        PersonaService ps = new PersonaService();

        int numD = 0, numI = 0, numS = 0, menor = 0, mayor = 0;

        System.out.println("Información de la persona 1");
        Persona persona1 = ps.crearPersona();

        System.out.println("Cálculo del IMC de la persona 1:");
        switch (ps.calcularIMC(persona1)) {
            case -1:
                System.out.println("La persona 1 está por debajo de su peso ideal");
                numD++;
                break;
            case 0:
                System.out.println("La persona 1 está en su peso ideal");
                numI++;
                break;
            case 1:
                System.out.println("La persona 1 tiene sobrepeso");
                numS++;
                break;
        }

        System.out.println("¿La persona 1 es mayor o menor de edad?");
        if (ps.esMayorDeEdad(persona1) == true) {
            System.out.println("La persona 1 es mayor de edad");
            mayor++;
        } else {
            System.out.println("La persona 1 es menor de edad");
            menor++;
        }

        System.out.println("");
        System.out.println("Información de la persona 2");
        Persona persona2 = ps.crearPersona();

        System.out.println("Cálculo del IMC de la persona 2:");
        switch (ps.calcularIMC(persona2)) {
            case -1:
                System.out.println("La persona 2 está por debajo de su peso ideal");
                numD++;
                break;
            case 0:
                System.out.println("La persona 2 está en su peso ideal");
                numI++;
                break;
            case 1:
                System.out.println("La persona 2 tiene sobrepeso");
                numS++;
                break;
        }

        System.out.println("¿La persona 2 es mayor o menor de edad?");
        if (ps.esMayorDeEdad(persona2) == true) {
            System.out.println("La persona 2 es mayor de edad");
            mayor++;
        } else {
            System.out.println("La persona 2 es menor de edad");
            menor++;
        }

        System.out.println("");
        System.out.println("Información de la persona 3");
        Persona persona3 = ps.crearPersona();

        System.out.println("Cálculo del IMC de la persona 3:");
        switch (ps.calcularIMC(persona3)) {
            case -1:
                System.out.println("La persona 3 está por debajo de su peso ideal");
                numD++;
                break;
            case 0:
                System.out.println("La persona 3 está en su peso ideal");
                numI++;
                break;
            case 1:
                System.out.println("La persona 3 tiene sobrepeso");
                numS++;
                break;
        }

        System.out.println("¿La persona 3 es mayor o menor de edad?");
        if (ps.esMayorDeEdad(persona3) == true) {
            System.out.println("La persona 3 es mayor de edad");
            mayor++;
        } else {
            System.out.println("La persona 3 es menor de edad");
            menor++;
        }

        System.out.println("");
        System.out.println("Información de la persona 4");
        Persona persona4 = ps.crearPersona();

        System.out.println("Cálculo del IMC de la persona 4:");
        switch (ps.calcularIMC(persona4)) {
            case -1:
                System.out.println("La persona 4 está por debajo de su peso ideal");
                numD++;
                break;
            case 0:
                System.out.println("La persona 4 está en su peso ideal");
                numI++;
                break;
            case 1:
                System.out.println("La persona 4 tiene sobrepeso");
                numS++;
                break;
        }

        System.out.println("¿La persona 4 es mayor o menor de edad?");
        if (ps.esMayorDeEdad(persona4) == true) {
            System.out.println("La persona 4 es mayor de edad");
            mayor++;
        } else {
            System.out.println("La persona 4 es menor de edad");
            menor++;
        }

        System.out.println("");
        System.out.println("Porcentaje de pesos debajo, ideal y sobrepeso:");
        System.out.println((numD * 25) + "% están debajo de su peso");
        System.out.println((numI * 25) + "% están en su peso ideal");
        System.out.println((numS * 25) + "% están en sobrepeso");
        
        System.out.println("");
        System.out.println("Porcentaje de menores y mayores de edad:");
        System.out.println((menor * 25) + "% son menores de edad");
        System.out.println((mayor * 25) + "% son mayores de edad");

    }

}
